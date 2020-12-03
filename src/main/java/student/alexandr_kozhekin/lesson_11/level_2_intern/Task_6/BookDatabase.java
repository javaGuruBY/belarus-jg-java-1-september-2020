package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6;

import java.util.List;
import java.util.Optional;

public interface BookDatabase {

    Long save(Book book);

    boolean deleteBook(Long bookId);

    boolean deleteBook(Book book);

    Optional<Book> findById(Long bookId);

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    int countAllBooks();

    void deleteByAuthor(String author);

    void deleteByTitle(String title);

}
