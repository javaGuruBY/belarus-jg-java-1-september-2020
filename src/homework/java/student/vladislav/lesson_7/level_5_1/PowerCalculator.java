package homework.java.student.vladislav.lesson_7.level_5_1;

import java.util.Scanner;

public class PowerCalculator {
     int number;
     public void setNumber(int number) {
         this.number = number;
     }
     public double power(int number, int power) {
         return Math.pow(number, power);
     }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PowerCalculator calculator = new PowerCalculator();

        int element = 3;
        while (element > 2) {
            System.out.println("Включить калькулятор 1 ");
            element = scanner.nextInt();
            } if (element < 2) {
            System.out.println("Введите возводимое число в степень");
            int number = scanner.nextInt();
            System.out.println("Введите в какую степень возвести");
            int power = scanner.nextInt();

            calculator.setNumber(number);
            System.out.println("Результат: " + (int) calculator.power(number, power));
        }
        }
    }


