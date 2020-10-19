package by.jrr.test.calculator;

import by.jrr.calculator.service.Calculator;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    public void run() {
        testSumming();
        testSubtractionFirstScenario();
        testSubtractionSecondScenario();
        testSubtractionThirdScenario();

    }

    public void testSumming() {
        int left = 4;
        int right = 5;
        int expected = 9;

        int actual = calculator.summing(4, 5);
        if(expected == actual) {
            testPassed("testSumming ");
        } else {
            testFailed(left, right, expected, actual);
        }
    }

    public void testSubtractionFirstScenario() {
        int left = 4;
        int right = 5;
        int expected = -1;

        int actual = calculator.subtraction(left, right);
        if(expected == actual) {
            testPassed("testSubtractionFirstScenario");
        } else {
            testFailed(left, right, expected, actual);
        }
    }

    public void testSubtractionSecondScenario() {
        int left = 10;
        int right = 5;
        int expected = 5;

        int actual = calculator.subtraction(left, right);
        if(expected == actual) {
            testPassed("testSubtractionSecondScenario");
        } else {
            testFailed(left, right, expected, actual);
        }
    }

    public void testSubtractionThirdScenario() {
        int left = -5;
        int right = 6;
        int expected = -11;

        int actual = calculator.subtraction(left, right);
        if(expected == actual) {
            testPassed("testSubtractionThirdScenario");
        } else {
            testFailed(left, right, expected, actual);
        }
    }


    private void testPassed(String message) {
        System.out.println("\u001B[32m  "+ message +" passed successfully \u001B[0m");
    }

    private void testFailed(int left, int right, int expected, int actual) {
        throw new RuntimeException("" +
                "\n\ttest failed: " +
                "\nfor left \t"+left+" " +
                "\nand right \t"+right+" " +
                "\nexpected \t"+expected+" " +
                "\nbut got \t"+actual);
    }
}
