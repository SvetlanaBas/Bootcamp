package day7_scanner_class;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey user enter user name: ");
        String userName  = scanner.next();

        System.out.println(userName + " ====> " + userName.substring(0,1).toUpperCase().concat(userName.substring(1).toLowerCase()));


    }
}
