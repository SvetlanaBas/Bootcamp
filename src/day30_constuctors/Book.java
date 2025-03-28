package day30_constuctors;

public class Book {
        String title;
        String author;
        int yearPublished;


        public Book(String title, String author, int yearPublished) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
        }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.yearPublished = 2000;
        }

    public Book(String title) {
        this.title = title;
        this.author = "Unknow";
        this.yearPublished = 2000;

    }
        public void printInfo() {
            System.out.println("Title = " + title);
            System.out.println("Author = " + author);
            System.out.println("Year published= " + yearPublished);
        }
    }
