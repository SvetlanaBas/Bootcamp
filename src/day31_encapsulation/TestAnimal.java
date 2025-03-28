package day31_encapsulation;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Test");
        System.out.println(animal.getName());
        animal.setName("Testing");
        animal.displayInfo();
        System.out.println("----------------");
        animal.setType("Dog");
        animal.setAge(-6);
        animal.displayInfo();
    }
}
