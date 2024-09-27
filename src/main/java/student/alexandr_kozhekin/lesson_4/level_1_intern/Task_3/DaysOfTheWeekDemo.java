package student.alexandr_kozhekin.lesson_4.level_1_intern.Task_3;

import java.util.Scanner;

public class DaysOfTheWeekDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Для вывода дня недели введите число от 1 до 7: ");

        DaysOfTheWeek.daysOfTheWeek(scanner.nextInt());
    }
}
