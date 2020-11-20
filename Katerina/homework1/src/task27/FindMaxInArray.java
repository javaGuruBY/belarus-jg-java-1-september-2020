package task27;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of array:");
        int num = in.nextInt();

        double[] array = new double[num];
        double max = 0;

        for (int i = 0; i < num; i++) {
            double a = Math.random();
            array[i] = a * 100;
            System.out.print((int)array[i] + " ");
            if (array[i] > max) max = array[i];
        }
        System.out.println("\nMax number is " + (int)max);
    }
}
