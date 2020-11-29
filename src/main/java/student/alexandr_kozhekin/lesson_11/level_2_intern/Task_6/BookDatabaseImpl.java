package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {

    List<Long> bookID = new ArrayList<>();
    List<Book> books = new ArrayList<>();

    @Override
    public Long save(Book book)  {

        if (bookID.isEmpty()){

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

        if(bookID.contains(bookId)){

            bookID.remove(bookId);

            for (int i = 0; i < books.size(); i++){
                if (books.get(i).getId().equals(bookId)){

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

        if(books.contains(book)){

            bookID.remove(book.getId());
            books.remove(book);

            return true;

        } else {

            return false;

        }
    }

    @Override
    public Optional<Book> findById(Long bookId) {

        return !books.isEmpty() ? Optional.of(books.get(Math.toIntExact(bookId))) : Optional.empty();

    }

    @Override
    public List<Book> findByAuthor(String author) {

        List<Book> bookAuthor = new ArrayList<>();

        for (int i = 0; i < books.size(); i++){
            if(author.equals(books.get(i).getAuthor())){

                bookAuthor.add(books.get(i));

            }
        }
        return bookAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {

        List<Book> bookTitle = new ArrayList<>();

        for (int i = 0; i < books.size(); i++){
            if(title.equals(books.get(i).getTitle())){

                bookTitle.add(books.get(i));

            }
        }
        return bookTitle;
    }

    @Override
    public int countAllBooks() {

        return books.size();

    }
}
