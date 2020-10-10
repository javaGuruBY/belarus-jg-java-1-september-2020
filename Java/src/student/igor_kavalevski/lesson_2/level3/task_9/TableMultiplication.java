package student.igor_kavalevski.lesson_2.level3.task_9;

import java.util.Scanner;

//Resolution: ACCEPTED
public class TableMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number:");
        int number = scanner.nextInt();

        System.out.println("Input a number: " + number + "\n");
        System.out.println("Expected Output :");

        // Хорошо, но циклы мы пока не проходили ;)
        for (int i = 1; i <= 10; i++) {
            System.out.println(+number + " x " + i + " = " + (number * i));
        }
    }
}
