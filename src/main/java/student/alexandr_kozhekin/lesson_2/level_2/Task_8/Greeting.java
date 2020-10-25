package student.alexandr_kozhekin.lesson_2.level_2.Task_8;

import java.util.Scanner;

public class Greeting {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + "!");
    }
}
