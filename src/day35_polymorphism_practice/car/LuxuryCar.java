package day35_polymorphism_practice.car;

public class LuxuryCar extends Car {
    private boolean chauffeurIncluded;
    private double luxuryTaxPercent;

    public LuxuryCar(String brand, double baseDailyRate, int modelYear,
                     long mileage, boolean chauffeurIncluded, double luxuryTaxPercent) {
        super(brand, baseDailyRate, modelYear, mileage);
        this.chauffeurIncluded = chauffeurIncluded;
        this.luxuryTaxPercent = luxuryTaxPercent;
    }
    public double calculateRentalCost(int days) {
        double chauffeurFee;
        if (chauffeurIncluded) {
            chauffeurFee = 50.0 * days;
        } else {
            return 0;
        }
        double totalCost = super.calculateRentalCost(days) + chauffeurFee + (super.calculateRentalCost(days) * luxuryTaxPercent / 100);
        return totalCost;
    }
}
