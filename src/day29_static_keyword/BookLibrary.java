package day29_static_keyword;

    public class BookLibrary {
        String author;
        String name;
        String publishedDate;
        static String address = "Des Plaines";

        public void printInfo() {
            System.out.println("author = " + author);
            System.out.println("name = " + name);
            System.out.println("publishedDate = " + publishedDate);
            System.out.println("address = " + address);
        }

    }

