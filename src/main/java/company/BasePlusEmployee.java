package company;

public class BasePlusEmployee extends CommissionedEmployee {
    public int baseSalary;

    public BasePlusEmployee(String firstName, String lastName, double employeeID, int grossSales, int commissionRate, int baseSalary){
        super(firstName, lastName, employeeID, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public int payCheck(){
        return commissionRate * grossSales + baseSalary;
    }
}
