package day31_encapsulation;

public class Animal {
    private String name;
    private String type;
    private int age;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Animal(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("name = " + name);
        System.out.println("type = " + type);
        System.out.println("age = " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }

    }
}
