package student.konstantin_adotik.lesson_5.task_25;

import java.util.Scanner;

public class LengthOfTheArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of array:");
        int num = in.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Input a array[" + (i + 1) + "] number: ");
            int a = in.nextInt();
            array[i] = a;
        }

        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " / " );
        }
    }
}

