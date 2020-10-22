package student.konstantin_adotik.lesson_4.level_10;

import java.util.Scanner;

public class Metod {
    public static void main(String[] args) {
        System.out.println("enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3)
        {
            System.out.println("All numbers are equal");
        }  else if (num1 != num2 && num2 != num3)
        {
            System.out.println("All numbers are not equal");
        } else {
            System.out.println("The numbers are equal");
        }

    }
}
