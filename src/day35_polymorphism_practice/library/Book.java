package day35_polymorphism_practice.library;

public class Book extends LibraryItem {
    private String author;
    private int pageCount;
    private String genre;

    public Book(String title, int itemId, int publicationYear, int availableCopies, String author, int pageCount, String genre) {
        super(title, itemId, publicationYear, availableCopies);
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
    }

    @Override
    public void checkOut() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book '" + title + "' by " + author + " checked out. Remaining copies: " + availableCopies);
        } else {
            System.out.println("Book '" + title + "' is not available.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pageCount + ", Genre: " + genre);
    }

    public double estimateReadingTime(double avgPagesPerHour) {
        return pageCount / avgPagesPerHour;
    }
}
