package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.FindBookUI;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabase;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.UIAction;

public class FindUniqueBooksUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) {

        this.bookDatabase = bookDatabase;

    }

    @Override
    public void execute() {

        System.out.println("__________________________________________________________________________________");
        System.out.println("Получение уникальных книг!" + "\n");
        System.out.println("Список уникальных книг: " + bookDatabase.findUniqueBooks());
        System.out.println("__________________________________________________________________________________");

    }
}
