package day28_class_and_object;

public class Rectangle {
    double width;
    double length;


    public void calculateArea() {
        double area = length * width;
        System.out.println("Area = " + area);
    }


    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter = " + perimeter);
    }
}
