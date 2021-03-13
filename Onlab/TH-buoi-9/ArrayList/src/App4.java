
import java.util.ArrayList;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> listTeacher = new ArrayList<>();
        System.out.println("Điền vào số lượng GV: ");
        int n = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Teacher teacher = new Teacher();
            teacher.input();
            listTeacher.add(teacher);
        }
        System.out.println(listTeacher);
        System.out.println("Nhập tên giáo viên muốn xoá: ");
        String name = sc.nextLine();
        sc.close();
        for (Teacher t : listTeacher) {
            if (name.equals(t.getName())) {
                listTeacher.remove(t);
            }
        }
        System.out.println(listTeacher);
    }
}
