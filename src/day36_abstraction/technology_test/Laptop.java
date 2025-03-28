package day36_abstraction.technology_test;

public class Laptop extends Technology {
    private String screenSize;
    private int batteryPer;

    public Laptop(String color, String memory, String size, String screenSize, int batteryPer) {
        super(color, memory, size);
        this.screenSize = screenSize;
        this.batteryPer = batteryPer;
    }

    @Override
    public void working() {
        System.out.println("Based on battery it can work 10 hours");
    }

    @Override
    public void displayInfo() {
        System.out.println("screenSize = " + screenSize);
        System.out.println("batteryPer = " + batteryPer);
        System.out.println("Color = " + super.getColor());
        System.out.println("Memory = " + super.getMemory());
        System.out.println("Size = " + super.getSize());
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryPer() {
        return batteryPer;
    }

    public void setBatteryPer(int batteryPer) {
        this.batteryPer = batteryPer;
    }
}
