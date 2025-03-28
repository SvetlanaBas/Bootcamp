package day35_polymorphism_practice.athlete;

public class Athlete {
    private String name;
    private int age;
    private String country;
    private int totalMedal;

    public Athlete(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.totalMedal = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTotalMedal() {
        return totalMedal;
    }

    public void setTotalMedal(int totalMedal) {
        this.totalMedal = totalMedal;
    }

    public void perform() {
        System.out.println(name + " is performing in their sport.");
    }

    public void perform(String event) {
        System.out.println(name + " is performing in " + event + ".");
    }

    public void awardMedal() {
        totalMedal++;
        System.out.println(name + " has won a medal! Total medals: " + totalMedal);
    }
}
