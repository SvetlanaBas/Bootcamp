package day12_for_loop_practice;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (i % 2 == 0) {
                result += Character.toUpperCase(ch);
            } else {
                result += Character.toLowerCase(ch);
            }
        }

        System.out.println("Output: " + result);
    }


}
