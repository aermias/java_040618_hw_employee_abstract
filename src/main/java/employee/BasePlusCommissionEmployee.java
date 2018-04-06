package employee;

public class BasePlusCommissionEmployee extends CommissionedEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grosssSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    double getEarnings() {
        return this.baseSalary + this.grossSales * (this.commissionRate / 100)
    }

    @Override
    public String toString() {
        return super.toString(
                "grossSales=" + grossSales +
                        ",\n  commissionRate=" + commissionRate +
                        ",\n  baseSalary=" + baseSalary

    }
