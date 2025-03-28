package day26_hashmap;

import java.util.HashMap;

public class Homework2 {
    public static void main(String[] args) {
        HashMap<String, Integer> productStock = new HashMap<>();
        productStock.put("Laptop", 10);
        productStock.put("Phone", 20);
        productStock.put("Tablet", 15);

        // Task 1: Remove the product "Tablet" from the productStock HashMap
        productStock.remove("Tablet");
        System.out.println("After removing 'Tablet': " + productStock);

        // Task 2: Print the current size of the productStock HashMap
        System.out.println("Current size of productStock: " + productStock.size());

        // Task 3: Check if the product "Laptop" exists in the productStock HashMap
        boolean laptopExists = productStock.containsKey("Laptop");
        System.out.println("Does 'Laptop' exist in productStock? " + laptopExists);

        // Task 4: Clear all entries from the productStock HashMap
        productStock.clear();
        System.out.println("After clearing productStock: " + productStock);

        // Task 5: Check if the quantity 20 exists in the productStock HashMap

        boolean quantityExists = productStock.containsValue(20);
        System.out.println("Does quantity 20 exist in productStock? " + quantityExists);
    }
}

