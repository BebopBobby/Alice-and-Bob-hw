package newcompany;

public class BasePlusCommissionedEmployee extends CommissionedEmployee implements IPayable, IPrint {
    public String pay(){
        return "I make $2000 dollars plus commission";
    }

    public String printPayCheck(){
        return "I got my paycheck";
    }
}
