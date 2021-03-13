import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private String position;
    private String address;
    private double salary;
    Scanner sc = new Scanner(System.in);

    public Employee() {

    }

    public Employee(String id, String name, String position, String address, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.address = address;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        System.out.print("Nhập mã Nhân viên: ");
        id = sc.next();
        sc.nextLine();

        System.out.print("Nhập tên nhân viên: ");
        name = sc.nextLine();

        System.out.print("Nhập chức vụ nhân viên: ");
        position = sc.nextLine();

        System.out.print("Nhập địa chỉ nhân viên: ");
        address = sc.nextLine();

        System.out.print("Nhập lương của nhân viên: ");
        salary = Double.valueOf(sc.nextLine());
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + position + " | " + address + " | " + salary;
    }
}
