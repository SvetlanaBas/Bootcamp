package day32_inheritance;


public class Dog extends Animal {

    private int speed;

    public Dog(String color, String name, int age, int speed) {
        super(color, name, age);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}


