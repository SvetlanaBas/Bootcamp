package day35_polymorphism_practice.employee;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;
    private double overtimeHours;


    public HourlyEmployee(String name, double baseSalary, int employeeId,
                          String department, double hourlyRate) {
        super(name, baseSalary, employeeId, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculatePay() {
        return (hourlyRate * hoursWorked) + (1.5 * hourlyRate * overtimeHours);
    }

    public void updateHoursWorked(double newHours) {
        this.hoursWorked = newHours;
    }

    public void resetOvertime() {
        this.overtimeHours = 0;
    }
}
