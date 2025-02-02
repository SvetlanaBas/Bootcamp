
public class StringManipulationPractice3 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        System.out.println("Expected output: " + str1.indexOf("world"));

        String str2 = "Hello";
        System.out.println("Expected output: " + str2.charAt(0));

        String str3 = "HELLO";
        System.out.println("Expected output: " + str3.toLowerCase());

        String str4 = "hello";
        System.out.println("Expected output: " + str4.toUpperCase());

        System.out.println("Expected output: "+ str4.equals(str2));
    }
}
