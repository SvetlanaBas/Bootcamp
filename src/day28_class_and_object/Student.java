package day28_class_and_object;

public class Student {
    String name;
    int age;
    String major;
    String phone;
    String email;

    public void reads(){
        System.out.println(name + " is reading the book");
    }
    public void writes(){
        System.out.println(name + " is writing");
    }
    public void learns(){
        System.out.println(name + "is learning " + major + " major");
    }
}
