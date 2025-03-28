package day32_homework;

public class Garage {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Model Y", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, 2);

        car.drive();
        car.start();

        motorcycle.drive();
        motorcycle.rev();
    }
}

