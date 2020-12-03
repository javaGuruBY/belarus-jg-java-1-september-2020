package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6;

public class BookDemo {
    public static void main(String[] args) {

        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();

        Book book1 = new Book("A2", "T1");
        Book book2 = new Book("A1", "T2");
        Book book3 = new Book("A1", "T3");
        Book book4 = new Book("A1", "T4");
        Book book5 = new Book("A1", "T2");
        Book book6 = new Book("A2", "T6");

        bookDatabaseImpl.save(book1);
        bookDatabaseImpl.save(book2);
        bookDatabaseImpl.save(book3);
        bookDatabaseImpl.save(book4);
        bookDatabaseImpl.save(book5);
        bookDatabaseImpl.save(book6);


        System.out.println(bookDatabaseImpl.books);
        System.out.println(bookDatabaseImpl.bookID);
        System.out.println(bookDatabaseImpl.countAllBooks());
        bookDatabaseImpl.deleteByTitle("T2");
        System.out.println(bookDatabaseImpl.countAllBooks());
        System.out.println(bookDatabaseImpl.books);
        System.out.println(bookDatabaseImpl.bookID);

//        System.out.println(bookDatabaseImpl.findById(6L));
//        System.out.println(bookDatabaseImpl.countAllBooks());

    }
}