package student.igor_kavalevski.level3;

import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number:");
        int number = scanner.nextInt();

        System.out.println("Input a number: " + number + "\n");
        System.out.println("Expected Output :");

        for (int i = 1; i <= 10; i++) {
            System.out.println(+number + " x " + i + " = " + (number * i));
        }
    }
}
