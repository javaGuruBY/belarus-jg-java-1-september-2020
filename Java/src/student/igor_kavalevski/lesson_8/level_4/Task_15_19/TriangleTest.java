package student.igor_kavalevski.lesson_8.level_4.Task_15_19;

public class TriangleTest {

    public static void main(String[] args) {

        TriangleTest test = new TriangleTest();
        test.test1();
        test.test2();
    }

    private void test1() {
        Triangle triangle = new Triangle(3, 4, "ok");
        double expected = 9;
        double actual = triangle.calculateArea();
        checkThatEquals(expected, actual);
    }

    private void test2() {

        Triangle triangle = new Triangle(3, 4, "ok");

        double expected = 6;
        double actual = triangle.calculatePerimeter();
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
