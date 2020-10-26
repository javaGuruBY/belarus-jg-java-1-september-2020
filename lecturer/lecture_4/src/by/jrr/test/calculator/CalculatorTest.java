package by.jrr.test.calculator;

import by.jrr.calculator.service.Calculator;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    public void run() {
//        testSumming();
//        testSubtractionFirstScenario();
//        testSubtractionSecondScenario();
//        testSubtractionThirdScenario();
        maxShouldReturnFirst();
        maxShouldReturnSecond();
        maxShouldReturnThird();
        maxShouldReturnFirstOrSecond();
        maxShouldReturnAny();


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

    public void maxShouldReturnFirst() {
        int a = 7, b = 6, c = 5;
        int expected = 7;

        int actual = calculator.max(a, b, c);
        if(expected == actual) {
            testPassed("maxShouldReturnFirst");
        } else {
            testFailedForMaxOfThree(a, b, c, expected, actual);
        }
    }

    public void maxShouldReturnThird() {
        int a = 5, b = 6, c = 7;
        int expected = 7;

        int actual = calculator.max(a, b, c);
        if(expected == actual) {
            testPassed("maxShouldReturnThird");
        } else {
            testFailedForMaxOfThree(a, b, c, expected, actual);
        }
    }

    public void maxShouldReturnFirstOrSecond() {
        int a = 7, b = 7, c = 5;
        int expected = 7;

        int actual = calculator.max(a, b, c);
        if(expected == actual) {
            testPassed("maxShouldReturnFirstOrSecond");
        } else {
            testFailedForMaxOfThree(a, b, c, expected, actual);
        }
    }

    public void maxShouldReturnAny() {
        int a = 7, b = 7, c = 7;
        int expected = 7;

        int actual = calculator.max(a, b, c);
        if(expected == actual) {
            testPassed("maxShouldReturnAny");
        } else {
            testFailedForMaxOfThree(a, b, c, expected, actual);
        }
    }

    public void maxShouldReturnSecond() {
        int a = 6, b = 7, c = 5;
        int expected = 7;

        int actual = calculator.max(a, b, c);
        if(expected == actual) {
            testPassed("maxShouldReturnSecond");
        } else {
            testFailedForMaxOfThree(a, b, c, expected, actual);
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

    private void testFailedForMaxOfThree(int a, int b, int c, int expected, int actual) {
        throw new RuntimeException("" +
                "\n\ttest failed: " +
                "\nfor a \t"+a+" " +
                "\nand b \t"+b+" " +
                "\nand c \t"+c+" " +
                "\nexpected \t"+expected+" " +
                "\nbut got \t"+actual);
    }
}
