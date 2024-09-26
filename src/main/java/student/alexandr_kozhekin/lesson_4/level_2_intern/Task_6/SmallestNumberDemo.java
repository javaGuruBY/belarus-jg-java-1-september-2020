package student.alexandr_kozhekin.lesson_4.level_2_intern.Task_6;

import java.util.Scanner;

public class SmallestNumberDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввведите два целых числа для поиска наименьшего: ");

        SmallestNumber.smallestNumber(scanner.nextInt(), scanner.nextInt());
    }
}
