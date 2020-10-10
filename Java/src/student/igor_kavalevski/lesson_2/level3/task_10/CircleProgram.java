package student.igor_kavalevski.lesson_2.level3.task_10;

import java.util.Scanner;

//Resolution: ACCEPTED
public class CircleProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter the radius of the circle:");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        double perimeter = Math.PI * 2*radius;

        System.out.println("Perimeter is = "+perimeter);
        System.out.println("Area is = "+area);





    }
}
