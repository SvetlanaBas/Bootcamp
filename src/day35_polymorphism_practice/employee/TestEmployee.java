package day35_polymorphism_practice.employee;

public class TestEmployee {
    public static void main(String[] args) {

        Employee emp = new Employee("John Doe", 50000, 101, "HR");
        System.out.println("Employee Pay: " + emp.calculatePay());

        HourlyEmployee hourlyEmp = new HourlyEmployee("Jane Smith", 0, 102, "Tech", 20);
        hourlyEmp.updateHoursWorked(40);
        System.out.println("Hourly Employee Pay: " + hourlyEmp.calculatePay());

        Manager mgr = new Manager("Alice Johnson", 70000, 103, "Sales", 5, 2000);
        mgr.displayManagerInfo();
    }
}
