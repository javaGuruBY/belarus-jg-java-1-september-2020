package student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.servis;

public class Triangle extends Shape {

    private double sideFirstLength;
    private double sideSecondLength;
    private double sideThirdLength;
    private double height;
    private double length;

    public Triangle(String title, double sideFirstLength, double sideSecondLength,
                    double sideThirdLength, double height, double length){

        super(title);
        this.sideFirstLength = sideFirstLength;
        this.sideSecondLength = sideSecondLength;
        this.sideThirdLength = sideThirdLength;
        this.height = height;
        this.length = length;

    }

    @Override
    public double calculateArea() {

        return 0.5 * (height * length);

    }

    @Override
    public double calculatePerimeter() {

        return sideFirstLength + sideSecondLength + sideThirdLength;

    }
}
