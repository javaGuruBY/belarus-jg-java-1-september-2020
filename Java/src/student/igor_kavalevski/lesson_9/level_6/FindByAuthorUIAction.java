package student.igor_kavalevski.lesson_9.level_6;

import student.igor_kavalevski.lesson_9.level_1.Book;
import student.igor_kavalevski.lesson_9.level_2.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the author : ");

        List<Book> find = bookDatabase.findByAuthor(sc.nextLine());

        System.out.println(find);
    }
}
