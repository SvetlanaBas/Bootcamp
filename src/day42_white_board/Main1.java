package day42_white_board;

public class Main1 {
    public static int f(int n) {
        if (n <= 1) {
            return n;
        }
        return f(n - 1) + f(n - 2);
    }
}
