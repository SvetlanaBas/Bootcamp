package day_20_methods;

import java.util.Random;
import java.util.Scanner;

public class Practice {

    /*

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            addition(num1, num2);
            subtraction(num1, num2);
            multiplication(num1, num2);
            division(num1, num2);

        }public static void addition ( int a, int b){
                int result = a + b;
                System.out.println(a + " + " + b + " = " + result);
            }


            public static void subtraction ( int a, int b){
                int result = a - b;
                System.out.println(a + " - " + b + " = " + result);
            }


            public static void multiplication ( int a, int b){
                int result = a * b;
                System.out.println(a + " * " + b + " = " + result);
            }


            public static void division ( int a, int b){
                if (b != 0) {
                    int result = a / b;
                    System.out.println(a + " / " + b + " = " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            }

     */
    // Take a string in the main by using next method
// create a method that takes a string in params
// in the new method you should print each symbol on the new line

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String userWord = scanner.next();
        printEachCharacter(userWord);
    }

    public static void printEachCharacter(String userWord) {
        for (int i = 0; i < userWord.length(); i++) {
            System.out.println(userWord.charAt(i));
        }
    }
}





