package student.alexandr_kozhekin.lesson_2.level_3.Task_10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("To get the perimeter and area of the circle, enter the radius!" + "\n");
        //блок для отлова ошибки если вдруг введут не число а букву
        try {
            System.out.println("Please enter the radius of the circle: ");
            double circleRadius = scanner.nextDouble();
            System.out.println("Radius = " + circleRadius + "\n");
            System.out.println("Result: ");
            System.out.println("Perimeter is = " + calculationPerimeter(circleRadius));
            System.out.println("Area is = " + calculationArea(circleRadius));
        }
        catch (InputMismatchException e){
            System.out.println("Invalid value entered!" + "\n"
                    + "Please, enter an integer or decimal number!");
        }
    }
    //метод для вычесления периметра
    public static double calculationPerimeter(double circleRadius){
        return 2 * Math.PI * circleRadius;
    }
    //метод для вычесления площади
    public static double calculationArea(double circleRadius){
        return Math.PI * circleRadius * circleRadius;
    }
}
