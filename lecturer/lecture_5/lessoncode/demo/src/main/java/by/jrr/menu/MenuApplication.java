package by.jrr.menu;

import by.jrr.menu.elements.CalculatorMenu;
import by.jrr.menu.elements.MediaLibraryMenu;
import by.jrr.menu.elements.MenuAction;
import by.jrr.menu.elements.MenuItems;

import java.util.Scanner;

import static by.jrr.menu.elements.MenuItems.*;

public class MenuApplication {
    public static void main(String[] args) {
        System.out.println(String.format(HELLO_MESSAGE, "MultiMenu"));
        System.out.println(CALCULATOR);
        System.out.println(MEDIA_LIBRARY);

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        switch (choice) {
            case CALCULATOR:
                CalculatorMenu.run();
                break;
            case MEDIA_LIBRARY:
                MediaLibraryMenu.run();
                break;
            default:
                MenuApplication.main(null);
                break;
        }
    }
}
