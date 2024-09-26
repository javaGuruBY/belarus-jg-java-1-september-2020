package student.alexandr_kozhekin.lesson_5.level_2_intern.Task_11;

import java.util.Scanner;

public class FillingTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arraysForThreeNum = new int[3];

        System.out.println("Заполнение массива!");

        for (int i = 0; i < arraysForThreeNum.length; i++) {

                System.out.println("Введите целое число: ");

                arraysForThreeNum[i] = scanner.nextInt();

            }

            System.out.println("Массив заполнен!");

        for (int i = 0; i < arraysForThreeNum.length; i++){

            System.out.print("| " + arraysForThreeNum[i] + " | ");
        }
    }
}
