/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль,
 - увеличьте значение каждой ячейки на 2,
 - выведите значение каждой ячейки на консоль.
 */

package student.igor_kavalevski.lecture_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class ArraySum {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
