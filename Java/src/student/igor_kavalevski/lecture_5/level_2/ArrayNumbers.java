/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива любым целым числом,
 - выведите значение каждой ячейки на консоль.
 */

package student.igor_kavalevski.lecture_5.level_2;

import java.util.Arrays;

public class ArrayNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 35;
        numbers[1] = 5;
        numbers[2] = 9;

        System.out.println(Arrays.toString(numbers));

    }
}
