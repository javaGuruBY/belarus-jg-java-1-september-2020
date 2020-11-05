/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - выведите значение каждой ячейки на консоль.
 */

package student.igor_kavalevski.lecture_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {

        Random rand = new Random();

        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt();

            System.out.println(Arrays.toString(numbers));
        }
    }
}