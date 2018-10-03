package newcompany;

public class CommissionedEmployee extends Employee implements IPayable {

    public String pay(){
        return "I make $1000 dollars every week.";
    }
}
