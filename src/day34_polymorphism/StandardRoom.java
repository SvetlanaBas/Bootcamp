package day34_polymorphism;

public class StandardRoom extends  Room{
    private boolean hasBreakfastIncluded;

    public StandardRoom(int roomNumber, double basePrice, boolean hasBreakfastIncluded) {
        super(roomNumber, basePrice);
        this.hasBreakfastIncluded = hasBreakfastIncluded;
    }
    @Override
    public double calculatePrice() {
        double basePrice = 50.0;
        return basePrice;
    }
    public void displayStandardRoom () {
        System.out.println("Room Number = " + super.getRoomNumber());
        System.out.println("Base Price = " + super.getBasePrice());
        System.out.println("Has Breakfast Included = " + hasBreakfastIncluded);
    }

    public boolean isHasBreakfastIncluded() {
        return hasBreakfastIncluded;
    }

    public void setHasBreakfastIncluded(boolean hasBreakfastIncluded) {
        this.hasBreakfastIncluded = hasBreakfastIncluded;
    }
}
