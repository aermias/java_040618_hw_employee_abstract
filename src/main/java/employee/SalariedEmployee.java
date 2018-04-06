package employee;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber);
        this.salary = salary;
    }

    double getEarnings() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString("salary=" + salary);
    }
}
