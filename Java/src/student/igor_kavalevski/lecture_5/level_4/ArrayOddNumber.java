/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.

 */

package student.igor_kavalevski.lecture_5.level_4;

import java.util.Arrays;
import java.util.Random;

public class ArrayOddNumber {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println("Odd number : " + numbers[i]);
            }
        }
    }
}
