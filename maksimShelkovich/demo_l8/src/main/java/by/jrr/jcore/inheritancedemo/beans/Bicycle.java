package by.jrr.jcore.inheritancedemo.beans;

public class Bicycle {

    protected String brand;
    protected int speed;
    private String privateValue = "I'm private field";

    public Bicycle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate() {
        this.speed++;
    }

    public void decelerate() {
        this.speed--;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", privateValue=" + privateValue +
                '}';
    }
}
