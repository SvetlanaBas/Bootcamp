package day10_character_class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Enter a char value : ");
        char symbol = scanner.next().charAt(0);

        boolean isDigit = Character.isDigit(symbol);
        if (isDigit) {
            System.out.println("You entered digit");
        } else {
            System.out.println("You didn't enter a digit!!!");
        }




        System.out.print("Enter a first letter : ");
        char symbol = scanner.next().charAt(0);

        boolean isLetter = Character.isLetter(symbol);
        if (isLetter) {
            System.out.println("You entered " + symbol +  " letter");
        } else {
            System.out.println("You didn't enter a letter!!!");
        }


        System.out.println("Enter the letter");
        char symbol = scanner.next().charAt(0);

        if (Character.isDigit(symbol)) {
            if (symbol == '9') {
                System.out.println("You entered 9");
            } else {
                System.out.println("You entered another number");
            }
        } else {
            System.out.println("You entered another value!!!!");
        }



        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        // Ensure input is not empty
        if (!userInput.isEmpty()) {
            char firstChar = userInput.charAt(0);

            // Check if the first character is a letter
            if (Character.isLetter(firstChar)) {

                if (Character.isUpperCase(firstChar)) {
                    System.out.println("The first character is an uppercase letter.");
                } else {
                    System.out.println("The first character is a lowercase letter.");
                }
            }

            // Check if it's a digit
            else if (Character.isDigit(firstChar)) {
                System.out.println("The first character is a digit.");
            }


            // Otherwise, it's a special character
            else {
                System.out.println("The first character is a special character.");
            }

        } else {
            System.out.println("No input provided.");
        }

        System.out.println("Enter the letter");
        char letter = scanner.next().charAt(0);

        char uppercased = Character.toUpperCase(letter);
        System.out.println("Entered value: " + letter);
        System.out.println("New value: " + uppercased);

        letter = Character.toUpperCase(letter);

        System.out.println("Another new value " + letter);

         */

        System.out.println("Please enter a word");
        char letter = scanner.next().charAt(0);
        if (Character.isLowerCase(letter)) {
            System.out.println(Character.toUpperCase(letter));
        } else {
            System.out.println(Character.toLowerCase(letter));

        }

    }
}
