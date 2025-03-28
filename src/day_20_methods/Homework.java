package day_20_methods;

public class Homework {
    public static void main(String[] args) {
        task1("Hello");
        task2(5, 16, 23);
        task3(5);
        task4("batch6");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        task5(array, 5);
        task5(array, 11);
    }

    public static void task1(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }

    public static void task2(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Average is " + average);
    }

    public static void task3(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0 ) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void task4(String input) {
        char[] charArray = input.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println(); //
    }



    public static void task5(int[] array, int target) {
        boolean isPresent = false;


        for (int num : array) {
            if (num == target) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }
    }
}


