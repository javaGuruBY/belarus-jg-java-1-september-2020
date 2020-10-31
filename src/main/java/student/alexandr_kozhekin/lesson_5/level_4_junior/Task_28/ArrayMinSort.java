package student.alexandr_kozhekin.lesson_5.level_4_junior.Task_28;

public class ArrayMinSort {

    public static void arrayMinSort(int[] array) {

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

        System.out.println("\n" + "Минимальное значение в массиве: " +  array[0]);

    }
}
