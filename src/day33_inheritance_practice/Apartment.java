package day33_inheritance_practice;

public class Apartment extends Property {
    private int floorNumber;
    private double maintenanceFee;
    private boolean hasElevator;

    public Apartment(String address, double price, double area, int yearBuilt, String ownerName, int floorNumber, double maintenanceFee, boolean hasElevator) {
        super(address, price, area, yearBuilt, ownerName);
        this.floorNumber = floorNumber;
        this.maintenanceFee = maintenanceFee;
        this.hasElevator = hasElevator;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public double getMaintenanceFee() {
        return maintenanceFee;
    }

    public void setMaintenanceFee(double maintenanceFee) {
        this.maintenanceFee = maintenanceFee;
    }

    public boolean isHasElevator() {
        return hasElevator;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    public double annualMaintenanceCost() {
        return maintenanceFee * 12;
    }

    public boolean isHighFloor() {
        if (floorNumber > 5) {
            return true;
        } else {
            return false;
        }
    }
}
