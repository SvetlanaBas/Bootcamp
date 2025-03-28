package day36_abstraction.dessert_test;

public class Cake extends Dessert {
    private int layers;
    private String flavor;

    public Cake(String name, int basePrice, int layers, String flavor) {
        super(name, basePrice);
        this.layers = layers;
        this.flavor = flavor;
    }

    @Override
    public double calculatePrice() {
        return super.getBasePrice() + (2 * layers);
    }

    @Override
    public void displayIngredients() {
        System.out.println(" Cake: " + super.getName());
        System.out.println("Base Price: " + super.getBasePrice());
        System.out.println("Layers: " + layers);
        System.out.println("Flavor: " + flavor);
    }


    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
