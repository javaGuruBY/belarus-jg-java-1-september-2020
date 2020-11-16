/*Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль
периметр и площадь круга.*/

package student.katerin.lesson2.level3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        double pi=3.1415926536;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius:");
        double r= scanner.nextDouble();

        System.out.println("P="+(2*pi*r));
        System.out.println("S="+(pi*r*r));
    }
}
