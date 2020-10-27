package student.igor_kavalevski.lesson_4.lecture_4.level_2.Task_7;

import java.util.Scanner;

public class EqualTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number :");
        int firstNumbers = scanner.nextInt();

        System.out.println("Please enter your second number :");
        int secondNumber = scanner.nextInt();

        if (firstNumbers == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}

