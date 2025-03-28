package day29_static_keyword;

public class Student {

    String name;
    int age;
    int grade;
    static String schoolName = "Soleado";

    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("grade = " + grade);
        System.out.println("schoolName = " + schoolName);
    }

    public void study() {
        System.out.println(name + " study history");
    }

    public void read() {
        System.out.println(name + " read book");
    }

}