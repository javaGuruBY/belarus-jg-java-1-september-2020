package student.katerin.lesson4.task11;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.test1();
        calculatorTest.test2();
        calculatorTest.test3();
        calculatorTest.test4();
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
}
