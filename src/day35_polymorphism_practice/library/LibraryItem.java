package day35_polymorphism_practice.library;

public class LibraryItem {
    protected String title;
    protected int itemId;
    protected int publicationYear;
    protected int availableCopies;

    public LibraryItem(String title, int itemId, int publicationYear, int availableCopies) {
        this.title = title;
        this.itemId = itemId;
        this.publicationYear = publicationYear;
        this.availableCopies = availableCopies;
    }

    public void checkOut() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println(title + " checked out. Remaining copies: " + availableCopies);
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void checkOut(int days) {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println(title + " checked out for " + days + " days. Remaining copies: " + availableCopies);
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnItem() {
        availableCopies++;
        System.out.println(title + " returned. Available copies: " + availableCopies);
    }
}
