package day30_constuctors;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width) {
        this.width = width;
        this.height = 1;
    }
    public double calculateArea(){
        return width * height;
    }
}
