package day32_homework;

public class Vehicle {
    private String make;
    private String model;
    private int year;


    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this. year = year;
    }

    public void drive() {
        System.out.println("Driving the vehicle");
    }
}
