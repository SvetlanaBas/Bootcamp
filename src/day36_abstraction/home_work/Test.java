package day36_abstraction.home_work;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 30000, 50, 0.08);
        ElectricScooter scooter = new ElectricScooter("Xiaomi", 2023, 800, 100, 2, 10);

        System.out.println("--- Car Test ---");
        car.displayInfo();
        car.startEngine();
        car.drive(100);
        car.stopEngine();

        System.out.println("--- Electric Scooter Test ---");
        scooter.displayInfo();
        scooter.startEngine();
        scooter.drive(30);
        scooter.charge(2);
        scooter.stopEngine();
    }
}
