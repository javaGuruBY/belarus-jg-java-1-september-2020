package student.konstantin_adotik.lesson_4.level_5;

import java.util.Scanner;

public class PositveAndNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Positve  , Negative or Zero");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println( num + " This is number Positve ");
        } else if (num < 0) {
            System.out.println( num + " This is number Negative ");
        } else if (num == 0) {
            System.out.println("equally to Zero");
        }
    }

}
