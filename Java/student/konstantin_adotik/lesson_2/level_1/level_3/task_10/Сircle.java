package student.konstantin_adotik.lesson_2.level_1.level_3.task_10;

import java.util.Scanner;

public class Сircle {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Test Data: ");

        int day = 07;

        int month = 10;

        int year = 2020;

        System.out.println(day + "/" +  month + "/" + year );

        System.out.println("Введите радиус окружности :");

        System.out.println();

        System.out.print("Radius = ");

        double Radius = scanner.nextDouble();

        System.out.print("peremiter is = ");

        double peremiter   = 2 * 3.14 * Radius;

        System.out.println(peremiter);

        System.out.print("Area  is = ");

        double Area =  3.14 * Radius * Radius;

        System.out.print(Area);



    }
}
