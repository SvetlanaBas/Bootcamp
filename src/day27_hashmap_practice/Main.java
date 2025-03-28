package day27_hashmap_practice;

import java.util.HashMap;
//
///public class Main {
   // public static void main(String[] args) {
     /*   findFrequencyOfLetters();
        String[] words1 = {"Hi", "How", "Are", "You", "Doing", "Hi", "Hi", "How", "Is", "it", "Doing", "Hi"};
        System.out.println(task1(words1));
    }

    public static HashMap<Character, Integer> findFrequencyOfLetters(String text) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        char[] letters = text.toCharArray();// [h,e,l,l,o,l]

        for (char letter : letters) { // frequency = [h=1,e=1,l=3,o=1  ]
            if (frequency.containsKey(letter)) { // l
                Integer prevValue = frequency.get(letter); // 2
                frequency.replace(letter, prevValue + 1);// l, 2+1
            } else {
                frequency.put(letter, 1);// o=1
            }
        }
        return frequency;
    }

    // create an array with values ["Hi", "How", "Are", "You", "Doing", "Hi", "Hi", "How", "Is", "it", "Doing", "Hi"]
    // create a method that accepts string array in params
    // and you need to count frequency of words by using hashmap
    // and return back your hashmap


    public static HashMap<String, Integer> task1(String[] words1) {
        HashMap<String, Integer> words = new HashMap<>();
        for (String word : words1) {
            if (words.containsKey(word)) {
                Integer prevValue = words.get(word);
                words.replace(word, prevValue + 1);
            } else {
                words.put(word, 1);
            }
        }
        return words;
    }
}

      */

