package day26_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greatestValue();
        findAverage ();
        task5();
    }

    /*public static void main(String[] args) {

        // Create method void type
        // create hashmap key String and value Integer name it phoneBook
        // put 4 values
        // print two values by using get() method
        // check one key and one value by using containsKey(), containsValue() methods


        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("First", 1);
        phoneBook.put("Second", 2);
        phoneBook.put("Third", 3);
        phoneBook.put("Fourth", 4);
        System.out.println(phoneBook.get("First"));
        System.out.println(phoneBook.get("Second"));
        System.out.println(phoneBook.containsKey("Third"));
        System.out.println(phoneBook.containsValue(4));


        // check size and print it
// remove one element from your hashmap
// and check size again and print it
// print all values on the same line

        System.out.println(phoneBook.size());
        System.out.println(phoneBook.remove("Third"));
        System.out.println(phoneBook.size());
        System.out.println(phoneBook);


        // check is it empty or not
// clear everything from your phonebook
// check it again is it empty or not

        System.out.println(phoneBook.isEmpty());
        //phoneBook.clear();
        System.out.println(phoneBook.isEmpty());

        for (Map.Entry<String, Integer> Phonebook : phoneBook.entrySet()) {
            System.out.println("Key -> " + Phonebook.getKey());
            System.out.println("Value -> " + Phonebook.getKey());

     */

            /// /

        public static void greatestValue () {
            HashMap <String ,Double> companies = new HashMap<>();
            companies.put("apple", 400.90);
            companies.put("tesla", 1200.32);
            companies.put("meta", 300.43);
            companies.put("bofa", 5.5);
            companies.put("slack", 123.54);
            companies.put("macdonalds", 98.12);

            String greatCompany = "";
            double max =0;
            for (Map.Entry<String, Double> company : companies.entrySet()) {
                if (company.getValue() > max) {
                    max = company.getValue();
                    greatCompany = company.getKey();
                }
            }
            System.out.println("The greatest company is-> "+ greatCompany + " = " + max);
        }
        /// /
    public static void findAverage () {
        HashMap <String ,Double> companies = new HashMap<>();
        companies.put("apple", 400.90);
        companies.put("tesla", 1200.32);
        companies.put("meta", 300.43);
        companies.put("bofa", 5.5);
        companies.put("slack", 123.54);
        companies.put("macdonalds", 98.12);
        double sum = 0;
        double average;
        for (Map.Entry<String, Double> company : companies.entrySet()) {
            sum += company.getValue();

        }
        average = sum / companies.size();
        System.out.println("The average -> " + average);
    }
    /// /

    public static void task5() {
        HashMap<String, Double> fruits = new HashMap<>();
        fruits.put("apple", 2.5);
        fruits.put("banana", 2.0);
        fruits.put("orange", 1.5);
        fruits.put("mango", 3.0);
        fruits.put("grapes", 3.0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fruit name: ");
        String input = scanner.next();
        if (fruits.containsKey(input)) {
            System.out.println(input + "=" + fruits.get(input) + "$");
        } else {
            System.out.println("Failed");
        }
    }

    }

