package student.igor_kavalevski.lecture_5.level_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array : ");

        int arrayLength = sc.nextInt();

        createArray(arrayLength);
    }

    public static int[] createArray(int arrayLength) {

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            System.out.println("Input a array[" + (i + 1) + "] number:");

            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();

            array[i] = a;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {

            Random random = new Random();

            array[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array));

    }

    public void printArrayToConsole(int[] array) {

        System.out.println(Arrays.toString(array));
    }

    public void findMaxNumber(int[] array) {

        int max = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {

                max = array[i];
            }
            System.out.println("The max : " + max);
        }
    }

    public int findMinNumber(int[] array) {

        int min = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}