/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */

package student.igor_kavalevski.lecture_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayRandNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] numbers;

        System.out.println("Enter length array : ");

        numbers = new int[sc.nextInt()];

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        System.out.println("ABRACADABRA");
        System.out.println(Arrays.toString(numbers));

    }
}
