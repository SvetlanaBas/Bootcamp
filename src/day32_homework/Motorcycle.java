package day32_homework;

public class Motorcycle extends Vehicle {
    private int numWheels;

    public Motorcycle(String make, String model, int year, int numWheels) {
        super(make, model, year);
        this.numWheels = numWheels;
    }

    public void rev() {
        System.out.println("Revving the engine");
    }
}
