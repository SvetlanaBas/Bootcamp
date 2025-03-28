package day22_arrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListHW1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        boolean check1 = list.isEmpty();

        list.clear();

        boolean check2 = list.isEmpty();

        System.out.println(check1);
        System.out.println(check2);
    }

    /// ////
    public static void task2() {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Audi");

        cars.remove(0);
        cars.remove(1);

        cars.add("Mercedes");
        cars.add("Tesla");
        cars.add("Nissan");

        System.out.println("The number of cars is: " + cars.size());

        int i = 0;
        while (i < cars.size()) {
            System.out.println(cars.get(i));
            i++;
        }
        cars.removeIf(car -> car.length() < 7);

        System.out.println("The number of cars after removal: " + cars.size());
        for (String car : cars) {
            System.out.println(car);
        }
    }

    /// //

    public static void task3() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(41) + 10);
        }
        System.out.println("Original list: " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 20) {
                numbers.set(i, 0);
            }
        }
        System.out.println("Modified list: " + numbers);
    }
}






