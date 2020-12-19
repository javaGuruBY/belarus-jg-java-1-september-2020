package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Test;

import org.junit.Test;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Main.Book;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabaseImpl;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.SearchCriteriaServis.*;

import static org.junit.Assert.assertTrue;

public class BookSearchCriteriaServisTest {

    @Test
    public void authorSearchCriteriaTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A1");

        bookDatabase.save(new Book("A1", "T1"));
        bookDatabase.save(new Book("A2", "T2"));
        bookDatabase.save(new Book("A3", "T3"));
        bookDatabase.save(new Book("A4", "T4"));

        assertTrue(authorSearchCriteria.match(bookDatabase.books.get(0)));
    }

    @Test
    public void titleSearchCriteriaTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria("T1");

        bookDatabase.save(new Book("A1", "T1"));
        bookDatabase.save(new Book("A2", "T2"));
        bookDatabase.save(new Book("A3", "T3"));
        bookDatabase.save(new Book("A4", "T4"));

        assertTrue(titleSearchCriteria.match(bookDatabase.books.get(0)));

    }

    @Test
    public void yearOfIssueSearchCriteriaTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("1993");

        bookDatabase.save(new Book("A1", "T1"));
        bookDatabase.save(new Book("A2", "T2"));
        bookDatabase.save(new Book("A3", "T3"));
        bookDatabase.save(new Book("A4", "T4"));

        bookDatabase.books.get(0).setYearOfIssue("1993");

        assertTrue(yearOfIssueSearchCriteria.match(bookDatabase.books.get(0)));

    }

    @Test
    public void orSearchCriteriaTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        OrSearchCriteria orSearchCriteria = new OrSearchCriteria(
                new AuthorSearchCriteria("A1"),
                new TitleSearchCriteria("T1"));

        bookDatabase.save(new Book("A1", "T1"));
        bookDatabase.save(new Book("A2", "T2"));
        bookDatabase.save(new Book("A3", "T3"));
        bookDatabase.save(new Book("A4", "T4"));

        assertTrue(orSearchCriteria.match(bookDatabase.books.get(0)));

    }

    @Test
    public void andSearchCriteriaTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(
                new AuthorSearchCriteria("A1"),
                new TitleSearchCriteria("T1"));

        bookDatabase.save(new Book("A1", "T1"));
        bookDatabase.save(new Book("A2", "T2"));
        bookDatabase.save(new Book("A3", "T3"));
        bookDatabase.save(new Book("A4", "T4"));

        assertTrue(andSearchCriteria.match(bookDatabase.books.get(0)));

    }
}
