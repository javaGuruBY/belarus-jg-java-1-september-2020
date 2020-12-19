package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.GetBookUI;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabase;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.UIAction;

public class GetEachAuthorBookCountUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public GetEachAuthorBookCountUIAction(BookDatabase bookDatabase) {

        this.bookDatabase = bookDatabase;

    }

    @Override
    public void execute() {

        System.out.println("__________________________________________________________________________________");
        System.out.println("Получение уникальных авторов и количества написанных ими книг!" + "\n");
        System.out.println("Список уникальных авторов: " + bookDatabase.getEachAuthorBookCount());
        System.out.println("__________________________________________________________________________________");

    }
}
