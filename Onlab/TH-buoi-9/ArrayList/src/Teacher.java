import java.util.Scanner;

public class Teacher {
    private String name;
    private int age;
    private String address;
    private int yearOfTeaching;
    Scanner sc = new Scanner(System.in);

    public Teacher() {

    }

    public Teacher(String name, int age, String address, int yearOfTeaching) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.yearOfTeaching = yearOfTeaching;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearOfTeaching() {
        return yearOfTeaching;
    }

    public void setYearOfTeaching(int yearOfTeaching) {
        this.yearOfTeaching = yearOfTeaching;
    }

    public void input() {
        System.out.println("Nhập tên : ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập vào địa chỉ: ");
        address = sc.nextLine();
        System.out.println("Nhập vào năm giảng dạy: ");
        yearOfTeaching = Integer.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return "|" + name + "|" + age + "|" + address + "|" + yearOfTeaching;
    }
}
