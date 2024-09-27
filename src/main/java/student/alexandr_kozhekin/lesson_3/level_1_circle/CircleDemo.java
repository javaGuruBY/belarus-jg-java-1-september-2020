package student.alexandr_kozhekin.lesson_3.level_1_circle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Circle circle1 = new Circle(5.5);
        System.out.println(circle.calculateAreaCircle());
        System.out.println(circle1.calculateAreaCircle());

    }
}
