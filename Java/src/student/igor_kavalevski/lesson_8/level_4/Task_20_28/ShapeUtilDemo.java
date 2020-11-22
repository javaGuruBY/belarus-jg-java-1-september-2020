package student.igor_kavalevski.lesson_8.level_4.Task_20_28;

import student.igor_kavalevski.lesson_8.level_4.Task_15_19.Shape;

public class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        Shape triangle = shapeUtil.createRandomTriangle();
        Shape rectangle = shapeUtil.createRandomTriangle();
        Shape square = shapeUtil.createRandomSquare();


        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);

        System.out.println(" Circle area : " + circleArea +
                System.lineSeparator() + " Circle perimeter : " + circlePerimeter +
                System.lineSeparator() + " Triangle area : " + triangleArea +
                System.lineSeparator() + " Triangle perimeter : " + trianglePerimeter +
                System.lineSeparator() + " Rectangle area : " + rectangleArea +
                System.lineSeparator() + " Rectangle perimeter : " + rectanglePerimeter +
                System.lineSeparator() + " Square area : " + squareArea +
                System.lineSeparator() + " Square perimeter : " + squarePerimeter);
    }
}