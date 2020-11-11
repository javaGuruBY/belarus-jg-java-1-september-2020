package Calculator.Application;

import java.util.Objects;

public class Calculator {

    public Calculator() {
    }

    public static int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public static int subtraction(int firstNumber, int secondNumber){

        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber){

        return firstNumber * secondNumber;
    }

    public static int division(int firstNumber, int secondNumber){

        return firstNumber / secondNumber;
    }

    public static boolean isEven(int number) {

        if (number % 2 == 0) {

            return true;

        } else {

            return false;
        }
    }

    public static int maxOfTwoNumbers(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {

            return firstNumber;

        } else if (firstNumber < secondNumber) {

            return secondNumber;

        } else {

            return firstNumber;
        }
    }

    public static int maxOfThreeNumber(int firstNumber, int secondNumber,int threeNumber) {

        if (firstNumber > secondNumber && firstNumber > threeNumber) {

            return firstNumber;

        } else if (secondNumber > threeNumber) {

            return secondNumber;

        }

        return threeNumber;
    }
}
