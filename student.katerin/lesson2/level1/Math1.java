/*Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.*/

package student.katerin.lesson2.level1;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first num:  ");
        double a = scanner.nextDouble();

        System.out.print("Enter second num:  ");
        double b = scanner.nextDouble();

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+ (a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
    }
}
