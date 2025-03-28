package day30_constuctors;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5,3);
        Rectangle rect2 = new Rectangle(4);
        System.out.println(rect1.calculateArea());
        System.out.println(rect2.calculateArea());
    }
}
