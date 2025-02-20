package day10_character_class;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Enter word: ");
        String userAnswer = scanner.nextLine();
        char firstChar = userAnswer.charAt(0);

        if (Character.isUpperCase(firstChar)) {
            System.out.println("Starts with Uppercase");
        }
        else {
            System.out.println("Not Uppercase");
        }


        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();
        char firstChar1 = userInput.charAt(0);

        if (Character.isDigit(firstChar1)) {
            System.out.println("Starts with Digit");
        }
        else {
            System.out.println("Does not start with Digit");
        }



        System.out.print("Enter word: ");
        String userWord = scanner.nextLine();
        char firstChar2 = userWord.charAt(0);
        char upperChar = Character.toUpperCase(firstChar2);

        char lastChar = userWord.charAt(userWord.length() - 1);
        char upperChar1 = Character.toUpperCase(lastChar);

        System.out.println("First character is " + upperChar);
        System.out.println("Last character is " + upperChar1);

         */

        System.out.print("Enter character: ");
        String userCharacter = scanner.nextLine();
        if (Character.isLetter(userCharacter.charAt(0))){
            System.out.println();
        }
        else if (Character.isDigit(userCharacter.charAt(0))) {
            System.out.println();
        }
        else {
            System.out.println("Symbol");
        }
    }
}
