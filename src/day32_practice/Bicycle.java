package day32_practice;

public class Bicycle extends Vehicle{
        public Bicycle(int speed){
            super(speed);
        }
        public void displayInfo (){
            System.out.println("This bicycle has a speed of " + super.getSpeed() + " km/h.");
        }
    }