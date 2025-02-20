package day13_while_loop;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }

        int number = 1;
        while (number <= 10) {
            System.out.println("Good morning");
            number++;
        }

        int number = 1;
        while (number <= 31) {
            System.out.println(number + " January 2023");
            number++;
        }

        Scanner scanner = new Scanner(System.in);
        String text = "";
        while (! text.equalsIgnoreCase("exit")) {
            System.out.println("enter a exit");
            text = scanner.next();


            Scanner scanner = new Scanner(System.in);
            String text = "";

            while (!text.equalsIgnoreCase("exit")) {
                System.out.print("enter an exit: ");

                text = scanner.next();

                if (text.equals("exit")){
                    System.out.println("Finally you entered exit!!!");
                }
            }

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != 10) {
            System.out.println("Enter any number");
            number = scanner.nextInt();
            if (number == 10) {
                System.out.println("Finally you entered 10");
            }

        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while (number % 2 != 0 ) {
            System.out.println("Enter even number");
            number = scanner.nextInt();
            if (number %2 ==0 ) {
                System.out.println("Finally you entered even number");
            }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();

        int index = 0;
        while (index < userInput.length()) {
            System.out.println(userInput.charAt(index));
            index++;
    }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.next();
        int i = 0;
        while (i < word.length()) {
            char currentLetter = word.charAt(i);
            System.out.println(currentLetter);
            i++;
        }

         */
        int sum = 0;
        int number = 1;
        while (number <= 20) {
            if (number % 2 == 0) {
                sum = sum + number;
            }
            number++;
        }
        System.out.println("The sum of between 1 and 20 is " + sum);


    }
}
