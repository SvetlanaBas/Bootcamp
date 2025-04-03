package day42_white_board;

import java.util.Scanner;

public class Main5 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter a letter: ");
        String inputLetter = scanner.nextLine();


        char letter = inputLetter.charAt(0);

        int counter = -1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                counter++;
            }

        }
        System.out.println(counter + " " + letter + " extra letters");
    }
}


