package day33_inheritance_practice;

public class TestPerson {
    public static void main(String[] args) {
        Employee emp = new Employee("Mark Lee", 30, 80000);
        emp.displayInfo();

        System.out.println();

        Student s = new Student("Anna Lee", 18, "Soleado acadamy");
        s.displayInfo();
    }
}
