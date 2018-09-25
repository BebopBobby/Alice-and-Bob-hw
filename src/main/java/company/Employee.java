package company;

public class Employee {
    private String firstName;
    private String lastName;
    private double employeeID;

    public Employee(String firstName, String lastName, double employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public int payCheck(){
        return 0;
    }
}
