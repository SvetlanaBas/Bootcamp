package day39_oca_intro.ternaryOperator;

public class Main1 {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Hello how are you doing?");
        str.append("hello");
        str.append("how are you?");
        str.reverse();
        System.out.println(str);
        System.out.println(str.charAt(0));


        StringBuilder str1 = new StringBuilder("Hello how are you doing?");
        str1.append("hello");
        str1.append("how are you?");
        str1.reverse();
        System.out.println(str1);
        System.out.println(str1.charAt(0));
    }
}