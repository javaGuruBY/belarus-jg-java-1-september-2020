package student.alexandr_kozhekin.lesson_2.level_3.Task_11;

import java.util.Scanner;

public class Average {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three values to display the arithmetic mean" + "\n");
        System.out.println("Enter the first value: ");
        int firstValue = scanner.nextInt();
        System.out.println("Enter the second value: ");
        int secondValue = scanner.nextInt();
        System.out.println("Enter the third value: ");
        int thirdValue = scanner.nextInt();

        double average = (double) (firstValue + secondValue + thirdValue) / 3;
        System.out.println("Result: " + average);
    }
}
