package student.alexandr_kozhekin.lesson_3.level_1_circle;
/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства:
    Радиус (double radius)
Методы:
    Расчет площади (double calculateArea())
 */

public class Circle {
    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double calculateAreaCircle(){
        return Math.PI * circleRadius * circleRadius;
    }
}
