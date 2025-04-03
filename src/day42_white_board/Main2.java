package day42_white_board;

import java.util.Arrays;

public class Main2 {
        public static boolean isAnagrams(String str1, String str2) {
            char[] arr1 = str1.toLowerCase().toCharArray();
            char[] arr2 = str2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }

        public static void main(String[] args) {
            System.out.println(isAnagrams("below", "elbow"));
            System.out.println(isAnagrams("study", "dusty"));
        }
}
