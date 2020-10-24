package student.katerin.lesson4.level_1.task_3;

import java.util.Scanner;

public class DayOfWeekDemo {
    public static void main(String[] args) {

        int flag = 0;
        while (flag == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a num: ");
            int dayOfWeek = scanner.nextInt();

            if (dayOfWeek > 0 && dayOfWeek < 8) {
                DayOfWeek day = new DayOfWeek();
                System.out.println(day.printDay(dayOfWeek));
                flag++;
            } else
                System.out.println("Invalid number! Try again!");
        }
    }
}
