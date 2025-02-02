package day9_logical_operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 0 && age <= 5) {
            System.out.println("Hello from if statement!");
        } else {
            System.out.println("Hello from else statement");
        }


        if (!(age > 0) || age <= 5) {
            System.out.println("Hello from if statement!!!");
        } else {
            System.out.println("Hello from else statement");
        }

        boolean isEmpty = !(34 < 3);

        if (!isEmpty) {
            System.out.println("Hello from if statement!!!");
        } else {
            System.out.println("Hello from else statement");
        }


        }
    }

