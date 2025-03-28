package day35_polymorphism_practice.car;

public class Car {
    private String brand;
    private double baseDailyRate;
    private int modelYear;
    private long mileage;

    public Car(String brand, double baseDailyRate, int modelYear, long mileage) {
        this.brand = brand;
        this.baseDailyRate = baseDailyRate;
        this.modelYear = modelYear;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getBaseDailyRate() {
        return baseDailyRate;
    }

    public void setBaseDailyRate(double baseDailyRate) {
        this.baseDailyRate = baseDailyRate;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public double calculateRentalCost(int days){
        return  baseDailyRate * days;
    }

    public double calculateRentalCost(int days, double discountPercent) {
        double totalCost = baseDailyRate * days;
        return totalCost - (totalCost * discountPercent / 100);
    }

    public double calculateMileageCharge(int days) {
        int mileageCharge = 0;
        if(mileage > 100000){
            mileageCharge = 5 * days;
        }
        return mileageCharge;
    }
}
