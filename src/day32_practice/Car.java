package day32_practice;

public class Car extends Vehicle{
    public Car(int speed){
        super(speed);
    }
    public void displayInfo (){
        System.out.println("This car has a speed of " + super.getSpeed() + " km/h.");
    }
}
