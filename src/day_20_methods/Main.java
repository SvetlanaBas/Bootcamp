package day_20_methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    public static void helloHowAreYou() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world!!!!!");
        }
    }

    public static void takeWordAndPrintIt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.next();
        System.out.print("Enter a number: ");
        int numberOfIterations = scanner.nextInt();

        for (int i = 0; i < numberOfIterations; i++) {
            System.out.println(input);
        }
    }


    public static void main(String[] args) {
    mymethod();
}
    public static void mymethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.next();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }

     */


    // create a method for reversing string
// in this method you should take an input from user
// input type must be string
// and then print reversed input!

   /* public static void main(String[] args) {
        mymethod();
    }
    public static void mymethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();

        String reversed = "";
        for (int i = word.length() -1; i >= 0; i--) {
            char letter = word.charAt(i);
            reversed = reversed + letter;
        }
            System.out.print(reversed);
        }

    */


    // create another method
// in this method create an empty array with size 10
// assign random numbers in range (10 - 80)
// print this array by using Arrays.toString()
// create another loop check if element is less than 40
// replace it with -1
// and print updated array again!!!

    public static void main(String[] args) {
        mymethod();
    }
    public static void mymethod (){
        Random random = new Random();
        int [] numbers = new int [10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10,80);
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 40 ) {
                numbers[i] = -1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
    }

