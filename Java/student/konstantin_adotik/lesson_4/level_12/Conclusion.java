package student.konstantin_adotik.lesson_4.level_12;

import java.util.Scanner;

public class Conclusion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 > num2 && num3 < num1)
        {
            System.out.println("Наибольшее число " + num1);
        } else if (num2 > num1 && num2 > num3)
        {
            System.out.println("Большее число " + num2);
        } else if (num3 > num1 && num3 > num2)
        {
            System.out.println("Большее число " + num3);
        }
    }

}


