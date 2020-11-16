/*Написать консольную программу, которая запрашивает у пользователя два целых числа и
выводит на консоль результаты: сложения, вычитания, умножения и деления.*/

package student.katerin.lesson2.level1;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first num:  ");
        int a = scanner.nextInt();

        System.out.print("Enter second num:  ");
        int b = scanner.nextInt();

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+ (a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/(double)b));
    }
}
