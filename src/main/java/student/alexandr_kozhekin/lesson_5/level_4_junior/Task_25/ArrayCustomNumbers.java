package student.alexandr_kozhekin.lesson_5.level_4_junior.Task_25;

import java.util.Scanner;

public class ArrayCustomNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");

        int [] arrayCustomNum = new int [scanner.nextInt()];

        System.out.println("\n" + "Длина массива = " + arrayCustomNum.length);

        System.out.println("Введите простое число для записи в массив:");

        for (int i = 0; i < arrayCustomNum.length; i++){

            arrayCustomNum[i] = scanner.nextInt();

        }

        for (int i = 0; i < arrayCustomNum.length; i++){

            System.out.println(arrayCustomNum[i]);

        }
    }
}
