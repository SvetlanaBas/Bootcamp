package day28_class_and_object;

public class Employee {
    String fullName;
    String DOB;
    int age;
    String placeOfBirth;
    int phoneBook;

    public void degree(){
        System.out.println(fullName + " has diploma");
    }

    public void openAvailability(){
        System.out.println(fullName + " has full time availability");
    }
    public void printInfo() {
        System.out.println("fullname = " + fullName);
        System.out.println("DOB = " + DOB);
        System.out.println("age = " + age);
        System.out.println("place of birth = " + placeOfBirth);
        System.out.println("phone book = " + phoneBook);
    }
}
