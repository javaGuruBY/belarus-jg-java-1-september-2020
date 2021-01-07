package student.igor_kavalevski.lesson_9.level_6;

import student.igor_kavalevski.lesson_9.level_2.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Scanner sc =new Scanner(System.in);

        System.out.println("Please enter the bookId to delete : ");

        bookDatabase.delete(sc.nextLong());

        System.out.println("The book has been deleted");
    }
}
