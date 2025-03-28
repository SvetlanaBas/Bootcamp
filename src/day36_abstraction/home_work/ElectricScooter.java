package day36_abstraction.home_work;

public class ElectricScooter extends Vehicle implements DriveAble, ChargeAble {
    private double batteryLevel;
    private double batteryConsumptionRate;
    private double chargingRate;

    public ElectricScooter(String brand, int year, double price, double batteryLevel, double batteryConsumptionRate, double chargingRate) {
        super(brand, year, price);
        this.batteryLevel = batteryLevel;
        this.batteryConsumptionRate = batteryConsumptionRate;
        this.chargingRate = chargingRate;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public double getBatteryConsumptionRate() {
        return batteryConsumptionRate;
    }

    public void setBatteryConsumptionRate(double batteryConsumptionRate) {
        this.batteryConsumptionRate = batteryConsumptionRate;
    }

    public double getChargingRate() {
        return chargingRate;
    }

    public void setChargingRate(double chargingRate) {
        this.chargingRate = chargingRate;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric scooter motor activated.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric scooter motor deactivated.");
    }

    @Override
    public void drive(double distance) {
        double batteryUsed = distance * batteryConsumptionRate;
        if (batteryUsed <= batteryLevel) {
            batteryLevel -= batteryUsed;
            System.out.println("Scooter drove " + distance + " km. Battery left: " + batteryLevel + "%.");
        } else {
            System.out.println("Not enough battery to drive " + distance + " km.");
        }
    }

    @Override
    public void charge(double hours) {
        batteryLevel += hours * chargingRate;
        if (batteryLevel > 100) {
            batteryLevel = 100;
        }
        System.out.println("Scooter charged for " + hours + " hours. Battery level: " + batteryLevel + "%.");
    }
}
