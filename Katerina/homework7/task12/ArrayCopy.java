package task12;

import java.util.Scanner;

public class ArrayCopy {

    int[] array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] initialize() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = in.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + (i + 1) + "]=");
            array[i] = in.nextInt();
        }
        return array;
    }

    public int[] copyInRange(int[] array, int numberFrom, int numberTo) {
        if (numberFrom <= numberTo) {
            int newSize = 0;
            for (int element : array) {
                if (element >= numberFrom && element <= numberTo) {
                    newSize++;
                }
            }
            int[] newArray = new int[newSize];
            int k = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= numberFrom && array[i] <= numberTo) {
                    newArray[k] = array[i];
                    k++;
                }
            }
            return newArray;
        } else return new int[0];
    }

    public void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

}
