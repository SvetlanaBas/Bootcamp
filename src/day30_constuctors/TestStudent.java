package day30_constuctors;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "Sophomore");
        Student student2 = new Student("Bob", 18);
        student1.displayInfo();
        student2.displayInfo();
    }
}
