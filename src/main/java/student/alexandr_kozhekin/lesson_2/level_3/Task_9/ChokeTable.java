package student.alexandr_kozhekin.lesson_2.level_3.Task_9;

import java.util.Scanner;

public class ChokeTable {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Data: ");
        int number = scanner.nextInt();
        System.out.println("Input a number: " + number + "\n");
        System.out.println("Expected Output :");

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
