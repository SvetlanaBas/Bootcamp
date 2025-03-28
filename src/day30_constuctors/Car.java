package day30_constuctors;

public class Car {

    String make;
    String model;
    int year;
    double price;

    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 2000;
        this.price = 0.0;
    }

    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = 0.0; // default price
    }


    public Car(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.year = 2000; // default year
        this.price = price;
    }


    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Price: $" + this.price);
        System.out.println();
    }


    public double calculateDiscountedPrice(double discountPercentage) {
        return this.price - (this.price * discountPercentage / 100);
    }
}
