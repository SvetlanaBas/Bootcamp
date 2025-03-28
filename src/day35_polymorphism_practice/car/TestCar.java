package day35_polymorphism_practice.car;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 50.0, 2020, 80000);
        EconomyCar economyCar = new EconomyCar("Honda", 40.0,
                2019, 120000, 30.5, true);
        LuxuryCar luxuryCar = new LuxuryCar("Mercedes", 200.0,
                2022, 50000, true, 15.0);


        System.out.println("Car Rental Cost: $" + car.calculateRentalCost(5));
        System.out.println("Car Discounted Rental Cost: $" + car.calculateRentalCost(5, 10));
        System.out.println("Car Mileage Charge: $" + car.calculateMileageCharge(5));

        System.out.println("Economy Car Rental Cost: $" + economyCar.calculateRentalCost(7));
        System.out.println("Economy Car Fuel Savings: " + economyCar.calculateFuelSavings(100, 7) + " gallons");

        System.out.println("Luxury Car Rental Cost: $" + luxuryCar.calculateRentalCost(3));
    }
}
