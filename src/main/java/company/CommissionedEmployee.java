package company;

public class CommissionedEmployee extends Employee {
    public int grossSales;
    public int commissionRate;

    public CommissionedEmployee(String firstName, String lastName, double employeeID, int grossSales, int commissionRate){
        super(firstName, lastName, employeeID);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    @Override
    public int payCheck(){
        return commissionRate * grossSales;
    }
}
