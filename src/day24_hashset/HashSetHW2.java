package day24_hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class HashSetHW2 {
    public static void main(String[] args) {
        /// task1
        HashSet<String> animals1 = new HashSet<>();
        animals1.add("Lion");
        animals1.add("Tiger");
        animals1.add("Elephant");
        animals1.add("Giraffe");
        animals1.add("Zebra");


        HashSet<String> animals2 = new HashSet<>();
        animals2.add("Tiger");
        animals2.add("Elephant");
        animals2.add("Panda");


        animals1.retainAll(animals2);


        System.out.println("Common animals: " + animals1);


        /// task2

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        HashSet<Integer> hashSet = new HashSet<>(arrayList);

        ArrayList<Integer> sortedList = new ArrayList<>(hashSet);

        sortedList.sort(Comparator.reverseOrder());

        System.out.println(sortedList);

        /// task3
        HashSet<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("Australia");
        countries.add("Japan");
        countries.add("Germany");


        HashSet<Integer> nameLengths = new HashSet<>();

        for (String country : countries) {
            nameLengths.add(country.length());
        }

        System.out.println(nameLengths);
    }
}
