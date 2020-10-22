package student.konstantin_adotik.lesson_4.level_4;

import java.util.Scanner;

public class PositveAndNegative {
    public static void main(String[] args) {


        System.out.println("  Enter number ");
        System.out.println(" positive or negative? ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println( num + " This is number positive ");
        } else if
        (num < 0) {
            System.out.println( num + "This is number negative ");
        }
    }
}
