package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.GetBookUI;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabase;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.UIAction;

public class CountAllBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public CountAllBooksUIAction(BookDatabase bookDatabase) {

        this.bookDatabase = bookDatabase;

    }

    @Override
    public void execute() {

        System.out.println("__________________________________________________________________________________");
        System.out.println("Колличество книг в списке!" + "\n");
        System.out.println("Колличество книг: " + bookDatabase.countAllBooks());
        System.out.println("__________________________________________________________________________________");

    }
}
