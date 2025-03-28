package day22_arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class training {

    public static void main(String[] args) {

        initialValues();
        iterations();
        task1();
        pracriceSet();
        practiceRemove();
        practiceClear();
        task8();
        task10();

        ArrayList <String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add(1,"Ford");
        cars.add("Mazda");
        System.out.println(cars);    //   [BMW, Ford, Mazda, Volvo]


    }


   /*
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);

        System.out.println(numbers.get(0)); // 1
        System.out.println(numbers.get(5)); // 5
    }
    */


    public static void initialValues() {
        // how to assign initial values:
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40));
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        System.out.println(numbers.get(2)); // 30
        System.out.println(numbers.get(4)); // 1
    }

    public static void iterations() {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hi");
        words.add("how");
        words.add("are");
        words.add("you!");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }

    /// // create a method void type
    /// // in this method create an arraylist add 10 elements type of integer
    /// // iterate by using for loop
    /// // and print only even numbers!!!
    public static void task1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println(numbers.get(i));
            }
        }
    }

    /// /
// create method called practiceSet (VOID)
// in this method create arraylist type of String carNames
// add 5 cars
// by using for loop
// iterate over your arraylist
// and check elements length
// if carsName is more than 4
// update this value to Codewise
// at the end of that print all car values on the same line
    public static void pracriceSet() {
        ArrayList<String> carNames = new ArrayList<>();
        carNames.add("Ford");
        carNames.add("Audi");
        carNames.add("Tesla");
        carNames.add("Toyota");
        carNames.add("BMW");

        for (int i = 0; i < carNames.size(); i++) {
            if (carNames.get(i).length() > 4) {
                carNames.set(i, "Codewise");
            }
        }
        System.out.println(carNames);
    }

    /// /
// create a method called practiceRemove
// create an arraylist with 5 elements
// print all of them on the same line
// remove the middle elements from your list
// print all of them on the same line again
    public static void practiceRemove() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Before removal: " + numbers);

        numbers.remove(numbers.size() / 2);

        System.out.println("After removal: " + numbers);
    }

    /// /
    /// // create a method called practiceClear
    /// // Create an arraylist type of integer
    /// // add 5 elements
    /// // print result by the name of arraylist
    /// // clear list
    /// // then print result by the name of arraylist
    /// // add 5 new values
    /// // print size
    /// // and print all values on the same line by the name of arraylist
    public static void practiceClear() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Initial ArrayList: " + numbers);

        numbers.clear();
        System.out.println("ArrayList after clear: " + numbers);

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println("Size of ArrayList: " + numbers.size());

        System.out.println("Final ArrayList: " + numbers);
    }

    // create method task8
// create an arraylist
// check is it empty and print the result
// add five us state name
// check is it empty and print the result
// check for Illinois and print the result

    public static void task8() {
        ArrayList<String> states = new ArrayList<>();

        System.out.println("Is the list empty? " + states.isEmpty());

        states.add("California");
        states.add("Washington");
        states.add("Florida");
        states.add("New York");
        states.add("Illinois");

        System.out.println("Is the list empty? " + states.isEmpty());

        System.out.println("Does the list contain Illinois? " + states.contains("Illinois"));
    }

    /// /
    // create a method called task10
// create an arraylist type of character
// add there 10 letters
// sort in natural order and print the value
// then sort in reverse order and print the value
    public static void task10() {
        ArrayList<Character> letters = new ArrayList<>();
        letters.add('J');
        letters.add('A');
        letters.add('V');
        letters.add('A');
        letters.add('P');
        letters.add('R');
        letters.add('O');
        letters.add('G');
        letters.add('R');
        letters.add('M');

        Task10();
    }

    public static void Task10() {
        ArrayList<Character> letters = new ArrayList<>();
        letters.add('A');
        letters.add('N');
        letters.add('M');
        letters.add('R');
        letters.add('Y');
        letters.add('F');
        letters.add('D');
        letters.add('S');
        letters.add('E');
        letters.add('T');

        letters.sort(Comparator.naturalOrder());
        System.out.println(letters);
        letters.sort(Comparator.reverseOrder());
        System.out.println(letters);
    }
}





