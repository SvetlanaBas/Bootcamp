package day30_constuctors;


    public class ReallyBeautifulCar {
        String model;
        int year;
        String color;
        int speed;
        int numberOfDoors;

        public ReallyBeautifulCar() {

        }

        public ReallyBeautifulCar(String model) {
            this.model = model;
            this.year = 2000;
            this.color = "Unknown";
        }

        public ReallyBeautifulCar(int numberOfDoors, String color, String model, int year) {
            this.model = model;
            this.year = year;
            this.color = color;
            this.numberOfDoors = numberOfDoors;
        }

        public ReallyBeautifulCar(String model, int year, String color, int speed) {
            this.model = model;
            this.year = year;
            this.color = color;
            this.speed = speed;
        }

        public ReallyBeautifulCar(String model, String color, int speed, int year) {
            this.model = model;
            this.year = year;
            this.color = color;
            this.speed = speed;
        }


        public void printInfo() {
            System.out.println("model = " + model);
            System.out.println("year = " + year);
            System.out.println("color = " + color);
            System.out.println("speed = " + speed);
        }

        public void drives() {
            System.out.println("Someone is driving " + model + " car");
        }
    }
