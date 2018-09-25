package company;

public class Main {
    public static void main(String[] args) {
      Employee salariedEmployee = new SalariedEmployee("John", "Smith", 123456, 1000);
      Employee commissionedEmployee = new CommissionedEmployee("Jane", "Jones", 1234567, 50, 60);
      Employee basePlusEmployee = new BasePlusEmployee("Mike", "Jones", 12345678, 60, 50, 1000);
      Employee hourlyEmployee = new HourlyEmployee("Jeff", "Jones", 123456789, 40, 9);

//        Employee[] array = new Employee[] {john, jane, mike, jeff};
//        String[] stringArray = {"The SalariedEmployee earned ", "The CommisionedEmployee earned ", "The BasePlusCommisionEmployee "};
//
//        for(Employee e : array){
//            System.out.println("The " + e.getClass().getSimpleName() + " earned " + e.payCheck());
//        }

        System.out.println(basePlusEmployee.printEmployeeFullName(basePlusEmployee));
//        System.out.println(basePlusEmployee.bonusAlert(basePlusEmployee));
    }
}
