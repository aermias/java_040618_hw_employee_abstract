package employee;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee hourBoy = new HourlyEmployee("hr", "boy", "123", 10, 40);
        SalariedEmployee salaryGirl = new SalariedEmployee("sal", "girl", "345", 500);
        CommissionedEmployee commishGuy = new CommissionedEmployee("commish", "guy", "567", 2400, 25);
        BasePlusCommissionEmployee commishGal = new BasePlusCommissionEmployee("commish", "gal", "789", 3000, 20, 100);

        Employee[] employees = new Employee[]{hourBoy, salaryGirl, commishGuy, commishGal};
        for (Employee e : employees) System.out.println(e);
    }
}
