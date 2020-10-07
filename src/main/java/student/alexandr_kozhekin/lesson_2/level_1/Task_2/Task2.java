package student.alexandr_kozhekin.lesson_2.level_1.Task_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double firstDoubleNumber = scanner.nextDouble();
        double secondDoubleNumber = scanner.nextDouble();

        System.out.println("Addition: " + (firstDoubleNumber + secondDoubleNumber) + "\n");
        System.out.println("Subtraction: " + (firstDoubleNumber - secondDoubleNumber) + "\n");
        System.out.println("Multiplication: " + (firstDoubleNumber * secondDoubleNumber) + "\n");
        System.out.println("Division: " + (firstDoubleNumber / secondDoubleNumber));
    }
}

