package student.igor_kavalevski.lesson_9.level_2;

import student.igor_kavalevski.lesson_9.level_1.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {

    List<Long> booksId = new ArrayList<>();
    List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book) {

        if (booksId.isEmpty()) {

            book.setId(1L);

        } else {
            int nextIndex = booksId.size() + 1;
            book.setId((long) nextIndex);
        }
        booksId.add(book.getId());
        books.add(book);

        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {

        booksId.removeIf(nextLong -> nextLong.equals(bookId));

        return true;
    }

    @Override
    public boolean delete(Book book) {

        books.removeIf(nextBook -> nextBook.equals(book));

        return true;
    }

    @Override
    public Optional<Book> findById(Long bookId) {

        return !books.isEmpty() ? Optional.of(books.get(Math.toIntExact(bookId) - 1)) : Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {

        List<Book> Authors = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {

            if (author.equals(books.get(i).getAuthor())) {

                Authors.add(books.get(i));
            }
        }
        return Authors;
    }

    @Override
    public List<Book> findByTitle(String title) {

        List<Book> titles = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {

            if (title.equals(books.get(i).getTitle())) {

                titles.add(books.get(i));
            }
        }
        return titles;
    }

    @Override
    public int countAllBooks() {

        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {

        for (int i = 0; i < books.size(); i++) {

            if (author.equals(books.get(i).getAuthor())) {

                books.remove(books.get(i));
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {

        for (int i = 0; i < books.size(); i++) {

            if (title.equals(books.get(i).getTitle())) {

                books.remove(books.get(i));
            }
        }
    }
}






