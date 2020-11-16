package by.jrr.jcore.abstractiondemo.bean.abstraction;

public class Circle extends Shape{

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {
        return 3.14 * 2 * radius;
    }
}
