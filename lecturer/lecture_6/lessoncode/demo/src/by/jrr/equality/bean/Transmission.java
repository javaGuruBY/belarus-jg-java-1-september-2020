package by.jrr.equality.bean;

import java.util.Objects;

public class Transmission {
    private String type;
    private String make;

    public Transmission() {
    }

    public Transmission(String type, String make) {
        this.type = type;
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transmission that = (Transmission) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(make, that.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, make);
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type='" + type + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
