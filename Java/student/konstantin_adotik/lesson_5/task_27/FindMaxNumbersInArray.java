package student.konstantin_adotik.lesson_5.task_27;

import java.util.Scanner;

public class FindMaxNumbersInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of array:");
        int num = in.nextInt();

        double[] array = new double[num];
        double m = 0;

        for (int i = 0; i < num; i++) {
            double a = Math.random();
            array[i] = a * 40;
            System.out.print((int)array[i] + " ");
            if (array[i] > m) m = array[i];
        }
        System.out.println("\nMax number is " + (int) m);
    }
}
