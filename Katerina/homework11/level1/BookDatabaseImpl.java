package level1;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImpl implements BookDatabase {

    List<Long> bookID = new ArrayList<>();
    List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {

        if (bookID.isEmpty()) {

            book.setId(1L);

        } else {

            int index = bookID.size() + 1;
            book.setId((long) index);

        }

        bookID.add(book.getId());
        books.add(book);

        return book.getId();

    }

    @Override
    public boolean deleteBook(Long bookId) {

        if (bookID.contains(bookId)) {
            bookID.remove(bookId);
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getId().equals(bookId)) {
                    books.remove(i);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteBook(Book book) {

        if (books.contains(book)) {

            bookID.remove(book.getId());
            books.remove(book);

            return true;

        } else {

            return false;

        }
    }

    @Override
    public List<Book> findByAuthor(String author) {

        List<Book> findAuthor = new ArrayList<>();

        for (Book book : books) {
            if (author.equals(book.getAuthor())) {
                findAuthor.add(book);
            }
        }
        return findAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {

        List<Book> findTitle = new ArrayList<>();

        for (Book book : books) {
            if (title.equals(book.getTitle())) {
                findTitle.add(book);
            }
        }
        return findTitle;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }
}
