package student.alexandr_kozhekin.lesson_8.level_4_junior.Task_15_19.servis;

abstract class Shape {

    private String title;

    public Shape(String title) {

        this.title = title;

    }

    public String getTitle() {

        return title;

    }

    abstract double calculateArea();
    //Task_15
    abstract double calculatePerimeter();

}
