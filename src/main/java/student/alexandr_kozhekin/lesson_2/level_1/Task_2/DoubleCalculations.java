package student.alexandr_kozhekin.lesson_2.level_1.Task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleCalculations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter two decimal numbers!" + "\n");
        //блок для отлова ошибки если вдруг введут не число а букву
        try {
            System.out.println("Decimal number one: ");
            double firstDoubleNumber = scanner.nextDouble();
            System.out.println("Decimal number two: ");
            double secondDoubleNumber = scanner.nextDouble();
            System.out.println("Entered values: " + "|" + firstDoubleNumber + "|" + secondDoubleNumber + "|");

            calculations(firstDoubleNumber, secondDoubleNumber);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid value entered!" + "\n"
                    + "Please, enter double value!");
        }
    }

    public static void calculations(double firstDoubleNumber, double secondDoubleNumber){
        System.out.println("Result: " + "\n");

        double addition = firstDoubleNumber + secondDoubleNumber;
        System.out.println("Addition: " + addition + "\n");

        double subtraction = firstDoubleNumber - secondDoubleNumber;
        System.out.println("Subtraction: " + subtraction + "\n");

        double multiplication = firstDoubleNumber * secondDoubleNumber;
        System.out.println("Multiplication: " + multiplication + "\n");

        double division = firstDoubleNumber / secondDoubleNumber;
        System.out.println("Division: " + division);
    }
}

