package day34_polymorphism.home_work;

import java.util.ArrayList;
import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numShapes = scanner.nextInt();

        for (int i = 0; i < numShapes; i++) {
            System.out.println("Choose shape type (1 for Rectangle, 2 for Circle): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                shapes.add(new Rectangle(length, width));
            } else if (choice == 2) {
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shapes.add(new Circle(radius));
            } else {
                System.out.println("Invalid choice, skipping.");
            }
        }

        System.out.println("Calculated Areas:");
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }

        scanner.close();
    }
}

