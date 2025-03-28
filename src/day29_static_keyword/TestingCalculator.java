package day29_static_keyword;

public class TestingCalculator {
    public static void main(String[] args) {
        testCalculator();
    }

    public static void testCalculator() {


        double print1 = Calculator.add(10, 20);
        double print2 = Calculator.subs(30, 40);
        double print3 = Calculator.div(10.5, 20.5);
        double print4 = Calculator.mult(25.4, 33.7);

        System.out.println(print1);
        System.out.println(print2);
        System.out.println(print3);
        System.out.println(print4);
    }
}

