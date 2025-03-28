package day35_polymorphism_practice.library;

public class Test {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 101, 2020, 3, "John Doe", 500, "Education");
        Magazine magazine = new Magazine("Tech Today", 201, 2024, 5, 45, true, "March");

        book.displayBookInfo();
        System.out.println("Estimated reading time: " + book.estimateReadingTime(50) + " hours");
        book.checkOut();
        book.returnItem();

        System.out.println();

        magazine.checkOut();
        System.out.println("Is monthly edition: " + magazine.isMonthlyEdition());
        magazine.returnItem();
    }
}
