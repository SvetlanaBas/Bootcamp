package day17_array;

import java.util.Scanner;

public class ArrayHW2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;
        numbers[3] = 20;
        numbers[4] = 25;

        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }


        int[] numbers1 = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers1[i]);
        }
        numbers1[2] = 7;
        System.out.println("Modified array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Array elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + " : " + array[i]);
        }

        System.out.println("Size of the array: " + array.length);
    }
}

