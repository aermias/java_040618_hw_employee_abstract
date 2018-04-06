package employee;

public abstract class Employee {
    private static int count = 0;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    abstract double getEarnings();

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        count++;

        System.out.printf("Constructed employee %s %s |  count=%d%n", firstName, lastName, count);
    }

    public static int getCount() { return count; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    // @Override
    public String toString(String extraKeys) {
        if (extraKeys.length() > 0) extraKeys = ",\n  " + extraKeys;
        return this.getClass().getSimpleName() + '{' +
                "\n  firstName='" + firstName + '\'' +
                ",\n  lastName='" + lastName + '\'' +
                ",\n  socialSecurityNumber='" + socialSecurityNumber + '\'' +
                extraKeys + '\n' +
                '}';
    }
}
