package day27_hashmap_practice;

import java.util.HashMap;

public class CountVowelsHashMap {
    public static void main(String[] args) {
        String sentence = "example";
        HashMap<Character, Integer> vowelCounts = countVowels(sentence);


        for (char vowel : "aeiou".toCharArray()) {
            System.out.println(vowel + " - " + vowelCounts.getOrDefault(vowel, 0));
        }
    }

    public static HashMap<Character, Integer> countVowels(String str) {
        HashMap<Character, Integer> vowelMap = new HashMap<>();

        for (char vowel : "aeiou".toCharArray()) {
            vowelMap.put(vowel, 0);
        }

        for (char ch : str.toLowerCase().toCharArray()) {
            if (vowelMap.containsKey(ch)) {
                vowelMap.put(ch, vowelMap.get(ch) + 1);
            }
        }

        return vowelMap;
    }
}

