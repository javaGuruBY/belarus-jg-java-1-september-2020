package student.igor_kavalevski.lesson_8.level_4.Task_15_19;

public class CircleTest {

    public static void main(String[] args) {

        CircleTest test = new CircleTest();
        test.test1();
        test.test2();

    }

    private void test1() {
        Circle circle = new Circle(3, "ok");
        double expected = 28.274333882308138;
        double actual = circle.calculateArea();
        checkThatEquals(expected, actual);


    }

    private void test2() {


        Circle circle = new Circle(3, "ok");

        double expected = 18.849552;
        double actual = circle.calculatePerimeter();
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


