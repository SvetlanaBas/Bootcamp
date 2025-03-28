package day36_abstraction.dessert_test;

public abstract class Dessert {
    private String name;
    private int basePrice;

    public Dessert(String name, int basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();
    public abstract void displayIngredients();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }
}
