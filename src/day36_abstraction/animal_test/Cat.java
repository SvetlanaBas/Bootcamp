package day36_abstraction.animal_test;

public class Cat extends Animal implements Runnable {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " meow!!!");
    }


    @Override
    public void run() {
        System.out.println(super.getName() + " Cat is running");
    }
}