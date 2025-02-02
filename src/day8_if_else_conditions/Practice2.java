package day8_if_else_conditions;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Thuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");

        } else {
            System.out.println("Invalid day");
        }

       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age here : ");
        int age = scanner.nextInt();
        if (age <=5) {
            System.out.println("Free ");
        }else if (age <=12) {
            System.out.println("Regular price");
        }else if (age <=60) {
            System.out.println("Senior Discount");
        }else {
            System.out.println("Invalid");

        }

    }
}
