public class KiemChungVien extends NhanVien {
    private int numberOfErrorsDetected;

    public KiemChungVien() {
    }

    public KiemChungVien(int id, String name, int age, String phoneNumber, String email, double basicSalary,
            int numberOfErrorsDetected) {
        super(id, name, age, phoneNumber, email, basicSalary);
        this.numberOfErrorsDetected = numberOfErrorsDetected;
    }

    public int getNumberOfErrorsDetected() {
        return numberOfErrorsDetected;
    }

    public void setNumberOfErrorsDetected(int numberOfErrorsDetected) {
        this.numberOfErrorsDetected = numberOfErrorsDetected;
    }

    public double getSalary() {
        return super.getBasicSalary() + numberOfErrorsDetected * 50000;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%s\t %.2f", numberOfErrorsDetected, getSalary());
    }
}
