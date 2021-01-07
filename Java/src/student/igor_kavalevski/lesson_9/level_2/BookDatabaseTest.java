package student.igor_kavalevski.lesson_9.level_2;

import student.igor_kavalevski.lesson_9.level_1.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseTest {

    public static void main(String[] args) {

        BookDatabaseTest testBook = new BookDatabaseTest();
        testBook.deleteBookIdTest();
        testBook.deleteBookTest();
        testBook.findByIdTest();
        testBook.findByAuthorTest();
        testBook.findByTitleTest();
        testBook.countAllBooksTest();
        testBook.deleteByAuthorTest();
        testBook.deleteByTitleTest();
    }

    public void deleteBookIdTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Head", "A");
        bookDatabase.save(book);
        boolean actual = bookDatabase.delete(2L);
        String message = "DeleteBookId";
        checkThatEquals(true, actual, message);
    }

    public void deleteBookTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Head", "A");
        bookDatabase.save(book);
        boolean actual = bookDatabase.delete(book);
        String message = "DeleteBook";
        checkThatEquals(true, actual, message);
    }

    public void findByIdTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Head", "A");
        Book book1 = new Book("Slim", "A");
        bookDatabase.save(book);
        bookDatabase.save(book1);
        Optional<Book> expected = bookDatabase.findById(1L);
        Optional<Book> actual = Optional.ofNullable(bookDatabase.books.get(0));
        String message = "FindById";
        checkThatEquals(expected, actual, message);
    }

    public void findByAuthorTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Head", "A");
        bookDatabase.save(book);
        String expected = bookDatabase.findByAuthor("A").get(0).getAuthor();
        String actual = book.getAuthor();
        String message = "FindByAuthor";
        checkThatEquals(expected, actual, message);
    }

    public void findByTitleTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Aron", "A3");
        Book book = new Book("Head", "A3");
        bookDatabase.save(book1);
        bookDatabase.save(book);
        String expected = bookDatabase.findByTitle("Head").get(0).getTitle();
        String actual = book.getTitle();
        String message = "FindByTitle";
        checkThatEquals(expected, actual, message);
    }

    public void countAllBooksTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book = new Book("Head", "A23");
        List<Book> library = new ArrayList<>();
        bookDatabase.save(book);
        library.add(book);
        Integer expected = library.size();
        Integer actual = bookDatabase.countAllBooks();
        String message = "CountAllBooks";
        checkThatEquals(expected, actual,message);
    }

    public void deleteByAuthorTest() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "Art");
        Book book1 = new Book("Head", "A2");
        bookDatabase.save(book);
        bookDatabase.save(book1);

        bookDatabase.deleteByAuthor("A2");

        List<Book> list = new ArrayList<>();
        list.add(book);

        int expected = bookDatabase.books.size();
        int actual = list.size();
        String message = "DeleteByAuthor";

        checkThatEquals(expected, actual, message);
    }

    public void deleteByTitleTest(){

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "Art");
        Book book1 = new Book("Food", "A2");
        bookDatabase.save(book);
        bookDatabase.save(book1);

        bookDatabase.deleteByTitle("Head");

        List<Book> list = new ArrayList<>();
        list.add(book);

        int expected = bookDatabase.books.size();
        int actual = list.size();
        String message = "DeleteByTitle";

        checkThatEquals(expected, actual, message);

    }

    public void checkThatEquals(Boolean expected, Boolean actual, String message) {

        if (expected == actual) {
            System.out.println(message + " TEST OK ");
        } else {
            System.out.println(message + " TEST FAILED ");
            System.out.println(" Expected " + expected + " but was " + actual);
        }
    }

    public void checkThatEquals(String expected, String actual, String message) {

        if (expected == actual) {
            System.out.println(message + " TEST OK ");
        } else {
            System.out.println(message + " TEST FAILED ");
            System.out.println(" Expected " + expected + " but was " + actual);
        }
    }

    public void checkThatEquals(Optional expected, Optional actual, String message) {

        if (expected == actual) {
            System.out.println(message + " TEST OK ");
        } else {
            System.out.println(message + " TEST FAILED ");
            System.out.println(" Expected " + expected + " but was " + actual);
        }
    }
    public void checkThatEquals(Integer expected, Integer actual, String message) {

        if (expected == actual) {
            System.out.println(message + " TEST OK ");
        } else {
            System.out.println(message + " TEST FAILED ");
            System.out.println(" Expected " + expected + " but was " + actual);
        }
    }
  }
