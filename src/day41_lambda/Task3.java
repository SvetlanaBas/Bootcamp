package day41_lambda;

public class Task3 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation mul = (a, b) -> a * b;

        int num1 = 10, num2 = 5;
        System.out.println("Addition: " + add.operate(num1, num2));
        System.out.println("Subtraction: " + sub.operate(num1, num2));
        System.out.println("Multiplication: " + mul.operate(num1, num2));
    }
}
