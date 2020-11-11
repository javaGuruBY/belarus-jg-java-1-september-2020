package student.alexandr_kozhekin.lesson_4.level_4_junior.Task_11_15.Calculator;



import student.alexandr_kozhekin.lesson_4.level_4_junior.Task_11_15.Calculator.Application.Calculator;
import student.alexandr_kozhekin.lesson_4.level_4_junior.Task_11_15.Calculator.Application.Menu;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean isQuit = false;

        while (!isQuit) {

            Menu.menu();

            switch (scanner.nextInt()) {
                case 1:
                    calculator.sum(scanner.nextInt(), scanner.nextInt());
                    break;
                case 2:
                    calculator.subtraction(scanner.nextInt(), scanner.nextInt());
                    break;
                case 3:
                    calculator.multiply(scanner.nextInt(), scanner.nextInt());
                    break;
                case 4:
                    calculator.division(scanner.nextInt(), scanner.nextInt());
                    break;
                case 5:
                    calculator.isEven(scanner.nextInt());
                    break;
                case 6:
                    calculator.maxOfTwoNumbers(scanner.nextInt(), scanner.nextInt());
                    break;
                case 7:
                    calculator.maxOfThreeNumber(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    break;
                case 8:
                    isQuit = true;
                    break;
                default:
                    System.out.println("Такой операции нет!" +
                            "\n" + "Выберите нужную операцию!");
            }
        }
    }
}
