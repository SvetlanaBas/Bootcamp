package day28_class_and_object;

public class Main1 {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.name = "Eagle";
        animal.flies();

        animal.habitat = "Forests, mountains";
        animal.dives();

        animal.diet = "Carnivore -> fish, birds";
        animal.size = 2.5;
        animal.behavior = "strong flyers, sharp eyesight";
        animal.status = "endangered or stable";

        animal.printInfo();

    }
}
