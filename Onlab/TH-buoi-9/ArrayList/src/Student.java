import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    Scanner sc = new Scanner(System.in);

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input() {
        System.out.println("Nhập tên : ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.valueOf(sc.nextLine());
    }

    public String toString() {
        return "Name123: " + name + "\tAge: " + age;
    }
}
