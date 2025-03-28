package day38_exception.workable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Alice", 40, 5);
        Developer developer = new Developer("Bob", 30, 100);
        ArrayList<Workable> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(developer);

        for (Workable employee : employees) {
            try {
                employee.doWork();
            } catch (WorkException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Work session ended!");
            }
        }
    }
}
