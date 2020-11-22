package student.igor_kavalevski.lesson_8.level_4.Task_20_28;

import student.igor_kavalevski.lesson_8.level_4.Task_15_19.*;

public class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtilTest shapeTest = new ShapeUtilTest();
        shapeTest.test1();
        shapeTest.test2();
    }

    public void test1() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = new Circle(3, "circle");
        shape[1] = new Rectangle(4, 3, "rectangle");
        shape[2] = new Triangle(4, 2, "triangle");
        shape[3] = new Square(7, "square");

        double expected = 80.27433388230814;
        double actual = shapeUtil.calculateArea(shape);
        checkThatEquals(expected, actual);
    }

    public void test2() {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = new Circle(3, "circle");
        shape[1] = new Rectangle(4, 3, "rectangle");
        shape[2] = new Triangle(4, 2, "triangle");
        shape[3] = new Square(7, "square");

        double expected = 64.84955592153875;
        double actual = shapeUtil.calculatePerimeter(shape);
        checkThatEquals(expected, actual);
    }

    void checkThatEquals(double expected, double actual) {

        if (expected == actual) {
            System.out.println("TEST PASSED");

        } else {
            System.out.println("TEST FAILED" +
                    System.lineSeparator() + " Actual: " + actual +
                    System.lineSeparator() + " Expected: " + expected);
        }
    }
}
