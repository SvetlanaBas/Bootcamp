package day30_constuctors;

public class BookStore {
    String title;
    String author;
    double price;
    int quantity;

    public BookStore() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    public BookStore(String title, String author) {

        this.title = title;
        this.author = author;
        this.price = 0.0;
        this.quantity = 0;

    }

    public BookStore(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = 0;
    }

    public BookStore(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }
}
