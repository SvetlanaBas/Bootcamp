package day31_encapsulation;

public class Employee {
    private String name;
    private String employeeID;
    private double basicSalary;
    private double bonusPercentage;

    public Employee() {
        this.name = "Unknown";
        this.employeeID = "000";
        this.basicSalary = 0.0;
        this.bonusPercentage = 0.0;
    }

    public Employee(String name, String employeeID, double basicSalary, double bonusPercentage) {
        this.name = name;
        this.employeeID = employeeID;
        this.basicSalary = basicSalary;
        this.bonusPercentage = bonusPercentage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }


    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }


    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }


    public double calculateGrossSalary() {
        return basicSalary + (basicSalary * bonusPercentage / 100);
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus Percentage: " + bonusPercentage);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}


