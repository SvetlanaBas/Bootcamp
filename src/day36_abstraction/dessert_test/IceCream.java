package day36_abstraction.dessert_test;

public class IceCream extends Dessert {
    private int scoops;
    private boolean hasSprinkles;

    public IceCream(String name, int basePrice, int scoops, boolean hasSprinkles) {
        super(name, basePrice);
        this.scoops = scoops;
        this.hasSprinkles = hasSprinkles;
    }

    @Override
    public double calculatePrice() {
        double price = super.getBasePrice() + (1.5 * scoops);
        if (hasSprinkles) {
            price += 0.5;
        }
        return price;
    }

    @Override
    public void displayIngredients() {
        System.out.println("Ice Cream: " + super.getName());
        System.out.println("Base Price: " + super.getBasePrice());
        System.out.println("Scoop: " + scoops);
        System.out.println("Has Sprinkles: " + hasSprinkles);
        }




    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public boolean isHasSprinkles() {
        return hasSprinkles;
    }

    public void setHasSprinkles(boolean hasSprinkles) {
        this.hasSprinkles = hasSprinkles;
    }
}
