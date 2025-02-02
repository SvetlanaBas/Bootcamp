package day7_scanner_class;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence  = scanner.nextLine();

        System.out.print("Enter the word to be replaced: ");
        String oldWord  = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord  = scanner.nextLine();

        String newSentence = sentence.replace(oldWord, newWord);
        System.out.println("Modified sentence: " + newSentence);




    }
}
