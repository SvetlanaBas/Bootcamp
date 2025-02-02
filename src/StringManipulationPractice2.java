
import java.util.Locale;

public class StringManipulationPractice2 {
    public static void main(String[] args) {
        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("Hello World!");
        boolean compare1 = hello1.equals(hello2);
        System.out.println("Expected output: " + compare1);
        boolean compare2 = hello1 == hello3;
        System.out.println("Expected output: " + compare2);
        boolean compare3 = hello1.equals(hello3);
        System.out.println("Expected output: " + compare3);
        hello1 = hello1.toLowerCase();
        hello2 = hello2.toLowerCase();
        System.out.println("Expected output: " + hello1.equals(hello2));
        hello1 = hello1.toUpperCase();
        hello3 = hello3.toUpperCase();
        System.out.println("Expected output: " + hello1.equals(hello3));
    }
}