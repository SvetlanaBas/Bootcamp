package day36_abstraction.gameCharacter_test;

public class Mage extends GameCharacter implements HealAble {
    private double mana;
    private int spellPower;
    private double manaPerHealthPoint;

    public Mage(String name, int level, int health, double energy, double mana, int spellPower, double manaPerHealthPoint) {
        super(name, level, health, energy);
        this.mana = mana;
        this.spellPower = spellPower;
        this.manaPerHealthPoint = manaPerHealthPoint;
    }

    @Override
    public void attack() {
        double manaConsumed = spellPower * 0.5;
        double damage = spellPower * super.getLevel() * 2;
        System.out.println("Mana consumed = " + manaConsumed);
        System.out.println("Damage = " + damage);
    }

    @Override
    public void defend() {
        double shieldStrength = mana * 0.1;
        double damageReduced = shieldStrength;
        mana -= shieldStrength;
        System.out.println("Shield Strength = " + shieldStrength);
        System.out.println("Damage Reduced = " + damageReduced);
        System.out.println("Mana = " + mana);
    }

    @Override
    public void heal(int healthPoints) {
        double manaUsed = healthPoints * manaPerHealthPoint;
        mana = mana - manaUsed;
        super.setHealth(super.getHealth() + healthPoints);
        System.out.println("manaUsed = " + manaUsed);
        System.out.println("mana = " + mana);
        System.out.println("Health = " + super.getHealth());
    }
}
