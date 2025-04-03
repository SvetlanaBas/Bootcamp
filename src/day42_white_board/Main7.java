package day42_white_board;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5,1,2,3,4,5));
        HashSet<Integer> unique = new HashSet<>(nums);
        ArrayList<Integer> result = new ArrayList<>(unique);
        System.out.println(result);
    }
}
