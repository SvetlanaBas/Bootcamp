package day32_practice;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", "Red", 5.0);
        circle.draw();
        circle.calculateArea();

        Rectangle rectangle = new Rectangle("Rectangle", "Blue", 4.0, 6.0);
        rectangle.draw();
        rectangle.calculateArea();
    }
}
