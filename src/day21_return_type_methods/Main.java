package day21_return_type_methods;

import org.w3c.dom.ls.LSOutput;

import static java.awt.SystemColor.text;
import static javax.management.Query.value;

public class Main {
    /*
    public static void main(String[] args) {
        String result = printMessage();
        System.out.println(result);
        print10Times(result);

    }

    public static String printMessage() {
        return "Hello world";
    }

    public static void print10Times(String text){
        for (int i = 0; i < 10; i++) {
            System.out.println(text);
        }
    }

    public static void main (String [] args) {
        int sum = result(5,6);
        System.out.println(sum);
    }
    public static int result(int a, int b){
        return a + b;
    }

    public static int findSq(int number) {

        if (number == 5) {
            return 25;
        } else if (number == 10) {
            return 100;
        } else if (number == 7) {
            return 49;
        }
        return 0;
    }




    public static void main (String [] args){
        System.out.println(lager(5,15));
    }
    public static int lager(int a, int b){
        if (a < b){
            return b;
        } else if (a > b){
            return a;
        }
        return 0;
    }



    public static void main (String [] args){
        System.out.println(upperCaseRes("Hello World!"));
    }
    public static String upperCaseRes(String word){
        return word.toUpperCase();
    }



    public static void main(String[] args) {
        System.out.println(evenOrOdd(6));
    }

    public static String evenOrOdd(int number) {

        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }


    public static void main(String[] args) {
        int [] array = {100,2,33,44,5};
        int findMax = largestArray (array);
        System.out.println(value(findMax));
    }
    public static int largestArray (int [] array) {
        int max = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array [i] > max){
                max = array[i];
            }
        }
        return max;
    }
///

    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        double number1 = 10.5;
        double number2 = 20.3;
        double number3 = 30.2;

        double average = calculateAverage(number1, number2, number3);

        System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is: " + average);

     */
    public static void main(String[] args) {
        String reversed = reverseString("Hello, World!");
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String reverse) {
        String backword = "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            backword = backword + reverse.charAt(i);
        }
        return backword;
    }
}







