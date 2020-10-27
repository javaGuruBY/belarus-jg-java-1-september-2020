package student.igor_kavalevski.lesson_4.lecture_4.level_2.task_5;

import java.util.Scanner;

public class GreatestNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your firstNumber : ");
        int a = scanner.nextInt();

        System.out.println("Enter your secondNumber : ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(" The greatest " + (a));
        } else if (a < b) {
            System.out.println(" The greatest " + (b));
        } else {
            System.out.println("FirstNumber equally to SecondNumber");
        }
    }
}
