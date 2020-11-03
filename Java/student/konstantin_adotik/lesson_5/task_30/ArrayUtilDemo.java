package student.konstantin_adotik.lesson_5.task_30;

import java.util.Scanner;

public class ArrayUtilDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of array:");
        int arrayLength = in.nextInt();

        createArray(arrayLength);

    }

    public static int[] createArray(int arrayLength) {

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a array[" + (i + 1) + "] number: ");
            int a = in.nextInt();
            array[i] = a;
        }
        return array;
    }
}
