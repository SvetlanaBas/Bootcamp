package day35_polymorphism_practice.athlete;

public class TesrAthlete {
    public static void main(String[] args) {
        Runner runner = new Runner("Usain Bolt", 36, "Jamaica", 9.58, "Outdoor");
        runner.perform();
        runner.updateBestTime(9.50);
        System.out.println("Speed: " + runner.calculateSpeed(100) + " m/s");
        runner.awardMedal();

        Swimmer swimmer = new Swimmer("Michael Phelps", 38, "USA", "Butterfly", 50);
        swimmer.perform();
        swimmer.changeSwimStyle("Freestyle");
        System.out.println("Laps for 400m: " + swimmer.calculateLaps(400));
        swimmer.awardMedal();
    }
}
