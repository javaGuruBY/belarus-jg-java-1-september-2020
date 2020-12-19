package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.FindBookUI;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabase;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.UIAction;

public class FindUniqueTitlesUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindUniqueTitlesUIAction(BookDatabase bookDatabase) {

        this.bookDatabase = bookDatabase;

    }

    @Override
    public void execute() {

        System.out.println("__________________________________________________________________________________");
        System.out.println("Поиск уникальных тайтлов!" + "\n");
        System.out.println("Список тайтлов: " + bookDatabase.findUniqueTitles());
        System.out.println("__________________________________________________________________________________");

    }
}
