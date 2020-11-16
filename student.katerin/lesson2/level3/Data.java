/*Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.*/

package student.katerin.lesson2.level3;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num:");
        int num= scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num + "*" + i + "=" + (num*i));
        }
    }
}
