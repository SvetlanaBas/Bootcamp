package day42_white_board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(List.of(12,25,33,86,73));
        Collections.sort(numbers);
        System.out.println("The second highest number is: " + numbers.get(numbers.size()-2));
    }
}
