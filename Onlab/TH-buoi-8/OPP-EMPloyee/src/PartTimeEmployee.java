public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee() {

    }

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculatorSalary() {
        return workingHours * getPaymentPerHour();
    }

}
