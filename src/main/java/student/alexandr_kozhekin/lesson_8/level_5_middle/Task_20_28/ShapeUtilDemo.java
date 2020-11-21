package student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28;

import student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.servis.Shape;
import student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.util.ShapeUtil;

//Task_27
public class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        Shape rectangle = shapeUtil.createRandomRectangle();
        Shape square = shapeUtil.createRandomSquare();
        Shape triangle = shapeUtil.createRandomTriangle();
        Shape randomShape = shapeUtil.createRandomShape();

        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        double randomShapeArea = shapeUtil.calculateArea(randomShape);
        double randomShapePerimeter = shapeUtil.calculatePerimeter(randomShape);

        System.out.println(circle.getTitle() + " - " + circleArea + " | " + circlePerimeter);
        System.out.println(rectangle.getTitle() + " - " + rectangleArea + " | "  + rectanglePerimeter);
        System.out.println(square.getTitle() + " - " + squareArea + " | "  + squarePerimeter);
        System.out.println(triangle.getTitle() + " - " + triangleArea + " | "  + trianglePerimeter);
        System.out.println(randomShape.getTitle() + " - " + randomShapeArea + " | "  + randomShapePerimeter);

    }
}
