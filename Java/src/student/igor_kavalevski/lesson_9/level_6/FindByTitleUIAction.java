package student.igor_kavalevski.lesson_9.level_6;

import student.igor_kavalevski.lesson_9.level_1.Book;
import student.igor_kavalevski.lesson_9.level_2.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the title : ");

        List<Book> findTitle = bookDatabase.findByTitle(sc.nextLine());

        System.out.println(findTitle);
    }
}
