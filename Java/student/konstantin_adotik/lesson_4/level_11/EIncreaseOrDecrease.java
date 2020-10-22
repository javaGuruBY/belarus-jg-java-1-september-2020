package student.konstantin_adotik.lesson_4.level_11;

import java.util.Scanner;

public class EIncreaseOrDecrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 < num2 && num2 < num3)
        {
            System.out.println("Increasing");
        } else if (num1 > num2 && num1 > num3)

        {  System.out.println("Decreasing");
        } else
        {
            System.out.println("Neither");
        }
    }
}
