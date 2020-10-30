package student.konstantin_adotik.lesson_5.task_11;

import java.util.Scanner;

public class CreateAnArrayOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumber = new int[3];

        for (int i = 0; i < arrayNumber.length; i++) {

            System.out.println(" enter a number : ");

            arrayNumber[i] = scanner.nextInt();


        }
    }
}
