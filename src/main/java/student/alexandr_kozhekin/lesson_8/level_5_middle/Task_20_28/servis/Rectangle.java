package student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.servis;

public class Rectangle extends Shape {

    private double shortSideLength;
    private double longSideLength;

    public Rectangle(String title, double shortSideLength, double longSideLength){

        super(title);
        this.shortSideLength = shortSideLength;
        this.longSideLength = longSideLength;

    }

    @Override
    public double calculateArea() {

        return shortSideLength * longSideLength;

    }

    @Override
    public double calculatePerimeter() {

        return 2 * (shortSideLength + longSideLength);

    }
}
