package employee;

public class Main {
    public static void main(String[] args) {
        Employee hourBoy = new HourlyEmployee("hr", "boy", "123", 10, 40);
        Employee salaryGirl = new SalariedEmployee("sal", "girl", "345", 500);
        Employee commishGuy = new CommissionedEmployee("commish", "guy", "567", 2400, 25);
        Employee commishGal = new BasePlusCommissionEmployee("commish", "gal", "789", 3000, 20, 100);

        Invoice bill = new Invoice("1", "first invoice", 3, 10);

        System.out.println(bill.getPaymentAmount());

        Employee[] employees = new Employee[]{hourBoy, salaryGirl, commishGuy, commishGal};
        for (Employee e : employees) {
            System.out.println(e.getPaymentAmount());
        }
    }
}
