package day34_polymorphism;

public class SuiteRoom extends Room {
    private boolean hasOceanView;

    public SuiteRoom(int roomNumber, double basePrice, boolean hasOceanView) {
        super(roomNumber, basePrice);
        this.hasOceanView = hasOceanView;
    }

    @Override
    public double calculatePrice() {
        double basePrice = 120.0;
        return basePrice;
    }

    public void displaySuiteRoom() {
        System.out.println("Room Number = " + super.getRoomNumber());
        System.out.println("Base Price = " + super.getBasePrice());
        System.out.println("Has Ocean View = " + hasOceanView);
    }

    public boolean isHasOceanView() {
        return hasOceanView;
    }

    public void setHasOceanView(boolean hasOceanView) {
        this.hasOceanView = hasOceanView;
    }
}
