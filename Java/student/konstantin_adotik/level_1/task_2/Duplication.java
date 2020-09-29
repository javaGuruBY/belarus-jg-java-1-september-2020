package student.konstantin_adotik.level_1.task_2;

import java.util.Scanner;

public class Duplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два десятичных числа :");
        System.out.println();
        double x = scanner.nextDouble();
        double b = scanner.nextDouble();
        double z = x + b;
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
