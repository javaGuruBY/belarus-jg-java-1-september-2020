package student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface;

import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabase;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.BookServis.BookDatabaseImpl;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.DeleteBookUI.DeleteBookByBookUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.DeleteBookUI.DeleteByAuthorUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.DeleteBookUI.DeleteByIdUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.DeleteBookUI.DeleteByTitleUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.FindBookUI.*;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.GetBookUI.ContainsBookUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.GetBookUI.CountAllBooksUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.GetBookUI.GetAuthorToBooksMapUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.GetBookUI.GetEachAuthorBookCountUIAction;
import student.alexandr_kozhekin.lesson_11.level_2_intern.Task_6.Servis.UserInterface.SaveBookUI.SaveBookUIAction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {

        BookDatabase bookDatabase = new BookDatabaseImpl();

        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new ContainsBookUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new GetEachAuthorBookCountUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(14, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new DeleteBookByBookUIAction(bookDatabase));

    }

    public void run() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Пожалуйста введите номер меню: ");

            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());

            if (userSelectedMenuNumber == 0) {

                System.out.println("Спасибо! Досвидания!");

                break;

            } else {

                executeUIAction(userSelectedMenuNumber);

            }
        }
    }

    private void executeUIAction(int userSelectedMenuNumber) {

        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);

        if (uiAction != null) {

            uiAction.execute();

        } else {

            System.out.println("Такого пункта в меню нет: " + userSelectedMenuNumber);

        }
    }

}
