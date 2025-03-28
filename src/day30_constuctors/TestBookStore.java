package day30_constuctors;

public class TestBookStore {
    public static void main(String[] args) {
        BookStore book1 = new BookStore();
        BookStore book2 = new BookStore("The Great Gatsby", "F. Scott Fitzgerald");
        BookStore book3 = new BookStore("1984", "George Orwell", 9.99);
        BookStore book4 = new BookStore("To Kill a Mockingbird", "Harper Lee", 7.99, 10); // Common constructor

        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();
        book4.displayBookDetails();

        System.out.println("Total Price for Book 3: $" + book3.calculateTotalPrice());
        System.out.println("Total Price for Book 4: $" + book4.calculateTotalPrice());
    }
}
