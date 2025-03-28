package day32_practice;

public class Shape {
    private String name;
    private String color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing the shape");
    }
}
