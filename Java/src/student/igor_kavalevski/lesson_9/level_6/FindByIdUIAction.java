package student.igor_kavalevski.lesson_9.level_6;

import student.igor_kavalevski.lesson_9.level_1.Book;
import student.igor_kavalevski.lesson_9.level_2.BookDatabase;
import student.igor_kavalevski.lesson_9.level_2.BookDatabaseImpl;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter book id please : ");

        Optional<Book> bookOpt = bookDatabase.findById(sc.nextLong());

        System.out.println(bookOpt);
    }
}

