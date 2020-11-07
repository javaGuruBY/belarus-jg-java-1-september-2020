package hw.level3;

import java.util.Scanner;

public class ArrayService {
    Scanner scanner = new Scanner(System.in);

    public int getArrayNumber() {
        System.out.print("Input the number of array elements: ");
        return scanner.nextInt();
    }

    int[] init(int numberOfElements) {
        int arr[] = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Element[" + (i + 1) + "]=");
            int num = scanner.nextInt();
            arr[i] = num;
        }
        return arr;
    }

    boolean contains(int[] arr, int numberToSearch) {

        boolean contains = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int[] replace(int[] arr, int numberToSearch) {
        System.out.print("Input number to replace:");
        int replace = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                arr[i] = replace;
                break;
            }
        }
        return arr;
    }

    int[] replaceAll(int[] arr, int numberToSearch) {
        System.out.print("Input number to replace:");
        int replace = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                arr[i] = replace;
            }
        }
        return arr;
    }

    public void revert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
    }

    public void sort(int[] arr) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
