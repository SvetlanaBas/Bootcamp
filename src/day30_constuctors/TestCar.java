package day30_constuctors;

public class TestCar {
    public static void main(String[] args) {
        ReallyBeautifulCar reallyBeautifulCar = new ReallyBeautifulCar();
        ReallyBeautifulCar reallyBeautifulCar1 = new ReallyBeautifulCar(4, "Color", "BMW", 2020);
        ReallyBeautifulCar reallyBeautifulCar2 = new ReallyBeautifulCar("Lexus", 2020, "Black", 260);
        ReallyBeautifulCar reallyBeautifulCar3 = new ReallyBeautifulCar("Lexus", 2020, "Black", 260);
        ReallyBeautifulCar reallyBeautifulCar4 = new ReallyBeautifulCar("Lexus", 2020, "Black", 260);
        reallyBeautifulCar.printInfo();
    }
}
