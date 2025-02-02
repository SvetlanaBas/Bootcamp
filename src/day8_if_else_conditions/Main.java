package day8_if_else_conditions;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.next();

        if (username.equals("user123")) {
            System.out.println("you're good to sign in");
        } else {
            System.out.println("Access denied!!!!!!!!!!");
        }

// Relational operators
// >= >
// <= <
// == !=


        System.out.print("Enter a first number: ");
        int inputNumber1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int inputNumber2 = scanner.nextInt();

        if (inputNumber1 % inputNumber2 == 0) {
            System.out.println(inputNumber1 + " is divisible by " + inputNumber2);
        } else {
            System.out.println(inputNumber1 + " is not divisible by " + inputNumber2);
        }
    }
}
