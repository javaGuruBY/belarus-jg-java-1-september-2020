package student.alexandr_kozhekin.lesson_4.level_3_junior.Task_9;

import java.util.Scanner;

public class NumberOrderDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа для вычесления их порядка: ");

        NumberOrder.numberOrder(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
}
