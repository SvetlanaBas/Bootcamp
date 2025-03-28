package day34_polymorphism;

public class Room {
    private int roomNumber;
    private double basePrice;

    public Room(int roomNumber, double basePrice) {
        this.roomNumber = roomNumber;
        this.basePrice = basePrice;
    }
    public double calculatePrice() {
        return basePrice;
    }
    public double calculatePrice(int days) {
        return basePrice * days;
    }
    public double calculatePrice(int days,double discountPercent) {
        double discount = (basePrice * days) * (discountPercent / 100);
        return (basePrice * days) - discount;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
