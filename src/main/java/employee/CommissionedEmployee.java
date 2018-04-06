package employee;

public class CommissionedEmployee extends Employee implements IPayable {
    protected double grossSales;
    protected double commissionRate;

    public CommissionedEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    double getEarnings() {
        return this.grossSales * (this.commissionRate / 100);
    }

    @Override
    public String toString() {
        return super.toString(
                "grossSales=" + grossSales +
                        ",\n  commissionRate=" + commissionRate
        );
    }
}
