public class LapTrinhVien extends NhanVien {
    private double overtimeHours;

    public LapTrinhVien() {

    }

    public LapTrinhVien(int id, String name, int age, String phoneNumber, String email, double basicSalary,
            double overtimeHours) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getSalary() {
        return super.getBasicSalary() + overtimeHours * 200000;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%s\t %.2f", overtimeHours, getSalary());
    }
}
