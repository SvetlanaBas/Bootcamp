package day34_polymorphism;

public class Student extends  Person{
    private String studentId;

    public Student(String name, String email, String studentId) {
        super(name, email);
        this.studentId = studentId;
    }

    @Override
    public void work() {
        System.out.println("Student is not working he is a student!!!!");
    }

    public void helloFromStudent(){
        System.out.println("Hey i'm a student how are you doing?");
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}


