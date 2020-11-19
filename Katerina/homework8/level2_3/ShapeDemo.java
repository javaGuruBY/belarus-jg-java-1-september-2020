package level2_3;

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 10);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}
