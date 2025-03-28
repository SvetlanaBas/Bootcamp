package day35_polymorphism_practice.employee;

public class Manager extends Employee {
    private int teamSize;
    private double bonusPerMember;

    public Manager(String name, double baseSalary, int employeeId, String department, int teamSize, double bonusPerMember) {
        super(name, baseSalary, employeeId, department);
        this.teamSize = teamSize;
        this.bonusPerMember = bonusPerMember;
    }

    @Override
    public double calculatePay() {
        return super.getBaseSalary() + (teamSize * bonusPerMember);
    }

    public void displayManagerInfo() {
        System.out.println("Manager: " + super.getName());
        System.out.println("Department: " + super.getDepartment());
        System.out.println("Team Size: " + teamSize);
        System.out.println("Total Pay: " + calculatePay());
    }
}
