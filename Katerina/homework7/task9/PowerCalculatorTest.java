package task9;

public class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest calculator = new PowerCalculatorTest();
        calculator.test1();
        calculator.test2();
        calculator.test3();
        calculator.test4();
    }

    public void resultOfTest(int expected, double actual, String nameOfTest) {
        if (expected == actual) System.out.println(nameOfTest + ":is OK!");
        else System.out.println(nameOfTest + ":is NOT OK!");
    }

    public void test1() {
        PowerCalculator calculator = new PowerCalculator();
        int number = 6, power = 2;
        int expected = 36;
        double actual = (int) calculator.power(number, power);
        resultOfTest(expected, actual, "Test1");
    }

    public void test2() {
        PowerCalculator calculator = new PowerCalculator();
        int number = 0, power = 2;
        int expected = 0;
        double actual = (int) calculator.power(number, power);
        resultOfTest(expected, actual, "Test2");
    }

    public void test3() {
        PowerCalculator calculator = new PowerCalculator();
        int number = 15, power = 0;
        int expected = 1;
        double actual = (int) calculator.power(number, power);
        resultOfTest(expected, actual, "Test3");
    }

    public void test4() {
        PowerCalculator calculator = new PowerCalculator();
        int number = -15, power = 2;
        int expected = 225;
        double actual = (int) calculator.power(number, power);
        resultOfTest(expected, actual, "Test4");
    }

}
