package level2_3;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

   public abstract double calculateArea();

   public abstract double calculatePerimeter();
}

