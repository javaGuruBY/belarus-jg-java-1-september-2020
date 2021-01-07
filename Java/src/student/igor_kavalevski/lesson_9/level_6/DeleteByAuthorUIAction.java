package student.igor_kavalevski.lesson_9.level_6;

import student.igor_kavalevski.lesson_9.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter author to delete :");

        bookDatabase.deleteByAuthor(sc.nextLine());

        System.out.println("Author has been deleted");

    }
}
