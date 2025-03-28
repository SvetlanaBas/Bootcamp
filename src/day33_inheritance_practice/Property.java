package day33_inheritance_practice;

public class Property {
    private String address;
    private double price;
    private double area;
    private int yearBuilt;
    private String ownerName;

    public Property(String address, double price, double area, int yearBuilt, String ownerName) {
        this.address = address;
        this.price = price;
        this.area = area;
        this.yearBuilt = yearBuilt;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getOwnerName() {
        return ownerName;
    }


    public double calculatePricePerSqm() {
        return price / area;
    }

    public int propertyAge(int currentYear) {
        return currentYear - yearBuilt;
    }
}
