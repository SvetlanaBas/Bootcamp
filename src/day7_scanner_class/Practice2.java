package day7_scanner_class;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // Add two Numbers
// take two int inputs from user
// store input values in variables
// print the sum in the format:
// "The sum of X and Y is Z"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();


        int sum = num1 + num2;


        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);


        scanner.close();
    }
}
