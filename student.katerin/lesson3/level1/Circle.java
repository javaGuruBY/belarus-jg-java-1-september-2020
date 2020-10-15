package level1;

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

class CircleDemo {
    public static void main(String[] args) {

        Circle firstCircle = new Circle(4.1435);
        firstCircle.calculateArea();

    }
}
