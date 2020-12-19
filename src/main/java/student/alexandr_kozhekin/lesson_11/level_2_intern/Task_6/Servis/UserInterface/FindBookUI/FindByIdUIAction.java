package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.FindBookUI;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabase;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.UIAction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Long bookID;

        Scanner scanner = new Scanner(System.in);

        System.out.println("__________________________________________________________________________________");
        System.out.println("Поиск книги по ID!");
        System.out.println("__________________________________________________________________________________");

        try {

            System.out.println("Введите ID книги: ");

            bookID = scanner.nextLong();

            System.out.println("__________________________________________________________________________________");
            System.out.println(bookDatabase.findById(bookID));
            System.out.println("__________________________________________________________________________________");

        } catch (IndexOutOfBoundsException e){

            System.out.println("Такой книги нет!");
            System.out.println("__________________________________________________________________________________");

        } catch (InputMismatchException e){

            System.out.println("__________________________________________________________________________________");
            System.out.println("Пожалуйста, введите целое число! ");

            execute();

        }
    }


}
