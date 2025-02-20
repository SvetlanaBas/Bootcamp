package day12_for_loop_practice;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*

        System.out.print("Enter a string: ");
        String input = scanner.next();
        boolean allLetters = true;
        for (int i = 0; i <= input.length()-1; i++) {
            if (!Character.isLetter(input.charAt(i))) {
                allLetters = false;
            }
        }
        if (allLetters) {
            System.out.println("All letters");
        }else {
            System.out.println("Contains non-letter characters.");
        }




        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        StringBuilder modifiedSentence = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                modifiedSentence.append('-');
            } else {
                modifiedSentence.append(sentence.charAt(i));
            }
        }

        System.out.println("Modified sentence: " + modifiedSentence);

         */

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int digitCount = 0;
        int specialCharCount = 0;


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetter(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        System.out.println("Digits: " + digitCount);
        System.out.println("Special characters: " + specialCharCount);
    }

}



