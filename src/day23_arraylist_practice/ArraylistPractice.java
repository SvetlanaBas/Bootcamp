package day23_arraylist_practice;

import java.util.ArrayList;
import java.util.List;

public class ArraylistPractice {


       /* public static ArrayList<Integer> generateArraylist() {
            Random random = new Random();
            ArrayList<Integer> randomNumbers = new ArrayList<>();
            int limit = random.nextInt(5, 15);

            for (int i = 0; i < limit; i++) {
                randomNumbers.add(random.nextInt(0, 100));
            }

            return randomNumbers;
        }

        */


    // create a method reverseArrayList
// this method should take an Arraylist in params
// and return back Arraylist
// by using for loop you have to reverse the arraylist
// create new arraylist and store numbers there
// return back new arraylist
// ex: 1,4,6,2,3,5
// output: 5,3,2,6,4,1

  /*  public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 23, 4, 3, 52));
        ArrayList<Integer> reversed = reverseArraylist(nums);
        System.out.println("reversed = " + reversed);
    }
    public static ArrayList<Integer> reverseArraylist(ArrayList<Integer> numbers) {
        ArrayList<Integer> response = new ArrayList<>();
        for (int i = numbers.size() - 1; i >= 0; i--) {
            response.add(numbers.get(i));
        }
        return response;
    }




    // create a method findMaxValue
// take an arraylist type of integer in parameters
// and in the main method find max value
// and return this max value (int)
// [2,4,5,754,76,34,5,111]
// max value is 754


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(3);
        numbers.add(42);
        numbers.add(15);

        int max = findMaxValue(numbers);
        System.out.println("The maximum value is: " + max);
    }

    public static int findMaxValue(ArrayList<Integer> numbers) {
        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }




    // create a method findOccurrence
// take in a parameter arraylist type of character and char
// in the method you should count occurrences of that symbol
// and return back amount of specific symbol
// Ex ['a', 'b', 'a', 'h', 'y', 'b', 'u'], 'b'
// amount of 'b' is 2


    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('a');
        charList.add('b');
        charList.add('b');
        charList.add('h');
        charList.add('y');
        charList.add('b');
        charList.add('u');

        char target = 'b';
        System.out.println("Amount of '" + target + "' is: " + findOccurrence(charList, target));
    }

    public static int findOccurrence(ArrayList<Character> list, char symbol) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == symbol) {
                count++;
            }
        }
        return count;
    }



    // create a method findLongest
// it should take as a parameter Arraylist type of string
// in the method you need to find the longest word
// and return it back
// ["Hello", "Hi", "How are you", "Codewise"]
// it should return "How are you"


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Hi");
        words.add("How are you");
        words.add("Codewise");

        System.out.println(findLongest(words));
    }

    public static String findLongest(ArrayList<String> words) {

        String longest = "";
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > longest.length()) {
                longest = words.get(i);
            }
        }
        return longest;
    }

   ///

    public static String findLongest(ArrayList<String> words) {
        String max = ""; // ""
        for (int i = 0; i < words.size(); i++) { // i = 0
            String currentWord = words.get(i); // "Hello"
            if (currentWord.length() > max.length()) { // 5 > 0
                max = currentWord;
            }
        }
        return max;
    }

   */

    // create a method called findAverage()
// take an arraylist in parameters type of integer
// in the method calculate an average
// and return back double value

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        System.out.println("Average: " + findAverage(numbers));
    }

    public static double findAverage(ArrayList<Integer> numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = sum / numbers.size();
        return average;
    }
}



