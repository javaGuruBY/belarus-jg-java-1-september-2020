package student.igor_kavalevski.lesson_9.level_1;

import java.util.Objects;

public class Book {

    private Long id;
    private String title;
    private String author;
    private String yearIssue;

    public Book(String title, String author, String yearIssue) {
        this.title = title;
        this.author = author;
        this.yearIssue = yearIssue;
    }

    public String getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(String yearIssue) {
        this.yearIssue = yearIssue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" +id+ '\''+
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
