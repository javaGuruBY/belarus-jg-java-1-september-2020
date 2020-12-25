package student.alexandr_kozhekin.lesson_4.level_3_junior.Task_10;

import java.util.Scanner;

public class LargestOfThreeNumbersDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа для вычесления наибольшего: ");

        LargestOfThreeNumbers.largestOfThreeNumbers(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
}
