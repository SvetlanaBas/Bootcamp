package day36_abstraction.gameCharacter_test;

public class Warrior extends GameCharacter {
    private int strength;
    private int armor;

    public Warrior(String name, int level, int health, double energy, int strength, int armor) {
        super(name, level, health, energy);
        this.strength = strength;
        this.armor = armor;
    }

    @Override
    public void attack() {
        double damage = strength * super.getLevel() * 1.5;
        System.out.println("Damage: " + damage);
    }

    @Override
    public void defend() {
        double damageReduced = armor * 0.8;
        System.out.println("Damage reduced: " + damageReduced);
    }
}
