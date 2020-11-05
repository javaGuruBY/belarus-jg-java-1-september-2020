/*
Написашите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива случайным числом,
 - посчитайте сумму всех ячеек и распечатайте ее на консоль.
 */

package student.igor_kavalevski.lecture_5.level_2;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomSum {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int sum = 0;

        Random random = new Random();

        numbers[0] = random.nextInt(15);
        numbers[1] = random.nextInt(15);
        numbers[2] = random.nextInt(15);

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum : " + sum);

    }
}
