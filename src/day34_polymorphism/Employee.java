package day34_polymorphism;

public class Employee extends Person {

    private String employeeId;

    public Employee(String name, String email, String employeeId) {
        super(name, email);
        this.employeeId = employeeId;
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}

