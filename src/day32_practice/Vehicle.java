package day32_practice;

public class Vehicle {
    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("This vehicle has a speed of " + speed + "km/h");

    }
}
