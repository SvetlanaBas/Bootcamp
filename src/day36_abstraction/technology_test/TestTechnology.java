package day36_abstraction.technology_test;

import java.util.ArrayList;

public class TestTechnology {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("White", "256 GB", "17 inches", "16 inches", 96);
        Phone phone = new Phone("Black", "512 GB", "10", true, "Samsung");

        ArrayList<Technology> technologies = new ArrayList<>();
        technologies.add(laptop);
        technologies.add(phone);


        for (Technology technology : technologies) {
            technology.working();
            technology.displayInfo();
            System.out.println();
        }
    }
}
