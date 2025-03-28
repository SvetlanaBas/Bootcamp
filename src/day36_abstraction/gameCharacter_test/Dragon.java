package day36_abstraction.gameCharacter_test;

public class Dragon extends GameCharacter implements FlyAble, HealAble {
    private double wingSpan;
    private int firePower;
    private double flyingEnergyRate;
    private double mana;
    private double manaPerHealthPoint;

    public Dragon(String name, int level, int health, double energy, double wingSpan, int firePower, double flyingEnergyRate, double mana, double manaPerHealthPoint) {
        super(name, level, health, energy);
        this.wingSpan = wingSpan;
        this.firePower = firePower;
        this.flyingEnergyRate = flyingEnergyRate;
        this.mana = mana;
        this.manaPerHealthPoint = manaPerHealthPoint;
    }

    @Override
    public void attack() {
        double damage = firePower * getLevel() * 3;
        setEnergy(getEnergy() - (firePower * 0.2));
        System.out.println("Fiery breath attack causing damage: " + getEnergy());

    }

    @Override
    public void defend() {
        double damageReduced = wingSpan * 2;
        System.out.println("Damage reduced: " + damageReduced);
    }

    @Override
    public void fly(double distance) {
        double energyUsed = distance * flyingEnergyRate;
        setEnergy(getEnergy() - energyUsed);
        System.out.println("Dragon flies, consuming energy proportional to distance" + getEnergy());
    }

    @Override
    public void heal(int healthPoints) {
        double manaUsed = healthPoints * manaPerHealthPoint;
        mana = mana - manaUsed;
        setHealth(getHealth() + healthPoints);
        System.out.println("Restores health points by consuming mana: " + getHealth());
    }
}
