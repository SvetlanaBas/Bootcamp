package day38_exception;

import java.util.Scanner;

public class TestNegativeAmountException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        deposit(input);
    }

    public static void deposit(double input) {

        if (input < 0) {
            throw new NegativeAmountException("Amount cant be negative!");
        }
    }
}

