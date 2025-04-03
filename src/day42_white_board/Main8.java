package day42_white_board;

public class Main8 {
    public static void main(String[] args) {
        isPalindrome(4775774);
    }

    public static boolean isPalindrome(int number) {
        String value = String.valueOf(number);
        StringBuilder builder = new StringBuilder(value);
        builder.reverse();
        return value.equals(builder.toString());
    }
}
