package homework.java.student.vladislav.lesson_7.level_5_1;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest calculator = new PowerCalculatorTest();
        calculator.test1();
        calculator.test2();
        calculator.test3();
        calculator.test4();
    }

    PowerCalculator calculator = new PowerCalculator();

    public void resultTest (int expected, int actual, String nameTest) {
        if (expected == actual) System.out.println("Test OK");
        else System.out.println("Test Failed");

    }

        public void test1() {
        int number = 4;
        int power = 2;
        int expected = 16;
        int actual = (int) calculator.power(number, power);
        resultTest(expected,  actual, "Test 1");
        }

        public void test2() {
        int a = 0;
        int power = 2;
        int expected = 0;
        int actual = (int) calculator.power(a, power);
        resultTest(expected, actual, "Test 2");
        }

        public void test3() {
            int a = -2;
            int power = 2;
            int expected = 4;
            int actual = (int) calculator.power(a, power);
            resultTest(expected, actual, "Test 3");
        }
        public void test4() {
        int a = 4;
        int power = 0;
        int expected = 1;
        int actual = (int) calculator.power(a, power);
        resultTest(expected, actual, "Test 4");
    }
}
