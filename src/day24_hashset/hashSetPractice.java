package day24_hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class hashSetPractice {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        printIntersection();
        printIntersection2();
    }
    public static void task1(){
        ArrayList<String> animals = new ArrayList<>(List.of("dog", "cat", "dog", "bird", "bird", "fish"));
        HashSet<String> hashAns = new HashSet<>();
        hashAns.addAll(animals);
        System.out.println(hashAns);
    }
///
    public static void task2() {
        HashSet<Integer> numbers = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> numbers2 = new HashSet<>(List.of(4, 5, 6, 7, 8));
        HashSet<Integer> numsall = new HashSet<>(numbers2);
        numsall.addAll(numbers);
        System.out.println(numsall);
    }

    ///
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word: ");
        HashSet<String> inputs = new HashSet<>();
        inputs.add(scanner.next());
        System.out.println("Enter the second word: ");
        inputs.add(scanner.next());
        System.out.println("Enter the third word: ");
        inputs.add(scanner.next());
        System.out.println("Enter the fourth word: ");
        inputs.add(scanner.next());
        for (String word : inputs) {
            System.out.println(word);
        }
    }
    public static void printIntersection() {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(4, 5, 6, 7, 8));

        HashSet<Integer> intersection = new HashSet<>();

        for (Integer num : set1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }
        System.out.println(intersection);
    }

    public static void printIntersection2() {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(4, 5, 6, 7, 8));

        HashSet<Integer> intersection = new HashSet<>();

        for (Integer num1 : set1) {
            for (Integer num2 : set2) {
                if (num1 == num2) {
                    intersection.add(num2);
                }
            }
        }
        System.out.println(intersection);
    }
}
