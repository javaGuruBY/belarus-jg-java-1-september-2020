package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.FindBookUI;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabase;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.UIAction;

import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {

        this.bookDatabase = bookDatabase;

    }


    @Override
    public void execute() {

        String titleBook;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("__________________________________________________________________________________");
            System.out.println("Поиск книги по названию!");
            System.out.println("__________________________________________________________________________________");

            System.out.println("Для поиска книги введите название книги:");

            titleBook = scanner.nextLine();

            System.out.println("__________________________________________________________________________________");
            System.out.println("Список найденыйх книг: " + "\n" + bookDatabase.findByTitle(titleBook));
            System.out.println("__________________________________________________________________________________");

        } catch (NumberFormatException e){

            System.out.println("__________________________________________________________________________________");
            System.out.println("Некоректный ввод!" + "\n" + "Попробуйте сново!");

            execute();
        }
    }
}
