package day39_oca_intro.ternaryOperator;

public class Main2 {
    public static void main(String[] args) {
        int input = 1;

// You cannot use Long
// You cannot use double and float
// you cannot use boolean
        switch (input) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wed");
                break;
            }
            case 4: {
                System.out.println("Thur");
                break;
            }
            case 5: {
                System.out.println("Fri");
                break;
            }
            case 6: {
                System.out.println("Sat");
                break;
            }
            case 7: {
                System.out.println("Sun");
                break;
            }
            default: {
                System.out.println("Invalid day");
            }

        }


        switch (input) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thur");
            case 5 -> System.out.println("Fri");
            case 6 -> System.out.println("Sat");
            case 7 -> System.out.println("Sun");
            default -> System.out.println("Invalid day");
        }

        /// /

        String value = "Are";
        switch (value) {
            case "hi", "Hi" -> System.out.println("First case");
            case "Hello", "How", "Are" -> System.out.println("Second case");
            default -> System.out.println("Invalid day");
        }

    }
}
