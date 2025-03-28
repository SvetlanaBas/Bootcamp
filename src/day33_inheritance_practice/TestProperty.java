package day33_inheritance_practice;

public class TestProperty {
    public static void main(String[] args) {
        House house = new House("28120 Peacock Dr, Los Angeles", 1180.0, 2500,
                2019, "Mark Lee", 2, true, 10.0);
        house.displayHouseSummary();
        double resultGardenPercentage = house.calculateGardenPercentage();
        System.out.println("resultGardenPercentage = " + resultGardenPercentage);
        double resultPrice = house.calculatePricePerSqm();
        System.out.println("resultPrice = " + resultPrice);


        Apartment apartment = new Apartment("18150 Kenmore Ave, Las Vegas", 850.0,
                1100, 2011, "Anna Lee", 10, 300, true);
        System.out.println("apartment.annualMaintenanceCost() = " + apartment.annualMaintenanceCost());
        System.out.println(apartment.isHighFloor());
    }
}

