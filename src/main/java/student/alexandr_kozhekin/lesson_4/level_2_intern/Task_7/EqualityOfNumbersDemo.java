package student.alexandr_kozhekin.lesson_4.level_2_intern.Task_7;

import java.util.Scanner;

public class EqualityOfNumbersDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два целых числа для выяснения равенства: ");

        EqualityOfNumbers.equalityOfNumbers(scanner.nextInt(), scanner.nextInt());
    }
}
