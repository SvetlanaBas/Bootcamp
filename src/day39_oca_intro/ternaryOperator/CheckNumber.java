package day39_oca_intro.ternaryOperator;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String divisible = number % 5 == 0 ? "Yes" : "No";

        System.out.println("Output: " + divisible);
    }
}

