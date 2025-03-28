package day30_constuctors;

public class Student {
    String name;
    int age;
    String gradeLevel;

    public Student(String name, int age, String gradeLevel) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.gradeLevel = "Freshman";
    }

    public void displayInfo() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Grade level = " + gradeLevel);
    }
}
