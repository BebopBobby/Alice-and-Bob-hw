package company;

public class Employee {
    private String firstName;
    private String lastName;
    private double employeeID;
    public int bonus;

    public Employee(String firstName, String lastName, double employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }

    public int payCheck(){
        return 0;
    }

    public String bonusAlert(Employee e){
        return e.getClass().getSimpleName() + " received a bonus of " + bonus + " dollars!";
    }

    public String printEmployeeFullName(Employee a){
        return firstName + " " + lastName;
    }
}
