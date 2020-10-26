package by.jrr.menu.elements;

import by.jrr.menu.MenuApplication;

import java.util.Scanner;

import static by.jrr.menu.elements.MenuItems.*;

public class CalculatorMenu {

    public static void run() {
        printMenu();
        String choise = MenuAction.readAndAct();
        makeAction(choise);
    }

    public static void printMenu() {
        System.out.println(String.format(HELLO_MESSAGE, "Calculator"));
        System.out.println(DIVIDE);
        System.out.println(MULTIPLY);
        System.out.println(EXIT);
    }


    private static void makeAction(String choice) {
        switch (choice) {
            case DIVIDE:
                break;
            case MULTIPLY:
                break;
            case EXIT:
                MenuApplication.main(null);
            default:
                CalculatorMenu.printMenu();
                break;
        }
    }
}
