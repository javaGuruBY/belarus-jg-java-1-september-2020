package student.igor_kavalevski.lesson_3.level_1;

public class CircleDemo {
    public static void main(String[] args) {
    Circle circle = new Circle();
    circle.radius = 4;
    double area  = circle.calculateArea();

    System.out.println(" radius " +circle.radius+" = " +area);

    }
}
