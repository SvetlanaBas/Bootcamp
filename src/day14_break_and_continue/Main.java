package day14_break_and_continue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter numbers: ");
            int number = scanner.nextInt();
            if (number % 33 == 0) {
                System.out.println("Finally you entered " + number);
                break;
            }

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter numbers: ");
                int number = scanner.nextInt();
                if (number % 33 == 0) {
                    System.out.println("Finally you entered " + number);
                    break;
                }

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a word: ");
                String userInput = scanner.next();
                String response = "";
                int index = 0;

                while (true) {
                    char currentLetter = userInput.toLowerCase().charAt(index); // e
                    if (currentLetter == 'a' || currentLetter == 'o' || currentLetter == 'e' || currentLetter == 'i' || currentLetter == 'u') {
                        index++;
                        String tail = userInput.substring(index);
                        response += tail;
                        break;
                    } else {
                        response += userInput.charAt(index);
                    }
                    index++;
                }
                System.out.println("Response -> " + response);
            }

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                if (number % 6 == 0 && number % 9 == 0) {
                    System.out.println("Finally you entered: " + number);
                    break;
                }
            }


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println("Finally you entered " + input);
                break;




        // Keep asking a number input from user
// find sum of positive numbers
// if user enters negative number
// stop the loop and print the value of sum

        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int number5 ;
        while (true) {
            System.out.println("Enter a number:");
            number5=scanner.nextInt();
            if (number5 >=0) {
                sum += number5;
            }else {
                break;
            }
        }
        System.out.println("Sum of possitive number:" + sum);

         */



        int counter = 1;
        while (true) {
            if (counter == 50) {
                break;
            }
            counter++;
            if (counter % 5 == 0) {
                continue;
            }
            System.out.println("Number: " + counter);
        }
            }
        }









