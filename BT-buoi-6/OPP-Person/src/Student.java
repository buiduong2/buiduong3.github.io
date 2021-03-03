public class Student extends Person {
    private int id;
    private double CPA;
    private String email;

    public Student() {

    }

    public Student(int id, String name, String gender, String address, String DOB, double CPA, String email) {
        super(name, gender, address, DOB);
        this.id = id;
        this.CPA = CPA;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCPA() {
        return CPA;
    }

    public void setCPA(double CPA) {
        this.CPA = CPA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void input() {
        System.out.print("Hãy điền mã sinh viên: ");
        id = Integer.valueOf(sc.nextLine());

        super.input();

        System.out.print("Hãy điền điểm trung bình: ");
        CPA = sc.nextDouble();

        System.out.print("Hãy điền vào địa chỉ email: ");
        email = sc.next();
    }

    @Override
    public void display() {
        System.out.printf("%3d\t", id);
        super.display();
        System.out.printf("%-10.2f %-15s\n", CPA, email);
    }
}
