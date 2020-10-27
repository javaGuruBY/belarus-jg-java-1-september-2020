package student.igor_kavalevski.lesson_4.lecture_4.level_4.Task_11;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest testRunner = new CalculatorTest();
        testRunner.sumtest();
        testRunner.subtractionTest();
        testRunner.multiplicationTest();
        testRunner.divisionTest();
        testRunner.maxOfThreeNumbers();
    }

    public void sumtest() {
        int firstNumbers = 10;
        int secondNumbers = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumbers, secondNumbers);
        checkThatEqual(expectedResult, realResult);
    }

    public void subtractionTest() {
        int firstNumbers = 10;
        int secondNumbers = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtraction(firstNumbers, secondNumbers);
        checkThatEqual(expectedResult, realResult);
    }

    public void divisionTest() {
        int firstNumbers = 10;
        int secondNumbers = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumbers, secondNumbers);
        checkThatEqual(expectedResult, realResult);
    }

    public void multiplicationTest() {
        int firstNumbers = 10;
        int secondNumbers = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumbers, secondNumbers);
        checkThatEqual(expectedResult, realResult);
    }

    public void maxOfThreeNumbers() {
        int a = 6;
        int b = 7;
        int c = 8;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        checkThatEqual(expectedResult, realResult);
    }

    public void checkThatEqual(int expectedResult, int realResult) {
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
}

