package student.igor_kavalevski.lesson_9.level_2;

import org.junit.jupiter.api.Test;
import student.igor_kavalevski.lesson_9.level_1.Book;

import java.util.*;

import static org.junit.Assert.*;

class BookDatabaseImplTest {

    @Test
    void save() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Aron", "A3", "2020");

        Long[] expected = {1L};

        Long[] actual = {bookDatabase.save(book1)};

        assertEquals(expected,actual);
    }

    @Test
    void delete() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Aron", "A3", "2020");
        Book book = new Book("Head", "A3", "2020");

        bookDatabase.save(book1);
        bookDatabase.save(book);

        String expected = bookDatabase.findByTitle("Head").get(0).getTitle();
        String actual = book.getTitle();

        assertEquals(expected, actual);
    }

    @Test
    void testDelete() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "A", "2020");

        bookDatabase.save(book);

        boolean actual = bookDatabase.delete(book);

        assertTrue(actual);
    }

    @Test
    void findById() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "A", "2020");

        bookDatabase.save(book);

        String expected = bookDatabase.findByAuthor("A").get(0).getAuthor();

        String actual = book.getAuthor();

        assertEquals(expected,actual);
    }

    @Test
    void findByAuthor() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "A", "2020");

        bookDatabase.save(book);

        String expected = bookDatabase.findByAuthor("A").get(0).getAuthor();

        String actual = book.getAuthor();

        assertEquals(expected, actual);
    }

    @Test
    void findByTitle() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book1 = new Book("Aron", "A3", "2020");
        Book book = new Book("Head", "A3", "2020");

        bookDatabase.save(book1);
        bookDatabase.save(book);

        String expected = bookDatabase.findByTitle("Head").get(0).getTitle();
        String actual = book.getTitle();

        assertEquals(expected, actual);
    }

    @Test
    void countAllBooks() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "A23", "2020");

        List<Book> library = new ArrayList<>();

        bookDatabase.save(book);
        library.add(book);

        Integer expected = library.size();
        Integer actual = bookDatabase.countAllBooks();

        assertEquals(expected, actual);
    }

    @Test
    void deleteByAuthor() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "Art", "2020");
        Book book1 = new Book("Head", "A2", "2020");

        bookDatabase.save(book);
        bookDatabase.save(book1);

        bookDatabase.deleteByAuthor("A2");

        List<Book> list = new ArrayList<>();
        list.add(book);

        int expected = bookDatabase.books.size();
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    void deleteByTitle() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "Art", "2020");
        Book book1 = new Book("Food", "A2", "2020");
        bookDatabase.save(book);
        bookDatabase.save(book1);

        bookDatabase.deleteByTitle("Head");

        List<Book> list = new ArrayList<>();
        list.add(book);

        int expected = bookDatabase.books.size();
        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    void find() {
    }

    @Test
    void findUniqueAuthors() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "Art", "2020");
        Book book1 = new Book("Food", "A2", "2020");
        Book book2 = new Book("Food", "A2", "2020");

        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Set<String> expected = new HashSet<>();

        for (int i = 0; i < bookDatabase.books.size(); i++) {
            expected.add(bookDatabase.books.get(i).getAuthor());
        }

        Set<String> actual = bookDatabase.findUniqueAuthors();

        assertEquals(expected, actual);
    }

    @Test
    void findUniqueTitles() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "Art", "2020");
        Book book1 = new Book("Food", "A2", "2020");
        Book book2 = new Book("Food", "A2", "2020");

        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Set<String> expected = new HashSet<>();

        for (int i = 0; i < bookDatabase.books.size(); i++) {
            expected.add(bookDatabase.books.get(i).getTitle());
        }

        Set<String> actual = bookDatabase.findUniqueTitles();

        assertEquals(expected, actual);
    }

    @Test
    void findUniqueBooks() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "Art", "2020");
        Book book1 = new Book("Food", "A2", "2020");
        Book book2 = new Book("Food", "A2", "2020");

        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Set<Book> expected = new HashSet<>();
        expected.add(book);
        expected.add(book1);

        Set<Book> actual = bookDatabase.findUniqueBooks();

        assertEquals(expected, actual);
    }

    @Test
    void contains() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "Art", "2020");
        Book book1 = new Book("Food", "A2", "2020");
        Book book2 = new Book("Food", "A2", "2020");

        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        boolean actual = bookDatabase.contains(book2);

        assertTrue(actual);
    }

    @Test
    void getAuthorToBooksMap() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "Art", "2020");
        Book book1 = new Book("Food", "A2", "2020");
        Book book2 = new Book("Food", "A2", "2020");

        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Map<String, List<Book>> expected = new HashMap<>();
        expected.put("A2", bookDatabase.findByAuthor("A2"));
        expected.put("Art", bookDatabase.findByAuthor("Art"));

        Map<String, List<Book>> actual = bookDatabase.getAuthorToBooksMap();

        assertEquals(expected, actual);
    }

    @Test
    void getEachAuthorBookCount() {

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("Head", "Art", "2020");
        Book book1 = new Book("Food", "A2", "2020");
        Book book2 = new Book("Food", "A2", "2020");

        bookDatabase.save(book);
        bookDatabase.save(book1);
        bookDatabase.save(book2);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("A2", 1);
        expected.put("Art", 1);

        Map<String, Integer> actual = bookDatabase.getEachAuthorBookCount();

        assertEquals(expected, actual);
    }
}