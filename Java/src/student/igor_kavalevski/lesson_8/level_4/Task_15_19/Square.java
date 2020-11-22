package student.igor_kavalevski.lesson_8.level_4.Task_15_19;

public class Square extends Shape {

    double side;

    Square(double side, String title) {
        super(title);
        this.side = side;
    }

    double calculateArea() {
        return (side + side) * 2;
    }


    double calculatePerimeter() {
        return (side + side) * 2;
    }
}
