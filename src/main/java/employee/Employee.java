package employee;

public class Employee {
    private String firstName;
    private String lastName;
    private final long socialSecurityNumber;
    private long salary;
    private String title;
    private long bonus;

    public Employee(String firstName, String lastName, long socialSecurityNumber, long salary, String title){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
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

    public long getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public void setSalary(long s){
        this.salary = s;
    }

    public double getSalary(){
        return salary;
    }

    public void setTitle(String t){
        this.title = t;
    }

    public String getTitle(){
        return title;
    }

    public void setBonus(long b){
        this.bonus = b;
    }

    public long getBonus(){
        return bonus;
    }

    public long payCheck(){
        return bonus + salary;
    }

    public String printEmployeeProfile(){
       return "Employees's Full Name: " + firstName + " " + lastName + "\n" + "Employee's Salary: $" + salary + "\n" + "Employee's Title: " + title + "\n" + "Employee salary after bonus is : $" + payCheck();
    }
}
