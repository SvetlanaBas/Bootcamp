
public class HomeworkPractice2 {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        int c = 10;
        int d = 5;
        int add = c + d;
        int subtract = c - d;
        int multiply = c * d;
        int divide = c / d;
        int module = c % d;
        System.out.println(c + " + " + d + " = " + add);
        System.out.println(c + " - " + d + " = " + subtract);
        System.out.println(c + " * " + d + " = " + multiply);
        System.out.println(c + " / " + d + " = " + divide);
        System.out.println(c + " % " + d + " = " + module + "\n");

        System.out.println("Task 2:");
        int number = 0;
        number = 2345 + 8;
        number = number / 3;
        number = number % 5;
        number = number * 5;
        System.out.println("(2345 + 8) / 3 % 5 * 5 = " + number); //I did not understand the point of number declared as 0

        /*
        int number = 0;
        System.out.println("(2345 + 8) / 3 % 5 * 5 = " + (number + 2345 + 8) / 3 % 5 * 5)); // just exact same thing without number would be fine
         */
    }
}
