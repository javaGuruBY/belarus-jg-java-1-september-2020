/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */

package student.igor_kavalevski.lecture_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers;

        System.out.println("Enter length array : ");

        numbers = new int[sc.nextInt()];

        System.out.println(Arrays.toString(numbers));
        System.out.println("Fill in the array with numbers :");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

    }
}
