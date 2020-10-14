package student.konstantin_adotik.lesson_2.level_1.task_1;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int x = scanner.nextInt();
        int b = scanner.nextInt();
        int z = x + b;
        System.out.println("x + b = " + z );

        System.out.println();

        z = x - b;
        System.out.println("x - b = " + z );

        System.out.println();

        z = x * b ;
        System.out.println("x * b = " + z );

        System.out.println();

        z = x / b ;
        System.out.println("x / b = " + z );


    }
}
