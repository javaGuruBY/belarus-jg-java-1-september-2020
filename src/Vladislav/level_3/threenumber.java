package level_3;

import java.util.Scanner;

public class threenumber {

    public static void main(String[] args) {

        // task 8

        System.out.println("1. Написать три числа которые все равны, либо не все равны, или , иначе");
        System.out.println("Введите три числа");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3)
        {
            System.out.println("Все числа равны");
        }  else if (num1 != num2 && num2 != num3)
        {
            System.out.println("Все числа не равны");
        } else {
            System.out.println("Пару чисел равны");
        }

        // task 9

        System.out.println("2. Вывести три числа в степени увеличения или уменьшия, другое, иначе");
        System.out.println("Введите три числа");
        int nam1 = scanner.nextInt();
        int nam2 = scanner.nextInt();
        int nam3 = scanner.nextInt();

        if (nam1 < nam2 && nam2 < num3)
        {
            System.out.println("Increasing");
        }  else if (nam1 > nam2 && nam1 > nam3)
        {
            System.out.println("Decreasing");
        }
        else
        {
            System.out.println("Neither");
        }

        // task 10

        System.out.println("3. Написать программу, которая выводит наибольшее число из трёх");
        System.out.println("Введите три числа");
        int nem1 = scanner.nextInt();
        int nem2 = scanner.nextInt();
        int nem3 = scanner.nextInt();
        if (nem1 > nem2 && nem3 <nem1)
        {
        System.out.println("Наибольшее число " +nem1);
        } else if (nem2 > nem1 && nem2>nem3)
        {
            System.out.println("Большее число " + nem2);
        } else if (nem3 > nem1 && nem3>nem2)
        {
            System.out.println("Большее число " +nem3);
        }
        }

    }


