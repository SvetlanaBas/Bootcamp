package day41_lambda;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PrintAble printAble = (a, b) -> b + " " + a;


        PrintAble print = (number, text) -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < number; i++) {
                builder.append(text);
            }
            return builder.toString();
        };

        System.out.println(printAble.returnText(10, "Hello world"));
        System.out.println(printAble.returnText(20, "Hello"));

        System.out.println(print.returnText(3, "Codewise"));


        Predicate<Integer> isDivisibleBy5 = (number) -> number % 5 == 0;
        int[] arr = {1,43,54,6,54745,8,568,3245,43,643,6,3,6,346,34,6,2346};

        for (int num : arr) {
            if (isDivisibleBy5.test(num)){
                System.out.println(num + " is divisible by 5");
            }
        }
    }
}
