package day35_polymorphism_practice.athlete;

public class Swimmer extends Athlete {
    private String swimStyle;
    private double poolLength;

    public Swimmer(String name, int age, String country, String swimStyle, double poolLength) {
        super(name, age, country);
        this.swimStyle = swimStyle;
        this.poolLength = poolLength;
    }

    @Override
    public void perform() {
        System.out.println(super.getName() + " is swimming in " + swimStyle + " style.");
    }

    public void changeSwimStyle(String newStyle) {
        swimStyle = newStyle;
        System.out.println(super.getName() + " has changed swimming style to " + swimStyle + ".");
    }

    public double calculateLaps(double totalDistance) {
        return totalDistance / poolLength;
    }
}
