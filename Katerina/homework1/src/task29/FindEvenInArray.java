package task29;

import java.util.Scanner;

public class FindEvenInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of array:");
        int num = in.nextInt();

        double[] array = new double[num];

        for (int i = 0; i < num; i++) {
            double a = Math.random();
            array[i] = a * 100;
            System.out.print((int) array[i] + " ");
        }

        System.out.println("\nEven numbers:");
        for (int i = 0; i < num; i++) {
            if ((int)array[i] % 2 == 0) System.out.print((int) array[i] + " ");
        }
    }
}
