package day32_practice;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}
