package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.SaveBookUI;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Main.Book;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabase;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.UIAction;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {

        this.bookDatabase = bookDatabase;

    }

    @Override
    public void execute() {

        String authorBook;
        String titleBook;
        String yearOfIssueBook;

        Scanner scanner = new Scanner(System.in);

        System.out.println("__________________________________________________________________________________");
        System.out.println("Сохранение книги! ");

        System.out.println("__________________________________________________________________________________");
        System.out.println("Введите имя автора книги: ");

        authorBook = scanner.nextLine();

        System.out.println("__________________________________________________________________________________");
        System.out.println("Введите название книги: ");

        titleBook = scanner.nextLine();

        System.out.println("__________________________________________________________________________________");
        System.out.println("Введите год выпуска книги: ");

        yearOfIssueBook = scanner.nextLine();
//ДОРАБОТАТЬ!!!!
        if (titleBook != "" || authorBook !="" || yearOfIssueBook != ""){

            bookDatabase.save(new Book(authorBook, titleBook, yearOfIssueBook));

            System.out.println("__________________________________________________________________________________");
            System.out.println("Книга сохранена!" + "\n" + bookDatabase.findByAuthor(authorBook));
            System.out.println("__________________________________________________________________________________");

        } else {

            System.out.println("__________________________________________________________________________________");
            System.out.println("Вы забыли что-то добавить!" + "\n" + "Попробуйте сново!");
            System.out.println("__________________________________________________________________________________");

            execute();

        }

    }
}
