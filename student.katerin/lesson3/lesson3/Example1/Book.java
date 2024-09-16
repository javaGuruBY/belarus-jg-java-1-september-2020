package lesson3.Example1;

public class Book {
    public String title;
    public String publisher;
    public String isbn;
    public int pageCount;

    public Book(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public Book(String title, String publisher, String isbn, int pageCount) {
        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
        this.pageCount = pageCount;
    }

    void printBook() {
        System.out.println("title = " + this.title);
        System.out.println("publisher = " + this.publisher);
        System.out.println("isbn = " + this.isbn);
        System.out.println("pageCount = " + this.pageCount);
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book myFirstBook = new Book("My first book", "Fox");
        System.out.println("1)");
        myFirstBook.printBook();

        Book mySecondBook = new Book("My second book", "Name", "134232", 155);
        System.out.println("2)");
        mySecondBook.printBook();
    }
}