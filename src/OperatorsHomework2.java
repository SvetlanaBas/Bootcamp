
import java.lang.Math;

public class OperatorsHomework2 {
    public static void main(String[] args) {
        int number8 = 20;
        int number9 = 5;
        System.out.println("The division of " + number8 + " by " + number9 + " is " + (number8 / number9) + ".");
        int number10 = 27;
        int number11 = 4;
        System.out.println("The remainder of " + number10 + " divided by " + number11 + " is " + (number10 % number11) + ".");
        int number12 = 2;
        int number13 = 5;
        System.out.println(number12 + " raised to the power of " + number13 + " is " + (Math.pow(number12,number13)) + ".");//was not part of basic operator topic. Had to import Math
        int number15 = 10;
        int number16 = 15;
        int number17 = 20;
        System.out.println("The average of " + number15 + ", " + number16 + ", and " + number17 + " is " + ((number15 + number16 + number17) / 3) + ".");
    }
}
