package Calculator;

import Calculator.Application.Calculator1;
import Calculator.Application.Menu;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator1 calculator1 = new Calculator1();

        boolean isQuit = false;

        while (!isQuit) {

            Menu.menu();

            switch (scanner.nextInt()) {
                case 1:
                    calculator1.sum(scanner.nextInt(), scanner.nextInt());
                    break;
                case 2:
                    calculator1.subtraction(scanner.nextInt(), scanner.nextInt());
                    break;
                case 3:
                    calculator1.multiply(scanner.nextInt(), scanner.nextInt());
                    break;
                case 4:
                    calculator1.division(scanner.nextInt(), scanner.nextInt());
                    break;
                case 5:
                    calculator1.isEven(scanner.nextInt());
                    break;
                case 6:
                    calculator1.maxOfTwoNumbers(scanner.nextInt(), scanner.nextInt());
                    break;
                case 7:
                    calculator1.maxOfThreeNumber(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
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
