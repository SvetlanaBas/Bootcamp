package day31_encapsulation;

public class Student {
    private String name;
    private int age;
    private char grade;


    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 5 || age < 25) {
            this.age = age;
        } else {
            System.out.println("Incorrect age");
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){
            this.grade = grade;
        }
        else {
            System.out.println("Incorrect grade");
        }
    }

}
