/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива числом, запрошенным у пользователя,
 - выведите значение каждой ячейки на консоль.
 */

package student.igor_kavalevski.lecture_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScan {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number : ");
        numbers[0] = scanner.nextInt();

        System.out.println("Please enter your second number : ");
        numbers[1] = scanner.nextInt();

        System.out.println("Please enter your three number : ");
        numbers[2] = scanner.nextInt();

        System.out.println(Arrays.toString(numbers));

    }
}
