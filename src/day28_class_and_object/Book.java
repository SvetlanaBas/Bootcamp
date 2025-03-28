package day28_class_and_object;


public class Book {
    String name;
    String author;
    Integer pages;
    Integer year;
    String publishingHouse;

    public void byPulitser() {
        System.out.println("Sir " + author + " write " + name + ", " + year);
    }
    public void benefitHolder() {
        System.out.println("name = " + name + " : " + publishingHouse);
    }
    public void printInfo() {
        System.out.println("name = " + name);
        System.out.println("author = " + author);
        System.out.println("pages = " + pages);
        System.out.println("year = " + year);
        System.out.println("publishingHouse = " + publishingHouse);
    }
}

