package student.igor_kavalevski.lesson_8.level_4.Task_15_19;

public class Rectangle extends Shape {

    double width;
    double height;

    Rectangle(double width, double height, String title) {
        super("ok");
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return (width + height) * 2;
    }
}
