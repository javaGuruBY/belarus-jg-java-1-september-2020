package student.igor_kavalevski.lesson_8.level_4.Task_15_19;

public class Triangle extends Shape {

    double height;
    double founding;


    Triangle(double height,double founding, String title){
        super("ok");
        this.height = height;
        this.founding = founding;

    }

    public double calculateArea() {
        return height * 3;
    }

    public double calculatePerimeter(){
        return (height* founding)/2;
    }

}
