package employee;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee hEmployee = new HourlyEmployee("Jane", "Jones", 40.00, 200, "HelpDesk Technician");
        System.out.println(hEmployee.printEmployeeProfile());

        System.out.println("=====================================================================================================");

        Employee employeeOne = new Employee("Mike", "Jones", "123-45-6789", 100000, "Software Developer");
        employeeOne.setBonus(200);
        System.out.println(employeeOne.printEmployeeProfile());
    }
}
