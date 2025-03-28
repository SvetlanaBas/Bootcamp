package day39_oca_intro.ternaryOperator;

import java.util.Scanner;

public class ExamPassCheker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        System.out.print("Enter the score exam: ");
        int score = scanner.nextInt();

        boolean result = score >= 60 ? true : false;

        System.out.println("Output: " + result);
    }
}
