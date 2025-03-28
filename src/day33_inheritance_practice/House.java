package day33_inheritance_practice;

public class House extends Property {
    private int numberOfFloors;
    private boolean hasGarage;
    private double gardenArea;


    public House(String address, double price, double area, int yearBuilt, String ownerName,
                 int numberOfFloors, boolean hasGarage, double gardenArea) {
        super(address, price, area, yearBuilt, ownerName);
        this.numberOfFloors = numberOfFloors;
        this.hasGarage = hasGarage;
        this.gardenArea = gardenArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public double getGardenArea() {
        return gardenArea;
    }

    public void setGardenArea(double gardenArea) {
        this.gardenArea = gardenArea;
    }
    public double calculateGardenPercentage() {
        return (gardenArea / super.getArea()) * 100;
    }

    public void displayHouseSummary() {
        System.out.println("House Summary:");
        System.out.println("Address: " + super.getAddress());
        System.out.println("Owner: " + super.getOwnerName());
        System.out.println("Price: $" + super.getPrice());
        System.out.println("Area: " + super.getArea() + " sqm");
        System.out.println("Year Built: " + super.getYearBuilt());
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Garage: " + (hasGarage ? "Yes" : "No"));
        System.out.println("Garden Area: " + gardenArea + " sqm");
        System.out.println("Garden Percentage: " + calculateGardenPercentage() + "%");
    }
}
