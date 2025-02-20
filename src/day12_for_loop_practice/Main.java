package day12_for_loop_practice;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userInput = scanner.nextLine();
        for (int i = 0; i < userInput.length(); i++) {
            char currentLetter = userInput.charAt(i);
            System.out.println(i + " " + currentLetter);
        }




        // Count vowels in String
// Take an input from user by using nextLine
// your for loop should work until the length of users input
// and int variable as a counter
// inside your for loop create if statement
// and check each letter for vowels by using ||
// if it is a vowel increment counter by one
// at the end of your program print back amount of vowels in users input
// Ex: Hello
// Output: 2 vowels in Hello

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userInput = scanner.nextLine();
        userInput = userInput.toLowerCase();
        int count = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char currentLetter = userInput.charAt(i);
            if (currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'y' || currentLetter == 'u' || currentLetter == 'i' || currentLetter == 'o') {
                count++;
            }
            }
            System.out.println(count + " vowels in " + userInput);



        // Replace all vowels with * symbol
// Take an input from user by using nextLine
// and replace all vowels with * by using for loop
// replace() method is not allowed!!!!
// Ex: Hello
// Output: H*ll*


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userInput = scanner.nextLine();
        userInput = userInput.toLowerCase();
        String response = "";
        for (int i = 0; i < userInput.length(); i++) {
            char currentLetter = userInput.charAt(i);
            if (currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'y' || currentLetter == 'u' || currentLetter == 'i' || currentLetter == 'o') {

                response += "*";
            } else {
                response += currentLetter;
            }
        }
        System.out.println(response);


// Reversing string
// Take an input from user
// Reverse String by using for loop
// and print the result back
// Ex: Hello
// Output: olleH

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String reversed = "";
        String userInput = scanner.nextLine();
        for (int i = userInput.length() -1; i >= 0; i--) {
            char currentLetter = userInput.charAt(i);
            reversed +=currentLetter;
        }
        System.out.println(reversed);


// Check Palindrome word!
// Take an input from user by using nextLine
// and check is it palindrome or not!
// Ex1
// Input: Civic
// It's a palindrome word

// Ex2
// Input: Hello
// It's not a palindrome word

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userInput = scanner.nextLine().toLowerCase();
        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            char currentLetter = userInput.charAt(i);
            reversed += currentLetter;
        }
        if (userInput.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome word");
        } else {
            System.out.println("It is not a palindrome word");
        }



// Count uppercased and lowercased letters
// Take an input from user by using nextLine
// for loop should work until the last element
// inside for loop create two if statements
// in the first if check is this letter uppercased
// if it is increment uppercaseCounter
// in the second if check is this letter lowercased
// if it is increment lowercasedCounter
// ex:  HeLLo
// 2 LowerCased letter and 3 Uppercased Letters

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String words = scanner.next();
        int upperCase = 0;
        int lowerCase = 0;
        for (int i = 0; i < words.length(); i++) {
            char letters = words.charAt(i);
            if (Character.isUpperCase(letters)) {
                upperCase += 1;
            }
            if (Character.isLowerCase(letters)) {
                lowerCase += 1;
            }
        }
        System.out.println("In your sentence " + upperCase + " upper case letters and " + lowerCase + " lower cases");




        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        int uppercasedCounter = 0;
        int lowercasedCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentLetter = input.charAt(i);
            if (Character.isUpperCase(currentLetter)) {
                uppercasedCounter++;
            }
            if (Character.isLowerCase(currentLetter)) {
                lowercasedCounter++;
            }
        }
        System.out.println("uppercasedCounter = " + uppercasedCounter);
        System.out.println("lowercasedCounter = " + lowercasedCounter);





        // Remove all digits from your text
// Take an input from user by using nextLine
// for loop should work until the last element
// take each character and check is it digit or not
// if it's digit remove it from your text
// and print the result back
// Input: H12e23llo
// output: Hello


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String words = scanner.next();

        String output = "";
        for (int i = 0; i < words.length(); i++) {
            char currentLetter = words.charAt(i);
            if (!Character.isDigit(currentLetter)) {
                output += currentLetter;
            }
        }
        System.out.println("output " + output);

         */

// Calculate the sum of Even and Odd numbers
// Take an input from user by using nextInt
// and calculate the sum of even and odd numbers separately
// Ex: 100
// Sum of even numbers: sumOfEven sum of odd numbers: sumOfOdd

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int userNumbers = scanner.nextInt();
        int even = 0;
        int odd = 0;
        for (int number = 0; number <= userNumbers; number++) {
            if (number % 2 == 0) {
                even += number;
            } else {
                    odd += number;
                }
            }
            System.out.println("The sum of even numbers : " + even + ", the sum of odd numbers : " + odd);
        }
    }



