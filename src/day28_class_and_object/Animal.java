package day28_class_and_object;

public class Animal {

            String name;
            String habitat;
            String diet;
            Double size;
            String behavior;
            String status;


            public void flies() {
                System.out.println(name + " while flying, has strong eyesight ");
            }

            public void dives () {
                System.out.println(name + " for hunting dives at incredible speeds (up to 160 km/h or 100 mph) ");

            }

            public void printInfo () {
                System.out.println("name = " + name);
                System.out.println("habitat = " + habitat);
                System.out.println("diet = " + diet);
                System.out.println("size = " + size);
                System.out.println("behavior = " + behavior);
                System.out.println("status = " + status);
            }
        }

