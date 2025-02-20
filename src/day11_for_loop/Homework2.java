package day11_for_loop;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
/*
        for (int number = 1; number <= 31; number++) {
            System.out.println(number + " March 2023");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start values: ");
        int startNumber = scanner.nextInt();
        System.out.print("Enter the end values: ");
        int endNumber = scanner.nextInt();
        for (int number = startNumber; number <= endNumber; number++) {
            if (number % 3 == 0 || number % 5 == 0) {
                System.out.println(number);
            }

        int sum = 0;
        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        } System.out.println("The sum of even number between 1 to 100 inclusively is : " + sum);

 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = scanner.nextInt();

        for (int number = userNumber-1; number >= 1; number--) {
         userNumber = userNumber * number;
        }
        System.out.println(userNumber);
    }
}
