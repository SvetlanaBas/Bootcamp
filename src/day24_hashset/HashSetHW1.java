package day24_hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetHW1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        HashSet<Integer> numbers = new HashSet<>(List.of(1, 2, 3, 4, 5));
        boolean check1 = numbers.isEmpty();
        numbers.clear();
        boolean check2 = numbers.isEmpty();

        System.out.println(check1);
        System.out.println(check2);
    }

    ///
    public static void task2() {
        HashSet<String> words = new HashSet<>(List.of("apple", "banana", "grape", "kiwi", "mango", "orange", "peach", "plum", "berry", "melon"));
        System.out.println("Original HashSet: " + words);
        boolean containsApple = words.contains("apple");
        System.out.println("Does the HashSet contain 'apple'? " + containsApple);
        words.removeIf(word -> word.length() > 5);
        System.out.println("HashSet after removing words with length > 5: " + words);
    }

    /// /
    public static void task3() {
        int[] numbers = {1, 2, 3, 4, 5, 3, 2, 1};
        HashSet<Integer> numberSet = new HashSet<>();
        for (int num : numbers) {
            numberSet.add(num);
        }
        System.out.println("HashSet: " + numberSet);
        Integer[] numberArray = numberSet.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(numberArray));
        System.out.println("Size of HashSet: " + numberSet.size());
    }

    /// //
    public static void task4() {
        HashSet<String> cities = new HashSet<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Berlin");
        cities.add("Sydney");
        cities.add("Dubai");

        String cityToCheck = "Paris";
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " is present in the HashSet.");
        } else {
            System.out.println(cityToCheck + " is not present in the HashSet.");
        }

        cities.remove(cityToCheck);
        System.out.println(cityToCheck + " has been removed from the HashSet.");

        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " is present in the HashSet.");
        } else {
            System.out.println(cityToCheck + " is not present in the HashSet.");
        }
    }
}

