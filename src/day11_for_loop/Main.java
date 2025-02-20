package day11_for_loop;

public class Main {
    public static void main(String[] args) {
        for (int number = 5; number <= 10; number++) {
            System.out.println(number + " Hello how are you");
            if (number == 7) {
                System.out.println("Hey this number right now is 7");
            }
        }
        System.out.println("Hello how are you doing?");

        for (int i = 1; i < 20; i += 5) {
            System.out.println(i);
        }
    }

}
