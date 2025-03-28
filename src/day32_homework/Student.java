package day32_homework;

public class Student extends Person{
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void study() {
        System.out.println("Studying");
    }

    public void getStudentId() {
        System.out.println("My student Id is " + studentId);
    }
}
