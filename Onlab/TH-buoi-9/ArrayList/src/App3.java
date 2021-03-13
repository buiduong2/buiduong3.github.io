import java.util.ArrayList;

public class App3 {
    public static void main(String[] args) {
        ArrayList<Student> lstStudent = new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            student.input();
            lstStudent.add(student);
        }
        // phải dùng toSTring() thì nó mới in ra toSTring();
        for (Student s1 : lstStudent) {
            System.out.println(s1);
        }
        System.out.println(lstStudent);
    }
}
