package day36_abstraction.gameCharacter_test;

public abstract class GameCharacter {
    private String name;
    private int level;
    private int health;
    private double energy;

    public GameCharacter(String name, int level, int health, double energy) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.energy = energy;
    }

    public abstract void attack();
    public abstract void defend();

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }
}

