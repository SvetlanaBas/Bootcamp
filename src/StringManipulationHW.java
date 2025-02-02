
public class StringManipulationHW {
    public static void main(String[] args) {
        String str = "Learning Java is fun and rewarding.";
        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        System.out.println(str.charAt(0));

        System.out.println(str.indexOf('r')); // mistake at Expected result in Assignment question. Answer is 3 not 2

        System.out.println(str.substring(5, 15));

        System.out.println(str.trim());

        System.out.println(str.startsWith("Learning"));

        System.out.println(str.indexOf("g.")); // // mistake at Expected result in Assignment question. Answer is 33 not 36

        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        String newText = str.replace("L", "").replace(".", "");
        System.out.println(last+newText+first);
    }
}
