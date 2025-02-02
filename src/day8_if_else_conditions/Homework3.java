package day8_if_else_conditions;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        if (name.contains("Alice")) {
            System.out.println("Hello Alice!");
        } else if (name.contains("Bob")) {
            System.out.println("Hello Bob!");
        } else if (name.contains("Charlie")) {
            System.out.println("Hello Charlie!");
        } else {
            System.out.println("Hello Stranger!");
        }

        System.out.println("Enter the title: ");
        String title = scanner.nextLine();
        if (title.startsWith("Mr.")) {
            System.out.println("Hello Sir");
        } else if (title.startsWith("Ms")) {
            System.out.println("Hello Ma'am");
        } else if (title.startsWith("Dr.")) {
            System.out.println("Hello Doctor");
        } else {
            System.out.println("Hello");
        }

        System.out.println("Enter the sentence: ");
        String sentence = scanner.nextLine();
        if (sentence.contains("error")) {
            System.out.println("Something went wrong");
        } else if (sentence.contains("success")) {
            System.out.println("Operation successful");
        } else if (sentence.contains("pending")) {
            System.out.println("Action is pending");
        } else {
            System.out.println("Status unknown");
        }

        System.out.println("Enter the domain: ");
        String domain = scanner.nextLine();
        if (domain.endsWith(".com")) {
            System.out.println("Commercial domain");
        } else if (domain.endsWith(".org")) {
            System.out.println("Organization domain");
        } else if (domain.endsWith(".edu")) {
            System.out.println("Educational domain");
        } else {
            System.out.println("Other domain");
        }

        System.out.println("Enter language: ");
        String language = scanner.nextLine();
        if (language.contains("Java")) {
            System.out.println("You chose Java");
        } else if (language.contains("Python")) {
            System.out.println("You chose Python");
        } else if (language.contains("JavaScript")) {
            System.out.println("You chose JavaScript");
        } else {
            System.out.println("Unknown language");
        }

        System.out.println("Enter the fruit: ");
        String fruit = scanner.nextLine();
        if (fruit.equals("apple")) {
            System.out.println("You chose apple");
        } else if (fruit.equals("banana")) {
            System.out.println("You chose banana");
        } else if (fruit.equals("orange")) {
            System.out.println("You chose orange");
        } else {
            System.out.println("Unknown fruit");
        }

    }
}
