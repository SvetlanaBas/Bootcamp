package day36_abstraction.technology_test;

public abstract class Technology {
    private String color;
    private String memory;
    private String size;

    public Technology(String color, String memory, String size) {
        this.color = color;
        this.memory = memory;
        this.size = size;
    }

    public abstract void working();

    public abstract void displayInfo();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
