package day36_abstraction.gameCharacter_test;

public class test {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Thor", 5, 100, 50, 20, 10);
        Mage mage = new Mage("Merlin", 4, 80, 40, 100, 30, 2);
        Dragon dragon = new Dragon("Smaug", 7, 200, 150, 15, 50, 1.5, 120, 3);

        System.out.println("--- Testing Warrior ---");
        warrior.attack();
        warrior.defend();
        warrior.takeDamage(30);

        System.out.println("--- Testing Mage ---");
        mage.attack();
        mage.defend();
        mage.heal(20);

        System.out.println("--- Testing Dragon ---");
        dragon.attack();
        dragon.defend();
        dragon.fly(10);
        dragon.heal(50);
    }
}
