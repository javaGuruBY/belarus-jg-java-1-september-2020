/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.

 */

package student.igor_kavalevski.lecture_5.level_4;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class ArrayGreatest {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        int max = 0;

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(numbers));


        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The max : " + max);

    }
}

