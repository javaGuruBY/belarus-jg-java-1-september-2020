package student.igor_kavalevski.lesson_4.lecture_4.level_3.Task_10;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number :");
        int a = sc.nextInt();

        System.out.println("Please enter your second number :");
        int b = sc.nextInt();

        System.out.println("Please enter your third number :");
        int c = sc.nextInt();

        if (a >= b && a > c) {
            System.out.println("The fewest :" + (a));
        } else if (b >= a && b > c) {
            System.out.println("The fewest :" + (b));
        } else if (a >= c && a > b) {
            System.out.println("The fewest :" + (a));
        } else if (c >= b && c > a) {
            System.out.println("The fewest :" + (c));
        } else {
            System.out.println("Numbers to equals");
        }
    }
}

