package shape;

import java.util.Random;

public class ShapeUtil {

    public Circle createRandomCircle() {
        return new Circle("circle", Math.random());
    }

    public Rectangle createRandomRectangle() {
        return new Rectangle("rectungle", Math.random(), Math.random());
    }

    public Triangle createRandomTriangle() {
        return new Triangle("triangle", Math.random(),
                Math.random(), Math.random(), Math.random(), Math.random());
    }

    public Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomTriangle();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    public double calculateArea(Shape[] shapes) {
        double area = 0;
        for (int i = 0; i < shapes.length; i++) {
            area += calculateArea(shapes[i]);
        }
        return area;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            perimeter += calculatePerimeter(shapes[i]);
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
