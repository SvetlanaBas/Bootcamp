package day25_hashset_practice;

import java.util.*;

public class Main {
    /*
    public static void main(String[] args) {
        HashSet<Integer> test = new HashSet<>(List.of(2, 34, 654, 3, 643, 234, 23));
        System.out.println(test);
        ArrayList<Integer> response = reverseHash(test);
        System.out.println(response);
    }
    public static ArrayList<Integer> reverseHash(HashSet<Integer> numbers) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(numbers);
        Collections.reverse(integerArrayList);
        return integerArrayList;
    }
    public static ArrayList<Integer> reverseHash(HashSet<Integer> numbers) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(numbers);
        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = integerArrayList.size() - 1; i >= 0; i--) {
            Integer element = integerArrayList.get(i);
            reversed.add(element);
        }

        return reversed;
    }
//////


    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>(List.of(1, 2, 3, 4, 5));
        printFirstThreeElements(numbers);
    }

    public static void printFirstThreeElements(HashSet<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (count < 3) {
                System.out.println(number);
                count++;
            } else {
                break;
            }
        }
    }


    // Remove max and min values
// create a method that takes hashSet in parameters
// in the method write logic for finding max and min values
// and remove them
// after that return updated hashset
// you should print value before and after calling method!

    public static void main(String[] args) {
        HashSet<Integer> test = new HashSet<>(List.of(2, 34, 654, 3, 643, 234, 23));
        System.out.println(test);
        HashSet<Integer> response = removeMaxMin(test);
        System.out.println(response);
    }

    public static HashSet<Integer> removeMaxMin(HashSet<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        nums.remove(max);
        nums.remove(min);

        return nums;
    }




    // Find first repeated letter!
// create a method that takes string in parameters
// in the method, write logic for finding out first repeated letter
// hint: use hashset and for each loop
// once you found first repeated letter
// return this letter back
// Ex: How are you!
// result: o
// Ex: Hello
// result: l

    public static void main(String[] args) {
        System.out.println(findFirstRepeatedLetter("How are you!"));
        System.out.println(findFirstRepeatedLetter("Hello"));
        System.out.println(findFirstRepeatedLetter("World"));
    }

    public static Character findFirstRepeatedLetter(String input) {
        HashSet<Character> letters = new HashSet<>();
        String lowercaseInput = input.toLowerCase();
        for (char symbol : lowercaseInput.toCharArray()) {
            if (letters.contains(symbol) && ' ' !=symbol) {
                return symbol;
            } else {
                letters.add(symbol);
            }
        }
        return null;
    }


// Count unique characters in a String
// create a method that takes a string in params
// in the method write logic for counting unique letters
// return back amount of unique characters!


    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("Number of unique characters: " + countUniqueCharacters(input));
    }

    public static int countUniqueCharacters(String str) {
        HashSet<Character> uniqueChars = new HashSet<>();

        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        return uniqueChars.size();
    }

     */

    // Print words with 'e'
// create a method that takes hashset type of String
// in the method you should print each word
// that contains letter 'e'

    public static void main(String[] args) {

        HashSet<String> words = new HashSet<>();
        words.add("apple");
        words.add("banana");
        words.add("grape");
        words.add("cherry");
        words.add("kiwi");

        printWordsWithE(words);
    }

    public static void printWordsWithE(HashSet<String> words) {
        for (String word : words) {
            if (word.contains("e")) {
                System.out.println(word);
            }
        }
    }
}
