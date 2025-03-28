package day32_inheritance;


public class Lion extends Animal {

    private int weight;
    private boolean isMale;

    public Lion(String color, String name, int age, int weight, boolean isMale) {
        super(color, name, age);
        this.weight = weight;
        this.isMale = isMale;
    }

    public Lion(String color, String name, int age, int weight) {
        super(color, name, age);
        this.weight = weight;
    }

    public Lion(String color, String name, int weight, boolean isMale) {
        super(color, name);
        this.weight = weight;
        this.isMale = isMale;
    }

    public void displayInfo() {
        System.out.println("weight = " + weight);
        System.out.println("Age = " + super.getAge());
        System.out.println("Color = " + super.getColor());
        System.out.println("Name = " + super.getName());
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}


