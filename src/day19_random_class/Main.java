package day19_random_class;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

/*
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10, 100);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + ", ");
            }
        }



// create an empty array with 10 values
// generate random numbers and assign range(0-20)
// create another array assign there squared values of the previous array
// and print both of them
// Ex: [1,2,3,4,5,6,7,8,9,10]
// Output: [1,4,9,16,25,36,49,64,81,100]

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(0, 20);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= numbers[i];
        }
        System.out.println(Arrays.toString(numbers));


        // create an empty array with 20 values
// generate random numbers and assign range(10-50)
// count how many even, odd numbers are there
// and print sum of all numbers from your array

        int[] array = new int[20];
        int sum = 0;
        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 50);
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("There are " + even + " even numbers here.");
        System.out.println("There are " + odd + " odd numbers here.");
        System.out.println("The sum of all numbers is: " + sum);


 // create an empty array with 10 values
// generate random numbers and assign range(0-100)
// find smallest and highest numbers
// Arrays.sort method is not allowed!!!!


        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(numbers));

        int smallest = numbers[0];
        int highest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }

        System.out.println("Smallest Number: " + smallest);
        System.out.println("Highest Number: " + highest);

 */


    }
    }


