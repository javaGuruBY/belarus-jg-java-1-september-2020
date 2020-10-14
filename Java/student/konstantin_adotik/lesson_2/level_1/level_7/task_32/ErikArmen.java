package student.konstantin_adotik.lesson_2.level_1.level_7.task_32;

import java.util.Scanner;

public class ErikArmen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите десятичное число : ");
        double number = scanner.nextDouble();
        System.out.print("Введите ваш текст :");
        String four = scanner.next();
        System.out.println("Число которое вы ввели = " + number);
        System.out.println("Ваш текс : " + four);
        System.out.println("Квадртаное значение вашего числа " + (number * number));


    }
}
