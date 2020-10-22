package student.igor_kavalevski.lesson_4.lecture_4.Task_1;

import java.util.Scanner;

public class SignComparator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number = ");

        int number = sc.nextInt();

        if (number > 0) {
            System.out.println( + number +  " = Number is positive ");
        } else if (number < 0) {
            System.out.println( + number + " = Number is negative ");
        } else  {
            System.out.println( + number + " = Number is equal to zero ");
        }

    }
}

