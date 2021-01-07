package student.igor_kavalevski.lesson_9.level_6;

import student.igor_kavalevski.lesson_9.level_1.Book;
import student.igor_kavalevski.lesson_9.level_2.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        String author;
        String title;
        String yearIssue;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Author : ");
        author = sc.nextLine();
        System.out.println("");

        System.out.println("Please enter Title : ");
        title = sc.nextLine();
        System.out.println("");

        System.out.println("Please enter yearIssue : ");
        yearIssue = sc.nextLine();

        bookDatabase.save(new Book(author, title, yearIssue));
    }
}

