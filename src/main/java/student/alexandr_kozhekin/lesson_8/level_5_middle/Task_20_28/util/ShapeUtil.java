package student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.util;

import student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.servis.*;
import java.util.Random;

public class ShapeUtil {

    //Task_20
    public Circle createRandomCircle(){

        double radiusRandom = Math.random() * 100;

        return new Circle("Circle", radiusRandom);

    }

    //Task_21
    public Square createRandomSquare(){

        double sideLengthRandom = Math.random() * 100;

        return new Square("Square", sideLengthRandom);

    }

    //Task_22
    public Rectangle createRandomRectangle(){

        double shortSideLengthRandom = Math.random() * 100;
        double longSideLengthRandom = Math.random() * 100;

        return new Rectangle("Rectangle", shortSideLengthRandom, longSideLengthRandom);

    }

    //Task_23
    public Triangle createRandomTriangle(){

        double lengthRandom = Math.random() * 100;

        return new Triangle("Triangle", lengthRandom, lengthRandom, lengthRandom, lengthRandom, lengthRandom);

    }

    //Task_24
   public Shape createRandomShape() {

        Random randomShape = new Random();

       int randomNumber = randomShape.nextInt(4);

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

   //Task_25
   public double calculateArea(Shape[] shapes) {

       double totalAreaFigures = 0;

       for (int i = 0; i < shapes.length; i++) {

           totalAreaFigures += calculateArea(shapes[i]);

       }

       return totalAreaFigures;

    }

    //Task_26
    public double calculatePerimeter(Shape[] shapes) {

        double totalPerimeterFigures = 0;

        for (int i = 0; i < shapes.length; i++) {

            totalPerimeterFigures += calculatePerimeter(shapes[i]);

        }

        return totalPerimeterFigures;

    }

    //Task_27
    public double calculateArea(Shape shape) {
       
        return shape.calculateArea();
    
    }

    //Task_27
    public double calculatePerimeter(Shape shape) {
    
        return shape.calculatePerimeter();
    
    }
}
