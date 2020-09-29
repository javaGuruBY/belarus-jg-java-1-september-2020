package student.konstantin_adotik.level_3.task_9;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Test Data:");
        int day = 07;

        int month = 10;

        int year = 2020;

        System.out.print(day);
        System.out.print("/");
        System.out.print(month);
        System.out.print("/");
        System.out.println(year);

        System.out.println();

        System.out.print("Input a number: ");

        int number = scanner.nextInt();

        System.out.println(number);

        int Two= 2 * number;

        System.out.print(number + " * 2 = " + Two);

        System.out.println();


        int Three = 3 * number;

        System.out.print(number + " * 3 = " + Three);

        System.out.println();

        int Foure = 4 * number;

        System.out.print(number + " * 4 = " + Foure);

        System.out.println();

        int Five  = 5 * number;

        System.out.print(number + " * 5 = " + Five);

        System.out.println();

        int Six  = 6 * number;

        System.out.print(number + " * 6 = " + Six);

        System.out.println();

        int Seven  = 7 * number;

        System.out.print(number + " * 7 = " + Seven);

        System.out.println();

        int Eight  = 8 * number;

        System.out.print(number + " * 8 = " + Eight);

        System.out.println();

        int Nine   = 9 * number;

        System.out.print(number + " * 9 = " + Nine);

        System.out.println();

        int Ten  = 10 * number;

        System.out.print(number + " * 10 = " + Ten);

    }
}
