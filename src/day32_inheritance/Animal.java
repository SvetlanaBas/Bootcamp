package day32_inheritance;

public class Animal {
    private String color;
    private String name;
    private int age;

    public Animal(String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }


    public void sayHi() {
        System.out.println(name + " Hi how are you ?");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        this.age = age;
    }
}

