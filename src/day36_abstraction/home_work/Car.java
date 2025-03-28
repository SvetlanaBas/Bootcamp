package day36_abstraction.home_work;

public class Car extends Vehicle implements DriveAble {

    private double fuelCapacity;
    private double fuelConsumptionRate;

    public Car(String brand, int year, double price, double fuelCapacity, double fuelConsumptionRate) {
        super(brand, year, price);
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumptionRate = fuelConsumptionRate;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelConsumptionRate() {
        return fuelConsumptionRate;
    }

    public void setFuelConsumptionRate(double fuelConsumptionRate) {
        this.fuelConsumptionRate = fuelConsumptionRate;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started - Vroom!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void drive(double distance) {
        double fuelConsumed = distance * fuelConsumptionRate;
        if (fuelConsumed <= fuelCapacity) {
            fuelCapacity -= fuelConsumed;
            System.out.println("Car drove " + distance + " km. Fuel left: " + fuelCapacity + " liters.");
        } else {
            System.out.println("Not enough fuel to drive " + distance + " km.");
        }
    }
}

