package day32_inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("White", "Barsik", 2);
        System.out.println(cat.getAge());
        cat.sayHi();


        Lion lion = new Lion("Yellow", "Simba", 5, 250);
        lion.displayInfo();
        lion.sayHi();


        Dog dog = new Dog("Black", "test", 3, 45);
        System.out.println(dog.getSpeed());
        dog.sayHi();
    }
}
