package day21_return_type_methods;

import java.util.Scanner;

public class Homework1 {
    /*
    public static void printHello(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("hello");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printHello(n);
    }
    ////

    public static void main(String[] args) {
        convertToLowerCase("Codewise Chicago");
        convertToLowerCase("THE BEST PLACE TO STUDY");
    }

    public static void convertToLowerCase(String input) {
        String result = input.toLowerCase().replace('e', 'a');
        System.out.println(result);
    }
    ////

    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int input = 5;
        int result = calculateFactorial(input);
        System.out.println("Input : " + input);
        System.out.println("Output : " + result);
    }
    ////
     */
    public static int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

        int output = calculatePower(base, exponent);
        System.out.println("Output: " + output);
    }
}





