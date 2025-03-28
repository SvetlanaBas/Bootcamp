package day36_abstraction.technology_test;

public class Phone extends Technology {
    private boolean isAndroid;
    private String phoneModel;

    public Phone(String color, String memory, String size, boolean isAndroid, String phoneModel) {
        super(color, memory, size);
        this.isAndroid = isAndroid;
        this.phoneModel = phoneModel;
    }

    @Override
    public void working() {
        System.out.println("Based on battery it can work whole day");
    }

    @Override
    public void displayInfo() {
        System.out.println("isAndroid = " + isAndroid);
        System.out.println("phoneModel = " + phoneModel);
        System.out.println("Color = " + super.getColor());
        System.out.println("Memory = " + super.getMemory());
        System.out.println("Size = " + super.getSize());
    }

    public boolean isAndroid() {
        return isAndroid;
    }

    public void setAndroid(boolean android) {
        isAndroid = android;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }
}

