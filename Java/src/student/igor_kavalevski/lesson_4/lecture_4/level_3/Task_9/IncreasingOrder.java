package student.igor_kavalevski.lesson_4.lecture_4.level_3.Task_9;

import java.util.Scanner;

public class IncreasingOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number :");
        int a = sc.nextInt();

        System.out.println("Please enter your second number :");
        int b = sc.nextInt();

        System.out.println("Please enter your third number :");
        int c = sc.nextInt();

        if (a < b && b < c) {
            System.out.println("increasing");
        } else if (a > b && b > c) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
