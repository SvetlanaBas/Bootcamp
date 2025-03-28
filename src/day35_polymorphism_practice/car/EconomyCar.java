package day35_polymorphism_practice.car;

public class EconomyCar extends Car {
    private double fuelEfficiency; // in miles per gallon (mpg)
    private boolean hasEcoMode;

    public EconomyCar(String brand, double baseDailyRate,
                      int modelYear, long mileage, double fuelEfficiency, boolean hasEcoMode) {
        super(brand, baseDailyRate, modelYear, mileage);
        this.fuelEfficiency = fuelEfficiency;
        this.hasEcoMode = hasEcoMode;
    }

    @Override
    public double calculateRentalCost(int days) {
        double baseCost = super.calculateRentalCost(days);
        if (days >= 7) {
            return baseCost * 0.90;
        }
        return baseCost;
    }

    public double calculateFuelSavings(double avgDistancePerDay, int days) {
        double totalFuelUsed = (avgDistancePerDay * days) / fuelEfficiency;
        return totalFuelUsed;
    }
}
