package day22_arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ArrayListHW2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int sum = 0;


        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(41) + 10;
            numbers.add(num);
            sum = sum + num;
        }

        System.out.println("Generated Numbers: " + numbers);

        System.out.println("Sum of numbers: " + sum);
    }
    /// //


    public static void task2() {
        ArrayList<Double> numbers = new ArrayList<>();
        Random random = new Random();
        double sum = 0;

        for (int i = 0; i < 8; i++) {
            double num = 10 + (40 * random.nextDouble());
            numbers.add(num);
            sum = sum + num;
        }

        double average = sum / numbers.size();

        System.out.println("Generated Doubles: " + numbers);

        System.out.println("Average of numbers: " + average);
    }
    /// //

    public static void task3() {
        ArrayList<String> countries = new ArrayList<>();

        countries.add("USA");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("France");
        countries.add("Japan");
        countries.add("India");
        countries.add("Australia");

        countries.sort(Comparator.naturalOrder());
        System.out.println("Sorted Countries: " + countries);
    }
///
    public static void task4() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(50);
        numbers.add(55);

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        numbers = oddNumbers;

        System.out.println("List after removing even numbers: " + numbers);
    }
}
