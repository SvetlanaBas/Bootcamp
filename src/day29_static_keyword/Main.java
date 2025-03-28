package day29_static_keyword;

public class Main {
    public static void main(String[] args) {
        testBookLibrary();

    }

    public static void testBookLibrary() {
        BookLibrary firstBook = new BookLibrary();
        firstBook.author = " Steven King";
        firstBook.name = "It";
        firstBook.publishedDate = "2020 September 1";
        firstBook.printInfo();

        System.out.println(BookLibrary.address);
        System.out.println(BookLibrary.address);


        BookLibrary secondBook = new BookLibrary();
        secondBook.author = "Testing";
        secondBook.name = "SDET";
        secondBook.publishedDate = "2024 September 1";
        secondBook.printInfo();
    }
}
