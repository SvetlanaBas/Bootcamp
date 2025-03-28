package day_20_methods;

import java.util.Random;
import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    int[] arrayForTasks = new int[10];
    for (int i = 0; i < 10; i++) {
        arrayForTasks[i] = random.nextInt(10, 100);
    }
    System.out.print("Enter first number: ");
    int firstNum = scanner.nextInt();

    System.out.print("Enter second number: ");
    int secondNumber = scanner.nextInt();


    addition(" Hello ", firstNum, secondNumber, arrayForTasks);
    division(firstNum, secondNumber);
}

    public static void addition(String text, int firstNumber, int secondNumber, int[] array) {
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void division(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }
}
