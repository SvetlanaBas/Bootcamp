package day29_static_keyword;

public class Task2 {
    public static void main(String[] args) {
        testFindMaxMethod();
    }
    public static void testFindMaxMethod() {
        int[] numbers = {3, 54, 2, 9, 5};
        int max = MathUtils.findMax(numbers);
        System.out.println("The maximum number is: " + max);
    }
}
