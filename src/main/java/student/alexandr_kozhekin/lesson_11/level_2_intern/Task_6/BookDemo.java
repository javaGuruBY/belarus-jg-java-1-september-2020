package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6;

public class BookDemo {
    public static void main(String[] args) {

        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();

        Book book1 = new Book("A1", "T1");
        Book book2 = new Book("A2", "T2");
        Book book3 = new Book("A3", "T3");
        Book book4 = new Book("A4", "T4");
        Book book5 = new Book("A5", "T5");
        Book book6 = new Book("A6", "T6");

        bookDatabaseImpl.save(book1);
        bookDatabaseImpl.save(book2);
        bookDatabaseImpl.save(book3);
        bookDatabaseImpl.save(book4);
        bookDatabaseImpl.save(book5);
        bookDatabaseImpl.save(book6);


        System.out.println(bookDatabaseImpl.books);
        System.out.println(bookDatabaseImpl.bookID);

        System.out.println(bookDatabaseImpl.deleteBook(book3));

        System.out.println(bookDatabaseImpl.books);
        System.out.println(bookDatabaseImpl.bookID);

        System.out.println(bookDatabaseImpl.deleteBook(2L));

        System.out.println(bookDatabaseImpl.books);
        System.out.println(bookDatabaseImpl.bookID);

    }
}