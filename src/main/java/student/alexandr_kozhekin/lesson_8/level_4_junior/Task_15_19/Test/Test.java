package student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.Test;

import student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis.Circle;
import student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis.Rectangle;
import student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis.Square;
import student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis.Triangle;

//Task_16
public class Test {

    public static void main(String[] args) {

        Test test = new Test();

        test.circleTest1();
        test.circleTest2();
        test.rectangleTest1();
        test.rectangleTest2();
        test.squareTest1();
        test.squareTest2();
        test.triangleTest1();
        test.triangleTest2();

    }

    public void circleTest1 () {

        Circle circle = new Circle("Circle", 10);

        double result = circle.calculateArea();
        double expected = 314.1592653589793;

        if (expected == result){

            System.out.println(circle.getTitle() + " TEST COMPLETED");

        } else {

            testFailed(expected, result);

        }
    }

    public void circleTest2 () {

        Circle circle = new Circle("Circle", 10);

        double result = circle.calculatePerimeter();
        double expected = 62.83185307179586;

        if (expected == result){

            System.out.println(circle.getTitle() + " TEST COMPLETED");

        } else {

            testFailed(expected, result);

        }
    }

    public void rectangleTest1 () {

        Rectangle rectangle = new Rectangle("Rectangle",3,  5);

        double result = rectangle.calculateArea();
        double expected = 15.0;

        if (expected == result){

            System.out.println(rectangle.getTitle() + " TEST COMPLETED");

        } else {

            testFailed(expected, result);

        }
    }

    public void rectangleTest2 () {

        Rectangle rectangle = new Rectangle("Rectangle",3,  5);

        double result = rectangle.calculatePerimeter();
        double expected = 16.0;

        if (expected == result){

            System.out.println(rectangle.getTitle() + " TEST COMPLETED");


        } else {

            testFailed(expected, result);

        }
    }

    public void squareTest1 () {

        Square square = new Square("Square", 7);

        double result = square.calculateArea();
        double expected = 49.0;

        if (expected == result){

            System.out.println(square.getTitle() + " TEST COMPLETED");

        } else {

            testFailed(expected, result);

        }
    }

    public void squareTest2 () {

        Square square = new Square("Square", 7);

        double result = square.calculatePerimeter();
        double expected = 28.0;

        if (expected == result){

            System.out.println(square.getTitle() + " TEST COMPLETED");

        } else {

            testFailed(expected, result);

        }
    }

    public void triangleTest1 () {

        Triangle triangle = new Triangle("Triangle", 5, 10, 10, 10, 10);

        double result = triangle.calculateArea();
        double expected = 50.0;

        if (expected == result){

            System.out.println(triangle.getTitle() + " TEST COMPLETED");

        } else {

            testFailed(expected, result);

        }
    }

    public void triangleTest2 () {

        Triangle triangle = new Triangle("Triangle", 5, 10, 10, 10, 10);

        double result = triangle.calculatePerimeter();
        double expected = 25.0;

        if (expected == result){

            System.out.println(triangle.getTitle() + " TEST COMPLETED");

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
