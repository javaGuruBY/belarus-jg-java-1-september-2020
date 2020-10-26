package level_1;

import java.util.Scanner;

public class number {

    public static void main(String[] args) {

        // task 1

        System.out.println("Введите число ");
        System.out.println("1.  Положительное или отрицательное?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Число " + num + " положительное");
        } else if
        (num < 0) {
            System.out.println("Число " + num + " отрицательное");
        }

        // task 2

        System.out.println("2.  Отрицателное, положительное или = 0");
        int num1 = scanner.nextInt();
        if (num1 > 0) {
            System.out.println("Число " + num1 + " положительное");
        } else if (num1 < 0) {
            System.out.println("Число " + num1 + " отрицательное");
        } else if (num1 == 0) {
            System.out.println("Равно нулю");
        }

        // task 3

        System.out.println("3.  Дни недели (Число от 1 до 7)");
        int num2 = scanner.nextInt();
        if (num2 == 1) {
            System.out.println("Monday");
        } else if (num2 == 2) {
            System.out.println("Tuesday");
        } else if (num2 == 3) {
            System.out.println("Wednesday");
        } else if (num2 == 4) {
            System.out.println("Thursday");
        } else if (num2 == 5) {
            System.out.println("Friday");
        } else if (num2 == 6) {
            System.out.println("Saturday");
        } else if (num2 == 7) {
            System.out.println("Sunday");
        }

        // task 4

        System.out.println("4.   Чётное или нечётное?");
        double num3 = scanner.nextInt();
        if (num3 % 2 == 0)
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");
    }
}
