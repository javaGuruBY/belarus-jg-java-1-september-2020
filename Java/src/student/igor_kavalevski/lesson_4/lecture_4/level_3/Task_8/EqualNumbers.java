package student.igor_kavalevski.lesson_4.lecture_4.level_3.Task_8;

import java.util.Scanner;

public class EqualNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number :");
        int a = sc.nextInt();

        System.out.println("Please enter your second number :");
        int b = sc.nextInt();

        System.out.println("Please enter your third number :");
        int c = sc.nextInt();

        if (a == b && a == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && a != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}