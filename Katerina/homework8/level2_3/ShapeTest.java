package level2_3;

public class ShapeTest {
    public static void main(String[] args) {
        ShapeTest shapeTest = new ShapeTest();
        shapeTest.testAreaCircle();
        shapeTest.testPerimeterCircle();
        shapeTest.testAreaRectangle();
        shapeTest.testPerimeterRectangle();
        shapeTest.testAreaTriangle();
        shapeTest.testPerimeterTriangle();
    }

    public void testAreaCircle() {
        Circle circle = new Circle("Circle", 10);
        double expected = 314;
        double actual = circle.calculateArea();
        messageText(expected, actual, "testAreaCircle");
    }

    public void testPerimeterCircle() {
        Circle circle = new Circle("Circle", 1);
        double expected = 6.28;
        double actual = circle.calculatePerimeter();
        messageText(expected, actual, "testAreaCircle");
    }

    public void testAreaRectangle(){
        Rectangle rectangle=new Rectangle("Rectangle",10,6);
        double expected = 60;
        double actual = rectangle.calculateArea();
        messageText(expected, actual, "testAreaRectangle");
    }

    public void testPerimeterRectangle(){
        Rectangle rectangle=new Rectangle("Rectangle",10,6);
        double expected = 32;
        double actual = rectangle.calculatePerimeter();
        messageText(expected, actual, "testPerimeterRectangle");
    }

    public void testAreaTriangle(){
        Triangle triangle=new Triangle("Triangle",3,4,1,2,3);
        double expected = 6;
        double actual = triangle.calculateArea();
        messageText(expected,actual,"testAreaTriangle");
    }

    public void testPerimeterTriangle(){
        Triangle triangle=new Triangle("Triangle",3,4,1,2,3);
        double expected = 6;
        double actual = triangle.calculatePerimeter();
        messageText(expected,actual,"testPerimeterTriangle");
    }

    public void messageText(double expected, double actual, String nameOfTest) {
        if (actual == expected) System.out.println(nameOfTest + " is OK");
        else System.out.println(nameOfTest + " is NOT OK");
    }
}
