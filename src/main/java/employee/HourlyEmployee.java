package employee;

public class HourlyEmployee extends Employee implements IPayable {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    double getEarnings() {
        return this.hours * this.wage;
    }

    @Override
    public String toString() {
        return super.toString(
                "wage=" + wage +
                        ",\n  hours=" + hours
        );
    }
}
