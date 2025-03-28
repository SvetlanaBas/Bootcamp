package day32_practice;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}
