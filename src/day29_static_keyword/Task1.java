package day29_static_keyword;

public class Task1 {
    public static void main(String[] args) {
        testStudent();
        Student.schoolName = "Ridgecrest Intermediate";
        testStudent();
    }

    public static void testStudent() {
        Student firstStudent = new Student();
        firstStudent.name = "Lola";
        firstStudent.age = 19;
        firstStudent.grade = 11;
        firstStudent.printInfo();
        firstStudent.study();
        firstStudent.read();

        Student secondStudent = new Student();
        secondStudent.name = "Kayle";
        secondStudent.age = 12;
        secondStudent.grade = 6;
        secondStudent.printInfo();
        secondStudent.study();
        secondStudent.read();
    }
}

