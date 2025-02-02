package day8_if_else_conditions;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the greeting for everybody: ");
        String  greeting = scanner.nextLine();
        if (greeting.startsWith("Hello")) {
            System.out.println("Hi there");
        }else if (greeting.startsWith("Good morning")) {
            System.out.println("Good morning to you too!");
        }else if (greeting.startsWith("Good evening")) {
            System.out.println("Good evening!");
        }else {
            System.out.println("Greetings");
        }

        System.out.println("Enter email: ");
        String  email = scanner.nextLine();
        if (email.endsWith("@gmail.com")) {
            System.out.println("Gmail user detected");
        }else if (email.endsWith("@yahoo.com")) {
            System.out.println("Yahoo user detected");
        }else if (email.endsWith("@outlook.com")) {
            System.out.println("Outlook user detected!");
        }else {
            System.out.println("Unknown email provider");
        }


        System.out.println("Enter URL: ");
        String  url = scanner.nextLine();
        if (url.startsWith("https://")) {
            System.out.println("Secure website");
        }else if (url.startsWith("http://")) {
            System.out.println("Unsecure website");
        }else if (url.startsWith("www.")) {
            System.out.println("Website address");
        }else {
            System.out.println("Invalid URL");
        }


        System.out.println("Enter filename: ");
        String  filename = scanner.nextLine();
        if (filename.endsWith(".jpg")) {
            System.out.println("Image file");
        }else if (filename.endsWith(".txt")) {
            System.out.println("Text file");
        }else if (filename.endsWith(".pdf")) {
            System.out.println("PDF document");
        }else {
            System.out.println("Unknown file type");
        }



        System.out.println("Enter phrase: ");
        String  phrase = scanner.nextLine();
        if (phrase.contains("Java")) {
            System.out.println("Programming language detected");
        }else if (phrase.contains("Python")) {
            System.out.println("Anotner programming language detected");
        }else if (phrase.contains("JavaScript")) {
            System.out.println("Yet another programming language detected");
        }else {
            System.out.println("No programming language detected");
        }
    }
}
