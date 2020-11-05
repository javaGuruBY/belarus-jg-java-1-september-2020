package student.igor_kavalevski.lecture_5.level_5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();

        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }


    public void shouldCreateArray() {

        int[] array = new int[4];

        int arrayLength = 0;

        for (int i = 0; i < 4; i++) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a array[" + (i + 1) + "] number: ");

            int a = sc.nextInt();

            array[i] = a;

            arrayLength++;
        }

        if (arrayLength == 4) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void shouldFindMaxNumber() {

        int[] array = {3, 25, 8, 11};
        int max = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {

                max = array[i];
            }
        }
        System.out.println("The max : " + max);

        if (max > array[0]) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }

    public void shouldFindMinNumber() {

        int[] array = {5, 3, 9, 1};
        int min = 30;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {

                min = array[i];
            }
        }

        System.out.println("The min : " + min);

        if (min < array[0]) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAILED");
        }
    }
}








