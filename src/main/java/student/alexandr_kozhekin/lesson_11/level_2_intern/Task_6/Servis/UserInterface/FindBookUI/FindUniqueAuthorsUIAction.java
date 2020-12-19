package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.FindBookUI;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabase;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.UIAction;

public class FindUniqueAuthorsUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueAuthorsUIAction(BookDatabase bookDatabase) {

        this.bookDatabase = bookDatabase;

    }

    @Override
    public void execute() {

        System.out.println("__________________________________________________________________________________");
        System.out.println("Поиск уникальных Авторов книг!" + "\n");
        System.out.println("Список Авторов: " + bookDatabase.findUniqueAuthors());
        System.out.println("__________________________________________________________________________________");

    }
}
