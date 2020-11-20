package student.igor_kavalevski.lesson_8.level_4.Task_15_19;

public class RectangleTest {
    public static void main(String[] args) {

        RectangleTest test = new RectangleTest();
        test.test1();
        test.test2();
    }

    private void test1() {
        Rectangle rectangle = new Rectangle(3, 4, "ok");
        double expected = 12;
        double actual = rectangle.calculateArea();
        checkThatEquals(expected, actual);
    }

    private void test2() {

        Rectangle rectangle = new Rectangle(3, 4, "ok");

        double expected = 14;
        double actual = rectangle.calculatePerimeter();
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
