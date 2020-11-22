package student.igor_kavalevski.lesson_8.level_4.Task_15_19;

public class Circle extends Shape {

    double radius;

    Circle(double radius, String title) {
        super(title);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * (radius * radius);
    }


    double calculatePerimeter() {
        return Math.PI * (radius + radius);
    }
}

