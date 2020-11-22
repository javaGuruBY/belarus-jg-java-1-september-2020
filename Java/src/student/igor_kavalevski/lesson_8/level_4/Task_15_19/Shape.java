package student.igor_kavalevski.lesson_8.level_4.Task_15_19;

abstract class Shape {

    String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
