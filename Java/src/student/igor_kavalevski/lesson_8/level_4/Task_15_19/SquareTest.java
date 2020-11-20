package student.igor_kavalevski.lesson_8.level_4.Task_15_19;

public class SquareTest {

    public static void main(String[] args) {

        SquareTest test = new SquareTest();
        test.test1();
        test.test2();
    }

    private void test1() {
        Square square = new Square(3, "ok");
        double expected = 12;
        double actual = square.calculateArea();
        checkThatEquals(expected, actual);
    }

    private void test2() {

        Square square = new Square(3, "ok");

        double expected = 12;
        double actual = square.calculatePerimeter();
        checkThatEquals(expected, actual);
    }

    public void checkThatEquals(double expected, double actual) {

        if (expected == actual) {
            System.out.println(" TEST OK ");
        } else {
            System.out.println("TEST failed");
        }
    }
}
