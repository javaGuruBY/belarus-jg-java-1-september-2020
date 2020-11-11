package Calculator.Application;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void sum() {

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        int result = Calculator.sum(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void subtraction() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        int result = Calculator.subtraction(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void multiply() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        int result = Calculator.multiply(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void division() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;
        int result = Calculator.division(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void isEven() {
        int firstNumber = 2;
        boolean flag = true;
        boolean result = Calculator.isEven(firstNumber);

        Assert.assertEquals(flag, result);
    }

    @Test
    public void isOdd() {

        int firstNumber = 1;
        boolean flag = false;
        boolean result = Calculator.isEven(firstNumber);

        Assert.assertEquals(flag, result);
    }

    @Test
    public void firstNumberMax() {

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        int result = Calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void secondNumberMax() {

        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        int result = Calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void numbersEqual() {

        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        int result = Calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void firstNumberOutOfThree() {

        int firstNumTest = 3;
        int secondNumTest = 2;
        int threeNumTest = 1;
        int expectedResult = 3;
        int result = Calculator.maxOfThreeNumber(firstNumTest, secondNumTest, threeNumTest);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void secondNumberOutOfThree() {

        int firstNumTest = 1;
        int secondNumTest = 12;
        int threeNumTest = 3;
        int expectedResult = 12;
        int result = Calculator.maxOfThreeNumber(firstNumTest, secondNumTest, threeNumTest);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void threeNumberOutOfThree() {

        int firstNumTest = 1;
        int secondNumTest = 4;
        int threeNumTest = 10;
        int expectedResult = 10;
        int result = Calculator.maxOfThreeNumber(firstNumTest, secondNumTest, threeNumTest);

        Assert.assertEquals(expectedResult, result);
    }
}