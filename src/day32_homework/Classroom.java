package day32_homework;

public class Classroom {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "S12345");
        Teacher teacher = new Teacher("Ms. Smith", 40, "Math");

        student.introduce();
        student.study();
        student.getStudentId();

        System.out.println();

        teacher.introduce();
        teacher.teach();
        teacher.getSubject();
    }
}
