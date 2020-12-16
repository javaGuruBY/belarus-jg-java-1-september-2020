package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {


    @Test
    public void saveBookTest (){

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Long [] expected = {1L, 2L, 3L};

        Long [] actual = {bookDatabase.save(new Book("A1", "T1")),
                bookDatabase.save(new Book("A2", "T2")),
                bookDatabase.save(new Book("A3", "T3")) };

        assertEquals(expected,actual);
    }

    @Test
    public void bookReNameTest(){

        String [] expected = {"Test1", "Test2", "Test3", "Test4", "Test5"};

        Book [] book = {new Book("T1", "B2"),
                new Book("T2", "B3"),
                new Book("T3", "B4"),
                new Book("T4", "B5"),
                new Book("T5", "B6"),};

        for (int i = 0; i < expected.length; i++){

            int q = i + 1;

            book [i].setTitle("Test" + q);

        }

        String [] q = new String[book.length];

        for(int i = 0; i < book.length; i++){

            q [i] = book[i].getTitle();

        }

        String [] actual = q;

        assertEquals(expected, actual);

    }

    @Test
    public void deleteBookTest(){

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("A1", "T1");

        bookDatabase.save(book);

        boolean actual = bookDatabase.deleteBook(book);

        assertEquals(true, actual);

    }

    @Test
    public void deleteBookForIDTest(){

        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

        Book book = new Book("A1", "T1");

        bookDatabase.save(book);

        boolean actual = bookDatabase.deleteBook(1L);

        assertEquals(true, actual);
    }
}
