package day35_polymorphism_practice.athlete;

public class Runner extends Athlete{
    private double bestTime;
    private String trackType;

    public Runner(String name, int age, String country, double bestTime, String trackType) {
        super(name, age, country);
        this.bestTime = bestTime;
        this.trackType = trackType;
    }

    @Override
    public void perform() {
        System.out.println(super.getName() + " is running on a " + trackType + " track with a best time of " + bestTime + " seconds.");
    }

    public void updateBestTime(double newTime) {
        if (newTime < bestTime) {
            bestTime = newTime;
            System.out.println(super.getName() + " has a new best time: " + bestTime + " seconds.");
        } else {
            System.out.println(super.getName() + "'s best time remains: " + bestTime + " seconds.");
        }
    }

    public double calculateSpeed(double distanceMeters) {
        return distanceMeters / bestTime;
    }
}
