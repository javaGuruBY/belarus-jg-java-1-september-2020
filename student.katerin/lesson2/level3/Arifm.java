/*Напишите программу, которая запрашивает у пользователя
        три целых числа и выводит их среднее арифметическое
        (складывает все числа и делит на их количество).*/

package student.katerin.lesson2.level3;

import java.util.Scanner;

public class Arifm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 numbers:");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        double d = a+b+c;

        System.out.println("Mean:"+(d/3));
    }
}
