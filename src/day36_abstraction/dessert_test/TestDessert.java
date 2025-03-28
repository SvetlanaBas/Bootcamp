package day36_abstraction.dessert_test;

import java.util.ArrayList;
import java.util.List;

public class TestDessert {
    public static void main(String[] args) {
        Cake cake = new Cake("Medovik", 30, 2, "Honey");
        IceCream iceCream = new IceCream("Plombir", 5, 2, true);
        ArrayList<Dessert> desserts = new ArrayList<>(List.of(cake, iceCream));
        for (Dessert dessert : desserts) {
            dessert.calculatePrice();
            dessert.displayIngredients();
            System.out.println();
        }
    }

}
