package day31_encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Bob", 10, 'A');
        student.setName("Bob");
        student.setAge(20);
        student.setAge(30);
        student.setGrade('A');
        student.setGrade('G');
        student.displayInfo();
    }
}

