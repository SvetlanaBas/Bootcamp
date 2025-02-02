package day8_if_else_conditions;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the traffic light color : ");
        String  light = scanner.nextLine();
        if (light.equalsIgnoreCase("red")) {
            System.out.println("Stop ");
        }else if (light.equalsIgnoreCase("yellow")) {
            System.out.println("Get ready to stop");
        }else if (light.equalsIgnoreCase("green")) {
            System.out.println("Go");
        }else {
            System.out.println("Invalid light color");
        }



        System.out.println("Enter the time of day: ");
        String  timeOfDay = scanner.nextLine();
        if (timeOfDay.equalsIgnoreCase("morning")) {
            System.out.println("Have a breakfast ");
        }else if (timeOfDay.equalsIgnoreCase("afternoon")) {
            System.out.println("Have lunch");
        }else if (timeOfDay.equalsIgnoreCase("evening")) {
            System.out.println("Have a dinner");
        }else {
            System.out.println("Have a snack");
        }

        System.out.println("Enter the day: ");
        String  day = scanner.nextLine();
        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("Start the week with a smile ");
        }else if (day.equalsIgnoreCase("Friday")) {
            System.out.println("Get ready for the weekend");
        }else if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("Relax, it's still the weekend");
        }else {
            System.out.println("Keep going");
        }


        System.out.println("Enter the season: ");
        String season = scanner.nextLine();
        if (season.equalsIgnoreCase("winter")) {
            System.out.println("Build a snowman");
        }else if (season.equalsIgnoreCase("spring")) {
            System.out.println("Enjoy the flowers");
        }else if (season.equalsIgnoreCase("summer")) {
            System.out.println("Go for a swim");
        }else if (season.equalsIgnoreCase("autumn")) {
            System.out.println("Watch the leaves fall");
        }else {
            System.out.println("Invalid season");
        }

    }
}
