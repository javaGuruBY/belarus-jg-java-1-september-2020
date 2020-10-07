package student.alexandr_kozhekin.lesson_2.level_1.Task_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Addition: " + (firstNumber + secondNumber) + "\n");
        System.out.println("Subtraction: " + (firstNumber - secondNumber) + "\n");
        System.out.println("Multiplication: " + (firstNumber * secondNumber) + "\n");
        System.out.println("Division: " + (firstNumber / secondNumber));

    }
}
