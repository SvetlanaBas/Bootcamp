package day21_return_type_methods;

import java.util.Scanner;

public class MethodsHW2 {
   /* public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        int num1 = scanner.nextInt();
        System.out.print("Input : ");
        int num2 = scanner.nextInt();

        int result = calculateSum(num1, num2);


        System.out.println("Output : " + result);

    }
}
///



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();

        String result = convertToUpperCase(input);
        System.out.println("Output: " + result);

        scanner.close();
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }
    ////

   public static int calculate(int a, int b) {
       return (b / a) * 10;
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();


        int result = calculate(num1, num2);
        System.out.println("Output: " + result);

    }
    ////

   public static void isEven(int num) {
       System.out.println(num % 2 == 0);
   }

    public static void main(String[] args) {
        isEven(46);
        isEven(3);
    }
    ////
    */


        public static double multiply(double number) {
            return number * 100;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input : ");
            double inputNumber = scanner.nextDouble();
            double result = multiply(inputNumber);
            System.out.println("Output : " + (int) result);
        }
    }




