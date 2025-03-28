package day29_static_keyword;

public class Utils {

    public static int square(int number) {
        return number * number;
    }


    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }


    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}






