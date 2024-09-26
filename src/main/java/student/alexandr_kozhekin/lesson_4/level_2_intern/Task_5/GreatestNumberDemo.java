package student.alexandr_kozhekin.lesson_4.level_2_intern.Task_5;

import java.util.Scanner;

public class GreatestNumberDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввведите два целых числа для поиска наибольшего: ");

        GreatestNumber.greatestNumber(scanner.nextInt(), scanner.nextInt());
    }
}
