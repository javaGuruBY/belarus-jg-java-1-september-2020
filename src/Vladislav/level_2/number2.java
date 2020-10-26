package level_2;

import java.util.Scanner;

public class number2 {

    public static void main(String[] args) {

        // task 5

        System.out.println("1. Наибольшее число");
        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        if (num > num1)
            System.out.println("Число " + num + " большее");
        else
            System.out.println("Число " + num1 +" большее");

        // task 6

        System.out.println("2.  Наименьшее число");
        System.out.println("Введите два числа");
        int chislo = scanner.nextInt();
        int chislo1 = scanner.nextInt();
        if (chislo < chislo1)
            System.out.println("Число " + chislo + " меньшее");
        else
            System.out.println("Число" + chislo1 + " меньшее" );

        // task 7

        System.out.println("3. Равны или не?");
        System.out.println("Введите два числа");
        int cff1 = scanner.nextInt();
        int cff2 = scanner.nextInt();
        if (cff1 == cff2)
            System.out.println("Числа равны");
        else
            System.out.println("Числа не равны");
    }

}
