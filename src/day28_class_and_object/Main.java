package day28_class_and_object;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.age = 21;
        student1.name = "Mike";
        student1.reads();

        Student student2 = new Student();
        student2.age = 25;
        student2.name = "John";
        student2.major = "Computer Science";
        student2.reads();
        student2.learns();

        student1.major = "IT";
        student1.learns();
    }
}
