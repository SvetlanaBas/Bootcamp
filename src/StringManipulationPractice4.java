
public class StringManipulationPractice4 {
    public static void main(String[] args) {
        String str = "  This is a random string for testing purposes  ";
        System.out.println("Expected result: " + str.length());
        System.out.println("Expected result: '" + str.charAt(2) + "'");
        System.out.println("Expected result: '" + str.charAt(str.length()-1) + "'");
        System.out.println("Expected result: " + str.replace('o', 'i').replace('s', 'i'));
        System.out.println("Expected result: " + str.replace(" ", ""));
        String result = str.substring(str.indexOf("random"), (str.indexOf("random")+6));
        System.out.println("Expected result: " + result);
        result = result.toUpperCase();
        System.out.println("Expected result: " + result.charAt(5) + result.charAt(4) + result.charAt(3) + result.charAt(2) + result.charAt(1) + result.charAt(0));
    }
}