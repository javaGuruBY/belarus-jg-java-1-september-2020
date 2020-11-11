package Calculator.Test;

import Calculator.Application.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplyTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.isOddTest();
        calculatorTest.firstNumberMaxTest();
        calculatorTest.secondNumberMaxTest();
        calculatorTest.numbersEqualTest();
        calculatorTest.firstNumberOutOfThreeTest();
        calculatorTest.secondNumberOutOfThreeTest();
        calculatorTest.threeNumberOutOfThreeTest();
    }

    public void sumTest() {

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        int result = Calculator.sum(firstNumber, secondNumber);

        if (result == expectedResult) {

            testPassed("Sum test");

        } else {

            testFailed(firstNumber, secondNumber, expectedResult, result);
        }
    }

    public void subtractionTest() {

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;


        int result = Calculator.subtraction(firstNumber, secondNumber);

        if (result == expectedResult) {

            testPassed("Subtraction test");

        } else {

            testFailed(firstNumber, secondNumber, expectedResult, result);
        }
    }

    public void multiplyTest() {

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        int result = Calculator.multiply(firstNumber, secondNumber);

        if (result == expectedResult) {

            testPassed("Multiply test");

        } else {

            testFailed(firstNumber, secondNumber, expectedResult, result);
        }
    }

    public void divisionTest() {

        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;

        int result = Calculator.division(firstNumber, secondNumber);

        if (result == expectedResult) {

            testPassed("Division test");

        } else {

            testFailed(firstNumber, secondNumber, expectedResult, result);
        }
    }

    public void isEvenTest() {

        int firstNumber = 2;
        boolean flag = true;

        boolean resultOne = Calculator.isEven(firstNumber);

        if (resultOne == flag) {

            testPassed("Even test");

        } else {

            testFailed(firstNumber, flag, resultOne);
        }
    }

    public void isOddTest() {

        int firstNumber = 1;
        boolean flag = true;

        boolean resultOne = Calculator.isEven(firstNumber);

        if (resultOne != flag) {

            testPassed("Odd test");

        } else {

            testFailed(firstNumber, flag, resultOne);
        }
    }

    public void firstNumberMaxTest() {

        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;

        int result = Calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == expectedResult) {

            testPassed("First number max test");

        } else {

            testFailed(firstNumber, secondNumber, expectedResult, result);
        }
    }

    public void secondNumberMaxTest(){

        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;

        int result = Calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == expectedResult) {

            testPassed("Second number max test");

        } else {

            testFailed(firstNumber, secondNumber, expectedResult, result);
        }
    }

    public void numbersEqualTest(){

        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;

        int result = Calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == expectedResult) {

            testPassed("Equal number test");

        } else {

            testFailed(firstNumber, secondNumber, expectedResult, result);
        }
    }

    public void firstNumberOutOfThreeTest() {

        int firstNumTest = 3;
        int secondNumTest = 2;
        int threeNumTest = 1;
        int expectedResult = 3;

        int result = Calculator.maxOfThreeNumber(firstNumTest, secondNumTest, threeNumTest);

        if (result == expectedResult){
            testPassed("First number out of three test");
        } else {
            testFailed(firstNumTest, secondNumTest, threeNumTest, expectedResult, result);
        }
    }

    public void secondNumberOutOfThreeTest(){

        int firstNumTest = 1;
        int secondNumTest = 12;
        int threeNumTest = 3;
        int expectedResult = 12;

        int result = Calculator.maxOfThreeNumber(firstNumTest, secondNumTest, threeNumTest);

        if (result == expectedResult){
            testPassed("Second number out of three test");
        } else {
            testFailed(firstNumTest, secondNumTest, threeNumTest, expectedResult, result);
        }
    }

    public void threeNumberOutOfThreeTest(){

        int firstNumTest = 1;
        int secondNumTest = 4;
        int threeNumTest = 10;
        int expectedResult = 10;

        int result = Calculator.maxOfThreeNumber(firstNumTest, secondNumTest, threeNumTest);

        if (result == expectedResult){
            testPassed("Three number out of three test");
        } else {
            testFailed(firstNumTest, secondNumTest, threeNumTest, expectedResult, result);
        }
    }

    private void testPassed(String message) {
        System.out.println("\u001B[32m  " + message + " passed successfully \u001B[0m");
    }

    private void testFailed(int firstNum, int secondNum, int threeNum, int expected, int actual) {
        throw new RuntimeException("" +
                "\n\ttest failed: " +
                "\nfor first \t" + firstNum + " " +
                "\nand second \t" + secondNum + " " +
                "\nand three \t" + threeNum + " " +
                "\nexpected \t" + expected + " " +
                "\nbut got \t" + actual);
    }

    private void testFailed(int left, int right, int expected, int actual) {
        throw new RuntimeException("" +
                "\n\ttest failed: " +
                "\nfor left \t" + left + " " +
                "\nand right \t" + right + " " +
                "\nexpected \t" + expected + " " +
                "\nbut got \t" + actual);
    }

    private void testFailed(int left, boolean expected, boolean actual){
        throw new RuntimeException("" +
                "\n\ttest failed: " +
                "\nfor left \t" + left + " " +
                "\nexpected \t" + expected + " " +
                "\nbut got \t" + actual);
    }
}

