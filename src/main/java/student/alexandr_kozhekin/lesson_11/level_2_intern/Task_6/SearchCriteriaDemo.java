package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Main.Book;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabaseImpl;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis.*;

public class SearchCriteriaDemo {
    public static void main(String[] args) {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Kuper", "Zveroboi");

        bookDatabase.save(book);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        System.out.println(authorSearchCriteria.match(bookDatabase.books.get(0)));

        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        System.out.println(titleSearchCriteria.match(bookDatabase.books.get(0)));

        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(searchCriteria.match(book));

        SearchCriteria searchCriteria1 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(searchCriteria1.match(book));

    }
}
