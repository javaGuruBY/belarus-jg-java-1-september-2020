package level2_3;

public class Rectangle extends Shape{

    private double length;
    private double height;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(String title, double length, double height) {
        super(title);
        this.length = length;
        this.height = height;
    }

    public double calculateArea() {
        return getHeight() * getLength();
    }

    public double calculatePerimeter() {
        return 2 * (getHeight()+getLength());
    }


}
