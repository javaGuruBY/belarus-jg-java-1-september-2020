package by.jrr.menu.elements;

import by.jrr.menu.MenuApplication;

import static by.jrr.menu.elements.MenuItems.*;

public class MediaLibraryMenu {

    public static void run() {
        printMenu();
        String choise = MenuAction.readAndAct();
        makeAction(choise);
    }

    public static void printMenu() {
        System.out.println(String.format(HELLO_MESSAGE, "VideoLibrary"));
        System.out.println(VIDEO);
        System.out.println(AUDIO);
        System.out.println(EXIT);
    }

    private static void makeAction(String choice) {
        switch (choice) {
            case VIDEO:
                break;
            case AUDIO:
                break;
            case EXIT:
                MenuApplication.main(null);
            default:
                MediaLibraryMenu.printMenu();
                break;
        }
    }
}
