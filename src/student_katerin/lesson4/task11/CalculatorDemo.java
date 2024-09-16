package student_katerin.lesson4.task11;

import java.util.Scanner;

class CalculatorDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Second number: ");
        int secondNumber = sc.nextInt();
        Calculator calculator = new Calculator();

        int i = 0;

        while (i != 6) {
            System.out.println("Menu:\n1)Sum\n2)Difference\n3)Composition\n" +
                    "4)Division\n5)Max number\n6)Exit");
            System.out.print("Choose:");
            i = sc.nextInt();

            switch (i) {
                case 1: {
                    int sumRes = calculator.sum(firstNumber, secondNumber);
                    System.out.println("Sum result = " + sumRes);
                    break;
                }
                case 2: {
                    int differenceRes = calculator.difference(firstNumber, secondNumber);
                    System.out.println("Difference result = " + differenceRes);
                    break;
                }
                case 3: {
                    int compositionRes = calculator.composition(firstNumber, secondNumber);
                    System.out.println("Composition result = " + compositionRes);
                    break;
                }
                case 4: {
                    double divisionRes = calculator.division(firstNumber, secondNumber);
                    if (secondNumber != 0) {
                        System.out.println("Division result = " + divisionRes);
                    } else System.out.println("Second number is 0, division is not available!");
                    break;
                }
                case 5: {
                    int maxRes = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
                    if (maxRes == 0) System.out.println("Numbers are equal");
                    else System.out.println("Max number = " + maxRes);
                }
                case 6:
                    break;
            }

        }
    }
}
