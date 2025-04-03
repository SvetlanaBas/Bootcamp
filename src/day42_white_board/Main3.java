package day42_white_board;

public class Main3 {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) sum += num;
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println("Missing number: " + findMissingNumber(arr, 5));
    }
}
