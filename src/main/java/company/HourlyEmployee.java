package company;

public class HourlyEmployee extends Employee {
    public int hours;
    public int wagePerHour;

    public HourlyEmployee(String firstName, String lastName, int employeeID, int hours, int wagePerHour){
        super(firstName, lastName, employeeID);
        this.hours = hours;
        this.wagePerHour = wagePerHour;
    }

    @Override
    public int payCheck(){
        return wagePerHour * hours;
    }
}
