package day30_constuctors;

public class TestHW1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.displayCarDetails();
        System.out.println("Discounted Price (10%): $" + car1.calculateDiscountedPrice(10));
        System.out.println("---------");

        Car car2 = new Car();
        car2.displayCarDetails();
        System.out.println("Discounted Price (15%): $" + car2.calculateDiscountedPrice(15));
        System.out.println("---------");


        Car car3 = new Car("Toyota", "Corolla", 2020, 20000.0);
        car3.displayCarDetails();
        System.out.println("Discounted Price (5%): $" + car3.calculateDiscountedPrice(5));
        System.out.println("---------");

        Car car4 = new Car("Honda", "Civic", 2019, 18000.0);
        car4.displayCarDetails();
        System.out.println("Discounted Price (20%): $" + car4.calculateDiscountedPrice(20));
        System.out.println("---------");


        Car car5 = new Car("Ford", "Focus", 2018);
        car5.displayCarDetails();
        System.out.println("Discounted Price (10%): $" + car5.calculateDiscountedPrice(10));
        System.out.println("---------");

        Car car6 = new Car("Chevrolet", "Malibu", 2021);
        car6.displayCarDetails();
        System.out.println("Discounted Price (25%): $" + car6.calculateDiscountedPrice(25));
        System.out.println("---------");


        Car car7 = new Car("Nissan", "Altima", 22000.0);
        car7.displayCarDetails();
        System.out.println("Discounted Price (15%): $" + car7.calculateDiscountedPrice(15));
        System.out.println("---------");

        Car car8 = new Car("BMW", "X5", 45000.0);
        car8.displayCarDetails();
        System.out.println("Discounted Price (30%): $" + car8.calculateDiscountedPrice(30));
        System.out.println("---------");
    }
}
