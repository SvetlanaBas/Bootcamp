package day39_oca_intro.ternaryOperator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = number % 2 == 0 ? "Even" : "Odd";

        System.out.println("Output: " + result);
    }
}
