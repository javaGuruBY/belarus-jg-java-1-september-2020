/*Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!*/

package student.katerin.lesson2.level2;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.println("Hello, "+name);
    }
}
