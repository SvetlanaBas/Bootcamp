package day7_scanner_class;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner newTask = new Scanner(System.in);
        System.out.print(" Hello what day is today ? " );
        String userInput = newTask.nextLine();
        System.out.println("Hey you entered : " + userInput);
        System.out.println("The length :" + userInput.length());

    }
}
