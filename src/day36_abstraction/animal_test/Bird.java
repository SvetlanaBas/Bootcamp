package day36_abstraction.animal_test;

public class Bird extends Animal implements FlyAble, Runnable, SwimAble {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " chik chirik");
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " Bird is flying");
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " Bird is running");
    }

    @Override
    public void swim() {
        System.out.println(super.getName() + " Bird is swimming");
    }

}
