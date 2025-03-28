package day32_practice;

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(80);
        vehicle.displayInfo();


        Car car = new Car(60);
        car.displayInfo();


        Bicycle bicycle = new Bicycle(20);
        bicycle.displayInfo();

        System.out.println();
    }
}
