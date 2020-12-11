package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Main.Book;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabaseImpl;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis.AndSearchCriteria;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis.AuthorSearchCriteria;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis.OrSearchCriteria;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis.TitleSearchCriteria;

public class BookDemo {
    public static void main(String[] args) {

        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();

        Book book1 = new Book("A1", "T1");
        Book book2 = new Book("A1", "T2");
        Book book3 = new Book("A1", "T1");
        Book book4 = new Book("A1", "T1");
        Book book5 = new Book("A1", "T3");
        Book book6 = new Book("A1", "T1");

        bookDatabaseImpl.save(book1);
        bookDatabaseImpl.save(book2);
        bookDatabaseImpl.save(book3);
        bookDatabaseImpl.save(book4);
        bookDatabaseImpl.save(book5);
        bookDatabaseImpl.save(book6);


//        System.out.println(bookDatabaseImpl.books);
//        System.out.println(bookDatabaseImpl.bookID);
//        System.out.println(bookDatabaseImpl.countAllBooks());
//        bookDatabaseImpl.deleteByTitle("T2");
//        System.out.println(bookDatabaseImpl.countAllBooks());
//        System.out.println(bookDatabaseImpl.books);
//        System.out.println(bookDatabaseImpl.bookID);

//        System.out.println(bookDatabaseImpl.findById(6L));
//        System.out.println(bookDatabaseImpl.countAllBooks());

        System.out.println(bookDatabaseImpl.find(new TitleSearchCriteria("T1")));

        System.out.println(bookDatabaseImpl.findUniqueAuthors());

        System.out.println(bookDatabaseImpl.findUniqueTitles());

        System.out.println(bookDatabaseImpl.findUniqueBooks());

    }
}