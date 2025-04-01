package day41_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of("Apple", "Banana", "Cat", "Elephant"));
        System.out.println(words);
        Predicate<String> lengthGreater = (word) -> word.length() > 5;

        for (String word : words) {
            if(lengthGreater.test(word)){
                System.out.println(word);
            }
        }
    }
}
