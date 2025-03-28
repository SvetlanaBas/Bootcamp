package day28_class_and_object;

public class Main3 {
    public static void main(String[] args) {
        testBook();
    }

    public static void testBook() {
        Book book1 = new Book();
        book1.name = "War and Peace";
        book1.author = "Leo Tolstoy";
        book1.year = 2025;
        book1.pages = 1200;
        book1.publishingHouse = "RonaldAxe Corp.";

        book1.byPulitser();
        book1.benefitHolder();

        Book book2 = new Book();
        book2.name = "Financier";
        book2.author = "Theodor Driser";
        book2.year = 2025;
        book2.pages = 700;
        book2.publishingHouse = "RonaldAxe Corp.";

        book2.byPulitser();
        book2.benefitHolder();

        Book book3 = new Book();
        book3.name = "Contitution";
        book3.author = "American people";
        book3.year = 1800;
        book3.pages = 999;
        book3.publishingHouse = "US";

        book3.byPulitser();
        book3.benefitHolder();

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
