package day9_logical_operators;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        scanner.close();

        if (!username.isEmpty() && Character.isLetter(username.charAt(0)) && username.length() >= 5) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }


        System.out.print("Enter a word: ");
        String word = scanner.nextLine().trim();

        if (word.isEmpty()) {
            System.out.println("Please enter a valid word.");
        } else {
            String lowerWord = word.toLowerCase();

            if (lowerWord.startsWith(String.valueOf(lowerWord.charAt(lowerWord.length() - 1)))) {
                System.out.println("Starts and Ends with same letter");
            } else {
                System.out.println("Different start and end");
            }

        }
    }
}

