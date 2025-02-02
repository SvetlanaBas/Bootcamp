
public class ArithmeticOperatorPratice {
    public static void main(String[] args) {
        int number = 132;
        int first = number / 100;
        int second = (number % 100) / 10;
        int third = number % 10;
        System.out.println("first digit = " + first + " , second digit = " + second + ", third digit = " + third);
        System.out.println(first + " + " + second + " + " + third + " = " + (first + second + third));
        System.out.println(first + " * " + second + " * " + third + " = " + (first * second * third));
        System.out.println(third + ", " + second + ", " + first);
    }
}
