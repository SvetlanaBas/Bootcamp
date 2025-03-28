package day30_constuctors;

public class TestLaptop {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        System.out.println("Laptop 1 Info:");
        laptop1.displayInfo();
        laptop1.upgradeRAM(16);
        laptop1.changeColor("Blue");
        System.out.println();


        Laptop laptop2 = new Laptop("Dell", "Gray", 16, 17.3, "Intel i7");
        System.out.println("Laptop 2 Info:");
        laptop2.displayInfo();
        laptop2.upgradeRAM(32);
        laptop2.changeColor("Black");
        System.out.println();


        Laptop laptop3 = new Laptop("HP", 12);
        System.out.println("Laptop 3 Info:");
        laptop3.displayInfo();
        laptop3.upgradeRAM(24);
        laptop3.changeColor("Red");
    }
}
