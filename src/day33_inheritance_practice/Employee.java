package day33_inheritance_practice;

public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


        public void displayEmployeInfo () {
            displayInfo();
            System.out.println("Salary: " + salary);
        }
    }

