package student.igor_kavalevski.lesson_8.level_4.Task_20_28;

import student.igor_kavalevski.lesson_8.level_4.Task_15_19.*;

import java.util.Random;

public class ShapeUtil {

    Circle createRandomCircle() {
        return new Circle(Math.random(), "radius");
    }

    Square createRandomSquare() {
        return new Square(Math.random(), "square");
    }

    Rectangle createRandomRectangle() {
        return new Rectangle(Math.random(), Math.random(), "rectangle");
    }

    Triangle createRandomTriangle() {
        return new Triangle(Math.random(), Math.random(), "triangle");
    }

    public Shape createRandomShape() {

        Random rand = new Random();

        int randomNumber = rand.nextInt(4);

        if (randomNumber == 0) {
            return createRandomCircle();

        } else if (randomNumber == 1) {
            return createRandomSquare();

        } else if (randomNumber == 2) {
            return createRandomRectangle();

        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double area = 0;

        for (Shape shape : shapes) {
            area += calculateArea(shape);
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;

        for (Shape shape : shapes) {
            perimeter += calculatePerimeter(shape);
        }
        return perimeter;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
