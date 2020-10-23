package student.alexandr_kozhekin.lesson_2.level_3.Task_9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChokeTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //блок для отлова ошибки если вдруг введут не число а букву
        try {
            System.out.println("To get the table, enter a prime number from 1 to 10");
            int number = scanner.nextInt();
            //проверка на заданный диапозон
            if (number > 10 || number <= 0) {
                System.out.println("The entered number is not included in this range!");
            } else {
                System.out.println("Input a number: " + number + "\n");
                System.out.println("Result: ");
                calculationsChokeTable(number);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid value entered!" + "\n" + "Please, enter integer!");
        }
    }

    public static void calculationsChokeTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}


