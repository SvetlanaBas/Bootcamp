package day9_logical_operators;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*  String username = "admin123";
        String password = "pass123";
        System.out.print("Enter your username: ");
        String userInput = scanner.next();
        System.out.print("Enter your password: ");
        String userPassword = scanner.next();
        if (userInput.equals(username) && password.equals(userPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }



        System.out.print("Enter email: ");
        String email = scanner.next();
        if (email.contains("@") && email.contains(".com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }


        System.out.print("Enter the day: ");
        String day = scanner.next();
        if (day.equals("Saturday") || day.equals("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }


        System.out.print("Enter the day: ");
        String day = scanner.next();
        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }


         */
        System.out.print("Enter the first number: ");
        Double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        Double number2 = scanner.nextDouble();
        System.out.print("Choose arithmetical operator (+,-,*,/): ");
        String operator = scanner.next();
        char op = operator.charAt(0);
        if (op == '+')  {
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        } else if (op == '-') {
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        } else if (op == '*') {
            System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        } else if (op == '/') {
            if (number2 != 0) {
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        } else {
            System.out.println("Invalid operator");
        }
        }
    }
}
