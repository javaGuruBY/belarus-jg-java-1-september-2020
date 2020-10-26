package student_katerin.lesson4.task11;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.test1();
        calculatorTest.test2();
        calculatorTest.test3();
        calculatorTest.test4();
        calculatorTest.test5();
        calculatorTest.test6();
        calculatorTest.test7();
    }

    public void test1() {
        int firstNumber = 15;
        int secondNumber = 20;

        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(firstNumber, secondNumber);

        if (actualResult == 35) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        int firstNumber = 10;
        int secondNumber = 5;

        Calculator calculator = new Calculator();
        int actualResult = calculator.difference(firstNumber, secondNumber);

        if (actualResult == 5) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        int firstNumber = -5;
        int secondNumber = -3;

        Calculator calculator = new Calculator();
        int actualResult = calculator.composition(firstNumber, secondNumber);

        if (actualResult == 15) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    public void test4() {
        int firstNumber = 16;
        int secondNumber = 4;

        Calculator calculator = new Calculator();
        double actualResult = calculator.division(firstNumber, secondNumber);

        if (actualResult == 4) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }

    public void test5() {
        int firstNumber = 16;
        int secondNumber = 4;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (actualResult == firstNumber) {
            System.out.println("TEST 5 = OK");
        } else {
            System.out.println("TEST 5 = FAIL");
        }
    }

    public void test6() {
        int firstNumber = -10;
        int secondNumber = 4;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (actualResult == secondNumber) {
            System.out.println("TEST 6 = OK");
        } else {
            System.out.println("TEST 6 = FAIL");
        }
    }

    public void test7() {
        int firstNumber = 3;
        int secondNumber = 3;

        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (actualResult == 0) {
            System.out.println("TEST 7 = OK");
        } else {
            System.out.println("TEST 7 = FAIL");
        }
    }
}
