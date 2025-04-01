package day41_lambda;

public class Task2 {
    public static void main(String[] args) {

        StringChecker checker = (String str) -> {
            StringBuilder builder = new StringBuilder(str);
            builder.reverse();
            String reversed = builder.toString();
            return reversed.equalsIgnoreCase(str);
        };
        System.out.println(checker.check("Madam"));
    }
}
