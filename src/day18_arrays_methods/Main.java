package day18_arrays_methods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3,1};
        int [] arr3 = {1,2,3,1,2};

        boolean first = false;
        boolean second = false;
        boolean third = false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1.length >= 1 && arr1[0] == arr1[arr1.length - 1]) {
               first= true;
            }
            if (arr2.length >= 1 && arr2[0] == arr2[arr2.length - 1]) {
                second = true;
            }
            if (arr3.length >= 1 && arr3[0] == arr3[arr3.length - 1]) {
                third = true;
            }
        }
        System.out.println("First array:" + first);
        System.out.println("Second array:" + second);
        System.out.println("Third array:" + third);


      //  int[] numbers = {1, 23, 54, 6, 5, 45, 7, 47, 4, 7, 64};
       // System.out.println(Arrays.toString(numbers));


        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
        }
        System.out.println("Modified array: " + Arrays.toString(numbers));

        int[] numbers = {5, 7, 2, 9, 10, 3, 6, 1, 4, 8};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] days = {"Monday", "Tuesday", "Friday", "Sunday", "Saturday"};
        Arrays.sort(days);
        System.out.println(Arrays.toString(days));



        int[] numbers = {10, 5, 6, 11, 25, 34, 64, 26, 11, 9};
        Arrays.sort(numbers);
        System.out.println("Max number is: " + numbers[numbers.length-1]);




        int[] arr1 = {1, 432, 543, 64, 54, 6, 77, 68, 95, 10};
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("max = " + max);




        int[] arr1 = {1, 432, 543, 64, 54, 6,77, 68, 95, 10};
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("max = " + max);



        int[] array = {1,2,3};
        int[] array1 = {1,2,3};
        System.out.println(Arrays.equals(array, array1));


        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = Arrays.copyOf(array, 3);
        System.out.println(Arrays.toString(array1));



        int[] numbers = {12, 54, 67, 90, 23, 45};
        int element1 = 54;
        int element2 = 90;

        boolean containsElement1 = false;
        boolean containsElement2 = false;

        for (int number : numbers) {
            if (number == element1) {
                containsElement1 = true;
            }
            if (number == element2) {
                containsElement2 = true;
            }
        }

        if (containsElement1 && containsElement2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }



        int[] numbers = {1, 23, 4, 54, 3, 6, 43, 4656, 4, 34, 34};
        boolean contains54 = false;
        boolean contains90 = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 54) {
                contains54 = true;
            }

            if (numbers[i] == 90) {
                contains90 = true;
            }

        }
        if (contains54 && contains90){
            System.out.println("True");
        }

         */


        int []  numbers = {5,64,48,12,45,222,3};
        Arrays.sort(numbers);
        int count = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            count = count + numbers[i];
        }
        System.out.println("Average is: "  + (count/(numbers.length-2)));


    }
}
