package day34_polymorphism;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person("John", "john@gmail.com");
        Employee employee = new Employee("Mike", "mike@gmail.com", "1");
        Student student = new Student("Alice", "alice@gmail.com", "student1432");

        Person[] people = {person, employee, student};
        for (Person element : people) {
            element.work();
        }
    }
}
