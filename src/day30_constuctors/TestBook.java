package day30_constuctors;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997);
        book1.printInfo();
        Book book2 = new Book("The Hobbit", "J.R..R Tolkien");
        book2.printInfo();
        Book book3 = new Book("Some unknown title");
        book3.printInfo();
    }
}
