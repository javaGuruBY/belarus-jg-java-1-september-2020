package student.alexandr_kozhekin.lesson_11.level_1_intern.Task_5;

public class Book {

    private String title;
    private String author;

    Book(String author, String title) {

        this.author = author;
        this.title = title;

    }

    public String getTitle() {

        return this.title;

    }

    public String getAuthor() {

        return this.author;

    }
}
