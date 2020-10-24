package student.katerin.lesson4.task11;

import java.util.Scanner;

class CalculatorDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Second number: ");
        int secondNumber = sc.nextInt();
        Calculator calculator = new Calculator();

        int i=0;

        while (i != 5) {
            System.out.println("Menu:\n1)Sum\n2)Difference\n3)Composition\n4)Division\n5)Exit");
            System.out.print("Choose:");
            i = sc.nextInt();

            switch (i) {
                case 1: {
                    int result1 = calculator.sum(firstNumber, secondNumber);
                    System.out.println("Sum result = " + result1);
                    break;
                }
                case 2: {
                    int result2 = calculator.difference(firstNumber, secondNumber);
                    System.out.println("Difference result = " + result2);
                    break;
                }
                case 3: {
                    int result3 = calculator.composition(firstNumber, secondNumber);
                    System.out.println("Composition result = " + result3);
                    break;
                }
                case 4: {
                    double result4 = calculator.division(firstNumber, secondNumber);
                    if (secondNumber != 0) {
                        System.out.println("Division result = " + result4);
                    } else System.out.println("Second number is 0, division is not available!");
                    break;
                }
                case 5: {
                    break;
                }
            }

        }
    }
}
