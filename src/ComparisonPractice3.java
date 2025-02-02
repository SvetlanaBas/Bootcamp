
public class ComparisonPractice3 {
    public static void main(String[] args) {
        String text1 = "Java";
        String text2 = "Python";
        boolean isText1Greater = text1.length() > text2.length();
        System.out.println(isText1Greater);

        boolean isSunny = true;
        boolean isRaining = false;
        System.out.println(isSunny == isRaining);

        int age = 18;
        boolean canVote = age >= 18;
        System.out.println(canVote);

        char char1 = 'A';
        char char2 = 'B';
        boolean isLess = char1 < char2;
        System.out.println(isLess);
    }
}
