package level1;

import java.util.ArrayList;
import java.util.List;

public interface BookDatabase {

    Long save(Book book);

    boolean deleteBook(Long bookId);

    boolean deleteBook(Book book);

    //Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

}
