package by.jrr.menu.elements;

import java.util.Scanner;

public class MenuAction {

    public static String readAndAct() {
        Scanner scanner = new Scanner(System.in);
        String choise = scanner.next();
        return choise;
    }
}
