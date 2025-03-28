package day35_polymorphism_practice.employee;

public class Employee {
    private String name;
    private double baseSalary;
    private int employeeId;
    private String department;

    public Employee(String name, double baseSalary, int employeeId, String department) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double calculatePay() {
        return baseSalary;
    }

    public double calculatePay(double bonus) {
        return baseSalary + bonus;
    }

    public void applyAnnualRaise(double raisePercent) {
        baseSalary += baseSalary * raisePercent / 100;
    }
}
