package day36_abstraction.animal_test;

public class Dog extends Animal implements SwimAble, Runnable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " woof");
    }


    @Override
    public void run() {
        System.out.println(super.getName() + " Dog is running");

    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " Dog is swimming");

    }
}
