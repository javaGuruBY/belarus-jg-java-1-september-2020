package shape;

public class Triangle extends Shape {

    private double height;
    private double length;
    private double a;
    private double b;
    private double c;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }


    public Triangle(String title, double height, double length, double a, double b, double c) {
        super(title);
        this.height = height;
        this.length = length;
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public double calculateArea() {
        return 0.5 * getHeight() * getLength();
    }

    public double calculatePerimeter() {
        return getA() + getB() + getC();
    }
}
