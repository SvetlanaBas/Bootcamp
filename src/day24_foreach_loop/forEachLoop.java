package day24_foreach_loop;

import java.util.ArrayList;
import java.util.Arrays;

public class forEachLoop {

    public static void main(String[] args) {
        findMax();
        calculateNumbers();
        converting();
        printEvenNumbers();
        arrayListEx();
        arrayEx();
    }

    public static void arrayListEx() {
        ArrayList<Integer> testing = new ArrayList<>();
        testing.add(1);
        testing.add(12);
        testing.add(13);
        testing.add(14);
        testing.add(15);

        for (Integer someName : testing) {
            if (someName > 10) {
                System.out.println(someName);
            }
        }
    }

    public static void arrayEx() {
        String[] words = {"Hello", "Hi", "How are you"};
        System.out.println("Prev values -> " + Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 5) {
                words[i] = "Codewise";
            }
        }

        System.out.println(Arrays.toString(words));
    }

    public static void calculateNumbers() {
        int[] numbers = {5, 10, 1, 20, 25};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);
    }

    public static void converting() {
        String[] words = {"hello", "world", "java", "programming"};
        for (String word : words) {
            System.out.println(word.toUpperCase());
        }
    }

    public static void printEvenNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void findMax() {
        int[] numbers = {12, 4, 19, 33, 5};
        int max = numbers[0]; // Initialize max with first element to avoid 0 default issue

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximum: " + max);
    }
}

