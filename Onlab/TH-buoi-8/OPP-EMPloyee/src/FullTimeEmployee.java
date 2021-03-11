public class FullTimeEmployee extends Employee {

    public FullTimeEmployee() {
        
    }

    @Override
    public int calculatorSalary() {
        return 8 * getPaymentPerHour();
    }
}
