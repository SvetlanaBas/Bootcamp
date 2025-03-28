package day24_hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetPractice {
    public static void main(String[] args) {
        printHashSet();
        intro();
        makeIndexAble();
        removalBehavior();
    }

    private static void printHashSet() {
        HashSet<String> words = new HashSet<>();
        words.add("Are");
        words.add("You");
        words.add("Hello");
        words.add("Are");
        words.add("Hi");
        words.add("How");
        words.add("Hi");
        words.add("Are");
        words.add("Hi");
        words.add("You");
        System.out.println(words);  // Output order may vary due to HashSet's nature
    }

    public static void intro() {
        ArrayList<String> texts = new ArrayList<>(Arrays.asList("Codewise", "Java", "Java"));

        HashSet<String> words = new HashSet<>();
        words.add("Hello");
        words.add("You");
        words.add("How");
        words.add("Are");
        words.add("Hi");

        words.addAll(texts);
        System.out.println(words);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void makeIndexAble() {
        HashSet<String> words = new HashSet<>();
        words.add("Hello");
        words.add("You");
        words.add("How");
        words.add("Are");
        words.add("Hi");

        ArrayList<String> newTexts = new ArrayList<>(words);
        System.out.println(newTexts);
        if (!newTexts.isEmpty()) {
            System.out.println(newTexts.get(0) + "  " + newTexts.get(newTexts.size() - 1));
        }
    }

    public static void removalBehavior() {
        HashSet<String> mainEmails = new HashSet<>(List.of(
                "john@gmail.com",
                "alice@gmail.com",
                "mike@gmail.com",
                "greg@gmail.com",
                "smith@gmail.com"
        ));

        System.out.println("Main list -> " + mainEmails);
        HashSet<String> emailForRemoval = new HashSet<>(Arrays.asList("greg@gmail.com", "mike@gmail.com"));
        System.out.println("emailForRemoval = " + emailForRemoval);

        mainEmails.removeAll(emailForRemoval);
        System.out.println("Main list after removal -> " + mainEmails);
    }
}
