package day35_polymorphism_practice.library;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private boolean monthlyEdition;
    private String publicationMonth;

    public Magazine(String title, int itemId, int publicationYear, int availableCopies, int issueNumber, boolean monthlyEdition, String publicationMonth) {
        super(title, itemId, publicationYear, availableCopies);
        this.issueNumber = issueNumber;
        this.monthlyEdition = monthlyEdition;
        this.publicationMonth = publicationMonth;
    }

    @Override
    public void checkOut() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Magazine '" + title + "' (Issue: " + issueNumber + ", " + publicationMonth + ") checked out. Remaining copies: " + availableCopies);
        } else {
            System.out.println("Magazine '" + title + "' is not available.");
        }
    }

    public boolean isMonthlyEdition() {
        return monthlyEdition;
    }
}
