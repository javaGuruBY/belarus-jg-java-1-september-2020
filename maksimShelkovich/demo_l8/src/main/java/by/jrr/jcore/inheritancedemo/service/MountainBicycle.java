package by.jrr.jcore.inheritancedemo.service;

import by.jrr.jcore.inheritancedemo.beans.Bicycle;

public class MountainBicycle extends Bicycle {

    protected int gear;

    public MountainBicycle(String brand, int speed, int gear) {
        super(brand, speed);
        this.gear = gear;
    }

    @Override
    public void accelerate() {
        super.accelerate(); // highly unlikely to spot
        this.speed = this.speed + 3;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        super.accelerate();
        return "MountainBicycle{" +
                "gear=" + gear +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}' + super.toString(); //sometimes occurs
    }
}
