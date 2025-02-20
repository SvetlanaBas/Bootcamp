package day17_array;

import java.util.Scanner;

public class AnEmptyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter a number for index " + i + " : ");
            int number = scanner.nextInt();
            nums[i] = number;
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }
}
