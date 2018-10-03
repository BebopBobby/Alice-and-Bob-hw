package newcompany;

public class NewCompanyTest {
    public static void main(String[] args) {
        CommissionedEmployee john = new CommissionedEmployee();
        john.pay();
//        System.out.println(john.pay());

        BasePlusCommissionedEmployee bill = new BasePlusCommissionedEmployee();
        System.out.println(bill.printPayCheck());
        System.out.println(bill.pay());
    }
}
