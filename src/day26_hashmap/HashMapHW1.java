package day26_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapHW1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

        task7();
        task8();
        task9();
    }

    public static void task1() {
        HashMap<String, Integer> employeeAgeMap = new HashMap<>();
        employeeAgeMap.put("John", 40);
        employeeAgeMap.put("Alice", 35);
        employeeAgeMap.put("Bob", 28);

        for (HashMap.Entry<String, Integer> entry : employeeAgeMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + " is " + age + " years old");
        }
    }

    public static void task2() {
        HashMap<String, String> countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");

        for (String capital : countryCapitals.values()) {
            System.out.println(capital);
        }
    }

    ///
    public static void task3() {
        HashMap<String, Double> menu = new HashMap<>();
        menu.put("Burger", 8.99);
        menu.put("Pizza", 12.99);
        menu.put("Pasta", 10.49);
        menu.put("Salad", 6.99);

        double total = 0.0;
        for (double price : menu.values()) {
            total += price;
        }
        double average = total / menu.size();

        System.out.println("The average price of all food items is: " + average);
    }

    ///
    public static void task4() {
        HashMap<String, String> employeeMap = new HashMap<>();
        employeeMap.put("ABC123", "Jack");
        employeeMap.put("DEF456", "Jill");
        employeeMap.put("GHI789", "John");

        for (HashMap.Entry<String, String> entry : employeeMap.entrySet()) {
            String employeeId = entry.getKey();
            String employeeName = entry.getValue();
            System.out.println("Employee: " + employeeName + ", Employee_ID: " + employeeId);
        }
    }
    ///
    public static void task5() {

        HashMap<String, String> bookMap = new HashMap<>();
        bookMap.put("The Great Gatsby", "F. Scott Fitzgerald");
        bookMap.put("1984", "George Orwell");
        bookMap.put("To Kill a Mockingbird", "Harper Lee");

        for (String title : bookMap.keySet()) {
            System.out.println(title);
        }
    }
    ///

    public static void task7() {
        HashMap<String, Integer> cityPopulations = new HashMap<>();
        cityPopulations.put("New York", 8419600);
        cityPopulations.put("Los Angeles", 3971000);
        cityPopulations.put("Chicago", 2716000);

        int totalPopulation = 0;
        for (int population : cityPopulations.values()) {
            totalPopulation += population;
        }

        System.out.println("Total population of all cities: " + totalPopulation);
    }
    ///
    public static void task8() {
        HashMap<String, Integer> movies = new HashMap<>();
        movies.put("Inception", 2010);
        movies.put("The Dark Knight", 2008);
        movies.put("Interstellar", 2014);

        System.out.println("Movie Database: " + movies);
    }
    ///
    public static void task9 () {
        HashMap<String, String> languages = new HashMap<>();
        languages.put("Java", "James Gosling");
        languages.put("Python", "Guido van Rossum");
        languages.put("C", "Dennis Ritchie");

        System.out.println("Programming Languages and Their Creators:");
        for (String language : languages.keySet()) {
            System.out.println(language + " was created by " + languages.get(language));
        }
    }
}



