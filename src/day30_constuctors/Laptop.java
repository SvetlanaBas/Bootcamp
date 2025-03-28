package day30_constuctors;

public class Laptop {
    String brand;
    String color;
    int RAM;
    double size;
    String processor;


    public Laptop() {
        this.brand = "Unknown";
        this.color = "Black";
        this.RAM = 8;
        this.size = 15.6;
        this.processor = "Intel i5";
    }


    public Laptop(String brand, String color, int RAM, double size, String processor) {
        this.brand = brand;
        this.color = color;
        this.RAM = RAM;
        this.size = size;
        this.processor = processor;
    }

    public Laptop(String brand, int RAM) {
        this.brand = brand;
        this.color = "Silver";
        this.RAM = RAM;
        this.size = 14.0;
        this.processor = "AMD Ryzen 5";
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("RAM: " + RAM + "GB");
        System.out.println("Size: " + size + " inches");
        System.out.println("Processor: " + processor);
    }


    public void upgradeRAM(int newRAM) {
        System.out.println("Upgrading RAM from " + RAM + "GB to " + newRAM + "GB");
        this.RAM = newRAM;
    }


    public void changeColor(String newColor) {
        System.out.println("Changing color from " + color + " to " + newColor);
        this.color = newColor;
    }
}

