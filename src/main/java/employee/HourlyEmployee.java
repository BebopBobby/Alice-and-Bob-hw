package employee;

public class HourlyEmployee {
    private String firstName;
    private String lastName;
    private double wage;
    private int hours;
    public String title;

    public HourlyEmployee(String firstName, String lastName, double wage, int hours, String title){
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
        this.hours = hours;
        this.title = title;
    }

    public void setFirstName(String f){
        this.firstName = f;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String l){
        this.lastName = l;
    }

    public String getLastName(){
        return lastName;
    }

    public void setWage(double w){
        this.wage = w;
    }

    public double getWage(){
        return wage;
    }

    public void setHours(int h){
        this.hours = h;
    }

    public int getHours(){
        return hours;
    }

    public double payCheck(){
        return wage * hours;
    }

    public String printEmployeeProfile(){
        return "Employees's Full Name: " + firstName + " " + lastName + "\n" + "Employee's Salary: $" + payCheck() + "\n" + "Employee's Title: " + title;
    }
}
