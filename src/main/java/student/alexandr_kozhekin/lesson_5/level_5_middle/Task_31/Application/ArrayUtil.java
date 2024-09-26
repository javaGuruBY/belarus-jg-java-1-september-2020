package student.alexandr_kozhekin.lesson_5.level_5_middle.Task_31.Application;

import java.util.Scanner;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];

    }

    public void fillArrayWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * (1000 + 1));

        }
    }
    //Task_34
    public void printArrayToConsole(int[] array) {

        for (int i = 0; i < array.length; i++){

            System.out.println(array[i]);

        }
    }
    //Task_35
    public int findMaxNumber(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int smallestIndex = i;
            int smallestValue = array[i];

            for (int q = i + 1; q < array.length; q++) {

                if (array[q] > smallestValue) {

                    smallestIndex = q;
                    smallestValue = array[q];

                }
            }

            array[smallestIndex] = array[i];
            array[i] = smallestValue;

        }
        return array[0];
    }
    //Task_37
    public int findMinNumber(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int smallestIndex = i;
            int smallestValue = array[i];

            for (int q = i + 1; q < array.length; q++) {

                if (array[q] < smallestValue) {

                    smallestIndex = q;
                    smallestValue = array[q];

                }
            }

            array[smallestIndex] = array[i];
            array[i] = smallestValue;

        }
        return array[0];
    }
}
