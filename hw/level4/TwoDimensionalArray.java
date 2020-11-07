package hw.level4;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoDimensionalArray array = new TwoDimensionalArray();
        System.out.print("Input number of strings:");
        int n = scanner.nextInt();
        System.out.print("Input number of columns:");
        int m = scanner.nextInt();

        int[][] arr = array.init(n, m);
        array.print(arr, n, m);
        array.sum(arr);
    }


    int[][] init(int n, int m) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Element[" + (i + 1) + "][" + (j + 1) + "]=");
                int num = scanner.nextInt();
                arr[i][j] = num;
            }
        }
        return arr;
    }

    void print(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = +arr[i][j];
            }
        }
        System.out.println("Sum=" + sum);
    }
}
