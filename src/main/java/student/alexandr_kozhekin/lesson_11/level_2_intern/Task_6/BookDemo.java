package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Main.Book;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabaseImpl;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis.AndSearchCriteria;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis.AuthorSearchCriteria;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis.OrSearchCriteria;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis.TitleSearchCriteria;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.DeleteByIdUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.FindByIdUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.FindByTitleUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.SaveBookUIAction;

public class BookDemo {
    public static void main(String[] args) {

        BookDatabaseImpl bookDatabaseImpl = new BookDatabaseImpl();

        Book book1 = new Book("A1", "T1");
        Book book2 = new Book("A9", "T2");
        Book book3 = new Book("A1", "T3");
        Book book4 = new Book("A2", "T1");
        Book book5 = new Book("A2", "T3");
        Book book6 = new Book("A2", "T1");
        Book book7 = new Book("A3", "T1");
        Book book8 = new Book("A9", "T1");

        bookDatabaseImpl.save(book1);
        bookDatabaseImpl.save(book2);
        bookDatabaseImpl.save(book3);
        bookDatabaseImpl.save(book4);
        bookDatabaseImpl.save(book5);
        bookDatabaseImpl.save(book6);
        bookDatabaseImpl.save(book7);
        bookDatabaseImpl.save(book8);


//        System.out.println(bookDatabaseImpl.books);
//        System.out.println(bookDatabaseImpl.bookID);
//        System.out.println(bookDatabaseImpl.countAllBooks());
//        bookDatabaseImpl.deleteByTitle("T2");
//        System.out.println(bookDatabaseImpl.countAllBooks());
//        System.out.println(bookDatabaseImpl.books);
//        System.out.println(bookDatabaseImpl.bookID);

//        System.out.println(bookDatabaseImpl.findById(6L));
//        System.out.println(bookDatabaseImpl.countAllBooks());

//        System.out.println(bookDatabaseImpl.findByAuthor("A1"));
//
//        System.out.println(bookDatabaseImpl.find(new TitleSearchCriteria("T1")));
//
//        System.out.println(bookDatabaseImpl.findUniqueAuthors());
//
//        System.out.println(bookDatabaseImpl.findUniqueTitles());
//
//        System.out.println(bookDatabaseImpl.findUniqueBooks());
//
//        System.out.println(bookDatabaseImpl.getAuthorToBooksMap());
//
//        System.out.println(bookDatabaseImpl.getEachAuthorBookCount());

        DeleteByIdUIAction find = new DeleteByIdUIAction(bookDatabaseImpl);
        find.execute();



    }
}