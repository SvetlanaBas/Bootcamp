
public class StringManipulationPractice1 {
    public static void main(String[] args) {
        String text = "On my way to break into IT industry!";
        System.out.println(text.charAt(5)); // it is just space _
        System.out.println(text.indexOf('a'));
        String text1 = "Java";
        System.out.println(text.equals(text1));
        String textcopy = new String("On my way to break into IT industry!");
        System.out.println(text == textcopy);
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.length());
    }
}
