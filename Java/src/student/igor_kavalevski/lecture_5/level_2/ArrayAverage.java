/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте среднее значение и выведите его на консоль.
 */

package student.igor_kavalevski.lecture_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class ArrayAverage {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));

        double average = 0;

        for (int i = 0; i < 3; i++) {
            average += numbers[i];
        }
        average /= 3;

        System.out.println("Average : " + average);

    }
}