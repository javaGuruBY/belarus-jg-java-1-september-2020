package by.jrr.jcore.abstractiondemo.bean.abstraction;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return (width * height)/2;
    }
}
