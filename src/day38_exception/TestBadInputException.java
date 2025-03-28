package day38_exception;

import java.util.Scanner;

public class TestBadInputException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput > 4) {
            throw new BadInputException("Input length exceeds 4 characters!");
        }
    }
}




