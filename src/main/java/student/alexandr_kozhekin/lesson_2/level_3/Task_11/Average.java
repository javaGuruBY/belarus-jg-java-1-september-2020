package student.alexandr_kozhekin.lesson_2.level_3.Task_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three values to display the arithmetic mean" + "\n");
        //блок для отлова ошибки если вдруг введут не число а букву
        try {
            System.out.println("Enter the first value: ");
            int firstValue = scanner.nextInt();

            System.out.println("Enter the second value: ");
            int secondValue = scanner.nextInt();

            System.out.println("Enter the third value: ");
            int thirdValue = scanner.nextInt();

            System.out.println("Entered values: " +
                    "|" + firstValue + "|" + secondValue + "|" + thirdValue + "|" + "\n" +
                    "Result: " + average(firstValue, secondValue, thirdValue));
        }
        catch (InputMismatchException e){
            System.out.println("Invalid value entered!" + "\n" + "Please, enter integer!");
        }
    }

    public static double average(int firstValue, int secondValue, int thirdValue){
        return (double) (firstValue + secondValue + thirdValue) / 3;
    }
}
