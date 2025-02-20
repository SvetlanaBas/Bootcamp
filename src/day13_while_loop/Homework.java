package day13_while_loop;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number;
        System.out.println("Enter numbers:");
        while (true) {
            number = scanner.nextInt();
            count++;
            if (number == 999) {
                break;
            }
            System.out.println("Try again!");
        }
        System.out.println("You entered " + count + " numbers!");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digit number:");
        String number = scanner.next();
        String reversed = "";
        int i = number.length() - 1;

        while (i >= 0) {
            reversed = reversed + number.charAt(i);
            i--;
        }

        System.out.println("Reversed number: " + reversed);
    }

        Scanner scanner = new Scanner(System.in);
        int winterCount = 0, springCount = 0, summerCount = 0, autumnCount = 0;
        int studentCount = 0;

        while (studentCount < 5) {
            System.out.print("Input your birth month: ");
            String month = scanner.nextLine().trim().toLowerCase();

            switch (month) {
                case "december":
                case "january":
                case "february":
                    winterCount++;
                    break;
                case "march":
                case "april":
                case "may":
                    springCount++;
                    break;
                case "june":
                case "july":
                case "august":
                    summerCount++;
                    break;
                case "september":
                case "october":
                case "november":
                    autumnCount++;
                    break;
                default:
                    System.out.println("Invalid month: " + month);
                    continue;
            }
            studentCount++;
        }

        System.out.println("Output: " + winterCount + " in Winter, " + springCount + " in Spring, " +
                summerCount + " in Summer, and " + autumnCount + " in Autumn.");

        */

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int number;

        while (true) {
            System.out.print("Input: ");
            number = scanner.nextInt();
            attempts++;

            if (number % 5 == 0 && number % 9 == 0) {
                System.out.println("Finally done, " + attempts + " attempts.");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}

