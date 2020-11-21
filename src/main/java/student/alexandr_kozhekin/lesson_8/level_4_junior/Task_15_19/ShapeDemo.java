package student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19;

import student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis.Circle;
import student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis.Rectangle;
import student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis.Square;
import student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis.Triangle;

public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", 10);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        Square square = new Square("Square", 7);
        System.out.println("\n" + square.calculateArea());
        System.out.println(square.calculatePerimeter());

        Rectangle rectangle = new Rectangle("Rectangle", 3, 5);
        System.out.println("\n" + rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Triangle triangle = new Triangle("Triangle", 5, 10, 10, 10, 10);
        System.out.println("\n" + triangle.calculateArea());
        System.out.println(triangle.calculatePerimeter());

    }
}
