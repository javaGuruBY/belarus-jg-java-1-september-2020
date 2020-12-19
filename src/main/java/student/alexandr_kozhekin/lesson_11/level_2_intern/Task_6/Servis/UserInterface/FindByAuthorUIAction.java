package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabase;

import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {

        this.bookDatabase = bookDatabase;

    }

    @Override
    public void execute() {

        String titleBook;

        Scanner scanner = new Scanner(System.in);
        System.out.println("__________________________________________________________________________________");
        System.out.println("Поиск книги по автору!");
        System.out.println("__________________________________________________________________________________");

        System.out.println("Для поиска книги введите Имя автора книги:");

        titleBook = scanner.nextLine();

        System.out.println("__________________________________________________________________________________");
        System.out.println("Список найденыйх киг: " + "\n" + bookDatabase.findByAuthor(titleBook));
        System.out.println("__________________________________________________________________________________");

    }
}
