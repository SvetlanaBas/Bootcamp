package day36_abstraction.animal_test;

import java.util.ArrayList;

public class TestAnimal {
    public static void main(String[] args) {
        Bird bird = new Bird("Bird", 5);
        Cat cat = new Cat("Cat", 5);
        Dog dog = new Dog("Dog", 10);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(cat);
        animals.add(dog);

        for (Animal animal : animals) {
            animal.makeSound();
        }

        System.out.println("-----------------");
        ArrayList<SwimAble> swimAbles = new ArrayList<>();
        swimAbles.add(bird);
        swimAbles.add(dog);
        for (SwimAble swimAble : swimAbles) {
            swimAble.swim();
        }
    }
}
