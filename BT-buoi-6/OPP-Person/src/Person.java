import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String address;
    private String DOB;
    protected Scanner sc = new Scanner(System.in);

    public Person() {

    }

    public Person(String name, String gender, String address, String DOB) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void input() {
        // Các thông tin chỉ điền vào chứ ko xác định tính đúng sai.
        System.out.print("Hãy điền tên của đối tượng: ");
        name = sc.nextLine();

        System.out.print("Chọn giới tính của đối tượng: 1- Nam | 2 - Nữ | 3 - Không xác định: ");
        switch (Integer.valueOf(sc.nextLine())) {
            case 1:
                gender = "Nam";
                break;
            case 2:
                gender = "Nữ";
                break;
            case 3:
                gender = "Không xác định";
                break;
            default:
                gender = "Null";
        }

        System.out.print("Hãy điền địa chỉ của đối tượng: ");
        address = sc.nextLine();

        System.out.print("Hãy điền ngày sinh của đối tượng: ");
        int date = sc.nextInt();
        System.out.print("Hãy điền tháng sinh của đối tượng: ");
        int month = sc.nextInt();
        System.out.print("Hãy điền năm sinh của đối tượng: ");
        int year = sc.nextInt();
        DOB = date + "/" + month + "/" + year;
    }

    public void display() {
        System.out.printf("%-15s %-10s %-15s %-15s", name, gender, address, DOB);
    }
}
