package day29_static_keyword;

public class TestForUtils {
    public static void main(String[] args) {

            System.out.println("Square of 5: " + Utils.square(5));
            System.out.println("Square of -3: " + Utils.square(-3));

            System.out.println("Reverse of 'hello': " + Utils.reverseString("hello"));
            System.out.println("Reverse of 'Java': " + Utils.reverseString("Java"));


            System.out.println("Celsius 0 to Fahrenheit: " + Utils.convertCelsiusToFahrenheit(0));
            System.out.println("Celsius 100 to Fahrenheit: " + Utils.convertCelsiusToFahrenheit(100));
        }
    }

