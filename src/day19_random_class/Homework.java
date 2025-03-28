package day19_random_class;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {

        /*  int[] array = new int[10];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,100);
        }

        System.out.println("Original Array:");
        printArray(array);

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

         //

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) + 10;
        }

        int target = random.nextInt(41) + 10;

        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println("Target: " + target);

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Target found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Target not found in the array.");
        }

         */



        int[] array = new int[30];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);
        }

        int randomIndex = random.nextInt(array.length);
        int chosenValue = array[randomIndex];


        int count = 0;
        for (int value : array) {
            if (value == chosenValue) {
                count++;
            }
        }

        System.out.println("The value " + chosenValue + " occurs " + count + " times in the array.");
    }
}
