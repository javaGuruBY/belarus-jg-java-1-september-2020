package student.konstantin_adotik.level_3.task_11;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 целых числа");
        double numberOne = scanner.nextInt();
        double numberTwo = scanner.nextInt();
        double numberThree = scanner.nextInt();
        double numberFoure = (numberOne + numberTwo + numberThree) / 3;
        System.out.println("numberOne + numberTwo  + numberThree / 3 = " + numberFoure);

    }

}


