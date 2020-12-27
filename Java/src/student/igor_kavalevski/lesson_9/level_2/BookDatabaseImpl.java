package student.igor_kavalevski.lesson_9.level_2;

import student.igor_kavalevski.lesson_9.level_1.Book;
import student.igor_kavalevski.lesson_9.level_3.SearchCriteria;
import student.igor_kavalevski.lesson_9.level_3.TitleSearchCriteria;

import java.util.*;
import java.util.stream.Collectors;

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

        List<Book> authors = new ArrayList<>();

        for (Book book : books) {

            if (author.equals(book.getAuthor())) {

                authors.add(book);
            }
        }
        return authors;
    }

    @Override
    public List<Book> findByTitle(String title) {

        List<Book> titles = new ArrayList<>();

        for (Book book : books) {

            if (title.equals(book.getTitle())) {

                titles.add(book);
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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> titleBook = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.equals(new TitleSearchCriteria(book.getTitle()))) {
                titleBook.add(book);
            }
        }
        return titleBook;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<String> findUniqueTitles() {
        return books.stream()
                .map(Book::getTitle)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {

        for (Book value : books) {

            if (value.equals(book)) {

                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {

        Map<String, List<Book>> authorOfBooks = new HashMap<>();

        for (Book book : books) {
            authorOfBooks.put(book.getAuthor(), findByAuthor(book.getAuthor()));
        }
        return authorOfBooks;
    }


    @Override
    public Map<String, Integer> getEachAuthorBookCount() {

        Map<String, Integer> authorBookUnique = new HashMap<>();

        List<String> uniqueAuthor = new ArrayList<>(findUniqueAuthors());

        for (String authors : uniqueAuthor) {

            Set<Book> uniqueBook = new HashSet<>(findByAuthor(authors));
            authorBookUnique.put(authors, uniqueBook.size());
        }
        return authorBookUnique;
    }
}





