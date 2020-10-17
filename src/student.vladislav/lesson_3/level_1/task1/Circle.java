package task1;
import java.util.Scanner;
public class Circle {
    public double radius;

    double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circles " + area);
        return area;
    }

    Circle(double radius)
    {
        this.radius = radius;
    }
}
