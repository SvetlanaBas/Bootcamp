package day33_inheritance_practice;

public class Student extends Person {
    private String schoolName;

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void displayStudentInfo() {
        displayInfo();
        System.out.println("School Name: " + schoolName);
    }
}
