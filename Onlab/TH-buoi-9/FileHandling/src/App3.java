import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class App3 {
    public static void main(String[] args) throws Exception {
        ArrayList<Student> listStudent = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + i);
            Student student = new Student();
            student.input();
            listStudent.add(student);
        }

        File myFile = new File("..\\File\\Student.txt");
        if (myFile.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File is có sẵn");
        }
        FileWriter myWriter = new FileWriter("..\\File\\Student.txt");
        for (Student student : listStudent) {
            myWriter.write(student + "\n");
        }
        System.out.println(myFile.getAbsolutePath());
        myWriter.close();

    }
}
