package student.alexandr_kozhekin.lesson_2.level_3.Task_10;

import java.util.Scanner;

public class Circle {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Data: ");
        double circleRadius = scanner.nextDouble();
        System.out.println("Radius = " + circleRadius + "\n");

        System.out.println("Result");
        System.out.println("Perimeter is = " + (2 * Math.PI * circleRadius));
        System.out.println("Area is = " + (Math.PI * circleRadius * circleRadius));
    }
}
