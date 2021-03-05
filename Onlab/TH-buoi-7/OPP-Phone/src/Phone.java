import java.util.Scanner;

public abstract class Phone {
    private String name;
    private String phoneNumber;
    Scanner sc = new Scanner(System.in);

    public Phone() {

    }

    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void input() {
        System.out.print("Nhập vào tên: ");
        name = sc.nextLine();
        System.out.print("Nhập vào số điện thoại: ");
        phoneNumber = sc.next();
    }

    public String toString() {
        return "Name: " + name + "\tPhone number: " + phoneNumber;
    }

}
