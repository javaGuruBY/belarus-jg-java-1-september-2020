package student.konstantin_adotik.lesson_4.level_9;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Take a two numbers ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 < num2)
            System.out.println( num1 + " less ");
        else
            System.out.println( num2 + " less " );


    }
}
