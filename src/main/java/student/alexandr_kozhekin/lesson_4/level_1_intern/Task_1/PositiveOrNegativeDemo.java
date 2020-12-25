package student.alexandr_kozhekin.lesson_4.level_1_intern.Task_1;

import java.util.Scanner;

public class PositiveOrNegativeDemo {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите простое число: ");

        PositiveOrNegative.positiveOrNegativeNumber(scanner.nextInt());
    }
}
