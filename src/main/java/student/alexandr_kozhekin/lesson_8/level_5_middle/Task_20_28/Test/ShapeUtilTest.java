package student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.Test;

import student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.servis.*;
import student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.util.ShapeUtil;

//Task_28
public class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtilTest shapeTest = new ShapeUtilTest();

        shapeTest.testCalculateArea();
        shapeTest.testCalculatePerimeter();

    }

    public void testCalculateArea() {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("circle", 10);
        shapes[1] = new Rectangle("rect", 10, 5);
        shapes[2] = new Square("square", 10);
        shapes[3] = new Triangle("triangle", 10, 10, 10,
                10, 10);

        double result = shapeUtil.calculateArea(shapes);
        double expected = 514.1592653589794;

        if (expected == result){

            System.out.println("TEST OK");

        } else {

            testFailed(expected, result);

        }
    }

    public void testCalculatePerimeter() {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("circle", 10);
        shapes[1] = new Rectangle("rect", 10, 5);
        shapes[2] = new Square("square", 10);
        shapes[3] = new Triangle("triangle", 10, 10, 10,
                10, 10);

        double result = shapeUtil.calculatePerimeter(shapes);
        double expected = 162.83185307179588;

        if (expected == result) {

            System.out.println("TEST OK");

        } else {

            testFailed(expected, result);

        }
    }

    private void testFailed(double expected, double result) {

        throw new RuntimeException("" +
                "\n\ttest failed: " +
                "\nexpected \t" + expected + " " +
                "\nbut got \t" + result);

    }
}
