package day7_scanner_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Hey enter string value: ");
        String userInput = scanner.nextLine();

        System.out.println("Hey you entered : " + userInput);
        System.out.println("The length :" + userInput.length());
        System.out.println("The first symbol :" + userInput.charAt(0));
        System.out.println("The last symbol :" + userInput.charAt(userInput.length() - 1));


        System.out.print("Enter text: ");
        String word = scanner.next();
        System.out.println("You entered -> " + word);

        System.out.print("Enter decimal number: ");
        double decimalNumber = scanner.nextDouble();
        System.out.print("Enter decimal number: ");
        double decimalNumber1 = scanner.nextDouble();
        System.out.println("sum of two decimals -> " + (decimalNumber + decimalNumber1));


        System.out.print("enter boolean value: ");
        boolean isEmpty = scanner.nextBoolean();
        System.out.println("isEmpty = " + isEmpty);

        System.out.print("Enter integer value1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter integer value2: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter integer value3: ");
        int number3 = scanner.nextInt();
        System.out.println("sum " + (number1 + number2 + number3));

        System.out.print("Enter a char value : ");
        char value = scanner.next().charAt(0);
        System.out.println((int) value);





        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word number: ");
        double number = scanner.nextDouble(); // or any other method, except for nextLine
        System.out.println("You entered -> " + number);

        System.out.print("Enter whole line text -> ");
        scanner.nextLine(); // this scanner will be skipped, an additional one
        String userInput = scanner.nextLine(); // it will work
        System.out.println(userInput);

         */


// Add two Numbers
// take two int inputs from user
// store input values in variables
// print the sum in the format:
// "The sum of X and Y is Z"

     /*   Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

      */

// Calculator
// take two numbers from user
// print in following way
// Output:
// num1 + num2 = res
// num1 - num2 = res
// num1 * num2 = res
// num1 / num2 = res

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Hey user enter first integer number: ");
        int num1 = scanner.nextInt();
        System.out.print("Hey user enter second integer number: ");
        int num2 = scanner.nextInt();
        System.out.println( num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println( num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println( num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println( num1 + " / " + num2 + " = " + (num1 / num2));

         */


        // Discount calculator
// take two decimal numbers from user
// first is original price
// second is discount percentage
// how to find discount amount (price * discountPercentage) / 100
// find final price (price - discountAmount)
// print: Discounted price finalPrice ,savings : discountAmount

      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Hey user enter first decimal number: ");
        double price = scanner.nextInt();
        System.out.print("Hey user enter second decimal number: ");
        double discountPercentage = scanner.nextInt();
        double discountAmount = (price * discountPercentage)/100;
        double finalPrice = price - discountAmount;
        System.out.println("Discount price = " + finalPrice + ',' + "saving" + ':' + discountAmount);

       */

// Name length
// take two inputs from user by using next()
// first should be firstName
// second should be lastName
// get the length of first name and last name, find sum of lengths
// and print result back
// Output: "Total characters in your full name is: " + sumOfFullNameLength

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey user enter first name: ");
        String firstName  = scanner.next();
        System.out.print("Hey user enter last name: ");
        String lastName = scanner.next();
        int lengthOfFullName = (firstName.length() + lastName.length());
        System.out.println("Total characters in your full name is: " + lengthOfFullName);


    }

}
