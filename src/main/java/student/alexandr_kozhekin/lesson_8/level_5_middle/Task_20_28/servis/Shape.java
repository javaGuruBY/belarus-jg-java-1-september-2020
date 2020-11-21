package student.alexandr_kozhekin.lesson_8.level_5_middle.Task_20_28.servis;

public abstract class Shape {

    private String title;

    public Shape(String title) {

        this.title = title;

    }

    public String getTitle() {

        return title;

    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

}
