package level2_3;

class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * getRadius() * getRadius();
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * getRadius();
    }

}
