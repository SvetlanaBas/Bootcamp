package day31_encapsulation;

public class TestEmployee {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        System.out.println("Default Employee Details:");
        emp1.displayEmployeeDetails();

        System.out.println();


        Employee emp2 = new Employee("John Doe", "E123", 50000, 10);
        System.out.println("Parameterized Employee Details:");
        emp2.displayEmployeeDetails();
    }
}

