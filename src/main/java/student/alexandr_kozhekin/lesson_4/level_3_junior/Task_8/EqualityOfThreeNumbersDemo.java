package student.alexandr_kozhekin.lesson_4.level_3_junior.Task_8;

import java.util.Scanner;

public class EqualityOfThreeNumbersDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа: ");

        EqualityOfThreeNumbers.equalityOfThreeNumbers(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
}
