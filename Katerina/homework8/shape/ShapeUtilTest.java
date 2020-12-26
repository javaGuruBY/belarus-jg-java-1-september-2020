package shape;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest shapeTest = new ShapeUtilTest();
        shapeTest.testCalculateArea();
        shapeTest.testCalculatePerimeter();
    }

    public void testCalculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("circle", 10);
        shapes[1] = new Rectangle("rect", 10, 5);
        double actual = shapeUtil.calculateArea(shapes);
        double expected = 364;
        messageText(expected, actual, "testCalculateArea");
    }

    public void testCalculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("circle", 100);
        shapes[1] = new Rectangle("rect", 10, 5);
        double actual = shapeUtil.calculatePerimeter(shapes);
        double expected = 628 + 30;
        messageText(expected, actual, "testCalculatePerimeter");
    }

    public void messageText(double expected, double actual, String nameOfTest) {
        if (actual == expected) System.out.println(nameOfTest + " is OK");
        else System.out.println(nameOfTest + " is NOT OK");
    }
}
