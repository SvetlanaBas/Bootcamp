package day10_character_class;

public class CompoundClass {
    public static void main(String[] args) {
        int number = 5;
        number++;
        number++;
        number++;
        number++;
        System.out.println(number); // 9

        number--;
        number--;
        number--;
        number++;
        System.out.println(number); // 7


        int num = 5;
        num = num / 5 ;
        num = num * 10;
        num = num - 20;
        System.out.println(num);

        double num1 = 5.345345435;
        num1 += 5.5435345345;
        num1 *= number;
        num1 /= num;
        System.out.println(num1);
    }
}
