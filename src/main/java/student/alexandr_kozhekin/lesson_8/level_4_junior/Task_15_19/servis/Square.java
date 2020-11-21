package student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis;

public class Square extends Shape {

    //Task_17
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
