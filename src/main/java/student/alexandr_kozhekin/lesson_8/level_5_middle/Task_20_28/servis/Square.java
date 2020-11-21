package student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.servis;

public class Square extends Shape {

    private double sideLength;

    public Square(String title, double sideLength){

        super(title);
        this.sideLength = sideLength;

    }

    @Override
    public double calculateArea() {

        return sideLength * sideLength;

    }

    @Override
    public double calculatePerimeter() {

        return sideLength + sideLength + sideLength + sideLength;

    }
}
