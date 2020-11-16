package by.jrr.equality.bean;

import java.util.Objects;

public class CarDetailed {

    private String name;
    private String engine;
    private String color;
    private Transmission transmission;

    public CarDetailed() {
    }

    public CarDetailed(String name, String engine, String color, Transmission transmission) {
        this.name = name;
        this.engine = engine;
        this.color = color;
        this.transmission = transmission;
    }

    public CarDetailed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDetailed that = (CarDetailed) o;
        return Objects.equals(name, that.name) &&
                        Objects.equals(engine, that.engine) &&
                        Objects.equals(transmission, that.transmission) &&
                        Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, engine, color, transmission);
    }

    @Override
    public String toString() {
        return "CarDetailed{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", transmission=" + transmission +
                '}';
    }
}
