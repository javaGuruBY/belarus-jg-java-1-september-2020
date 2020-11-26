package task10;

import java.util.Scanner;

public class ArrayOfThreeNumbers {
    public static void main(String[] args) {
        int[] array = new int[3];

        for (int i = 0; i < 3; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a array[" + (i + 1) + "] number: ");
            int num = in.nextInt();
            array[i]=num;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }

    }
}
