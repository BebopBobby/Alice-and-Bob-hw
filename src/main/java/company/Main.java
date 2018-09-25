package company;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee john = new SalariedEmployee("John", "Smith", 123456, 1000);
        CommissionedEmployee jane = new CommissionedEmployee("Jane", "Jones", 1234567, 50, 60);
        BasePlusEmployee mike = new BasePlusEmployee("Mike", "Jones", 12345678, 60, 50, 1000);
        HourlyEmployee jeff = new HourlyEmployee("Jeff", "Jones", 123456789, 40, 9);

        Employee[] array = new Employee[] {john, jane, mike, jeff};
        String[] stringArray = {"The SalariedEmployee earned ", "The CommisionedEmployee earned ", "The BasePlusCommisionEmployee "};

        for(Employee e : array){
            System.out.println("The " + e.getClass().getSimpleName() + " earned " + e.payCheck());
        }
    }
}
