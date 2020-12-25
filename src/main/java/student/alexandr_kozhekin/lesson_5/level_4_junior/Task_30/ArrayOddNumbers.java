package student.alexandr_kozhekin.lesson_5.level_4_junior.Task_30;

import java.util.Scanner;

import static student.alexandr_kozhekin.lesson_5.level_4_junior.Task_30.SearchOddNumbers.searchOddNumbersArray;

public class ArrayOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");

        int[] arrayCustomNum = new int[scanner.nextInt()];

        System.out.println("\n" + "Длина массива = " + arrayCustomNum.length);

        System.out.println("Автоматическое заполнение массива случайными числами:");

        for (int i = 0; i < arrayCustomNum.length; i++) {

            arrayCustomNum[i] = (int) (Math.random() * (1000 + 1));
        }

        for (int i = 0; i < arrayCustomNum.length; i++){

            System.out.println(arrayCustomNum[i]);

        }

       searchOddNumbersArray(arrayCustomNum);

    }
}
