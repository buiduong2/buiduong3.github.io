public class NhanVien {
    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private double basicSalary;

    public NhanVien() {

    }

    public NhanVien(int id, String name, int age, String phoneNumber, String email, double basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void display() {
        System.out.printf("\n%d\t %-15s %d\t %s \t%-20s %.2f\t\t", id, name, age, phoneNumber, email, basicSalary);
    }

}