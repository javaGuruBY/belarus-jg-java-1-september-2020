package student.alexandr_kozhekin.lesson_4.level_4_junior.Task_11_15.Test;

import student.alexandr_kozhekin.lesson_4.level_4_junior.Task_11_15.Application.Calculator;

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

        Calculator calculator = new Calculator();

        int result = calculator.sum(firstNumber, secondNumber);

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

        Calculator calculator = new Calculator();

        int result = calculator.subtraction(firstNumber, secondNumber);

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

        Calculator calculator = new Calculator();

        int result = calculator.multiply(firstNumber, secondNumber);

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

        Calculator calculator = new Calculator();

        int result = calculator.division(firstNumber, secondNumber);

        if (result == expectedResult) {

            testPassed("Division test");

        } else {

            testFailed(firstNumber, secondNumber, expectedResult, result);
        }
    }

    public void isEvenTest() {

        int firstNumber = 2;
        boolean flag = true;

        Calculator calculator = new Calculator();

        boolean resultOne = calculator.isEven(firstNumber);

        if (resultOne == flag) {

            testPassed("Even test");

        } else {

            testFailed(firstNumber, flag, resultOne);
        }
    }

    public void isOddTest() {

        int firstNumber = 1;
        boolean flag = true;

        Calculator calculator = new Calculator();

        boolean resultOne = calculator.isEven(firstNumber);

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

        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

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

        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == expectedResult) {

            testPassed("Second number max test");

        } else {

            testFailed(firstNumber, secondNumber, expectedResult, result);
        }
    }

    private void numbersEqualTest(){

        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

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

        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumber(firstNumTest, secondNumTest, threeNumTest);

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

        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumber(firstNumTest, secondNumTest, threeNumTest);

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

        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumber(firstNumTest, secondNumTest, threeNumTest);

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

