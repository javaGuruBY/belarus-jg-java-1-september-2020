package level1;

import java.util.Scanner;

public class Circle {
    public double radius;

    double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of circle is " + area);
        return area;
    }

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }
}


