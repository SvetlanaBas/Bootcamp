package day14_break_and_continue;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int validCount = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0 && number % 2 != 0) {
                System.out.println("Stopped! Total valid numbers: " + validCount + ".");
                break;
            }

            if (number > 10 && number % 2 == 0) {
                System.out.println("Skipped!");
                continue;
            }

            validCount++;
            System.out.println("Counted!");
        }

        ///


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Input: ");
            int number = scanner.nextInt();
            sum += number;
            count++;

            if (sum > 200) {
                System.out.println("Stopped! Sum: " + sum + ", Count: " + count + ".");
                break;
            } else {
                System.out.println("Keep going!");
            }
        }
       ///


        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.print("Input: ");
            String color = scanner.nextLine().trim();

            if (color.equalsIgnoreCase("end")) {
                break;
            }

            if (color.toUpperCase().startsWith("R")) {
                System.out.println("Output: Skipped!");
            } else {
                System.out.println("Output: Added!");
                count++;
            }
        }

        System.out.println("Output: Total colors added: " + count);
        ///

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 3 == 0 && number % 7 == 0) {
                System.out.println("Stopped at " + number + "!");
                break;
            } else if (number % 3 == 0) {
                continue;
            } else {
                System.out.println("Skipped!");
            }
        }
        ///
        */
        Scanner scanner = new Scanner(System.in);
        int skippedCount = 0;

        while (true) {
            System.out.print("Input: ");
            int number = scanner.nextInt();

            if (number % 10 == 0) {
                System.out.println("Stopped! " + skippedCount + " numbers skipped.");
                break;
            }

            if (number % 2 != 0 && number < 50) {
                System.out.println("Skipped!");
                skippedCount++;
            }
        }

    }
}
