package day28_class_and_object;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 5;
        rectangle1.length = 6;
        System.out.println("Rectangle 1");
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println();


        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 2;
        rectangle2.length = 3;
        System.out.println("Rectangle 2");
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
    }
}
