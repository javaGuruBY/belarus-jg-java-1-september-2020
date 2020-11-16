package by.jrr.jcore.inheritancedemo.service;

import by.jrr.jcore.inheritancedemo.beans.Bicycle;

public class BicycleService {

    public void baseSyntaxDemo() {
        Bicycle bicycle = new Bicycle("starX", 10);
        bicycle.accelerate();


        MountainBicycle mountainBicycle = new MountainBicycle("Aist", 120, 5);
        mountainBicycle.accelerate();

        System.out.println(mountainBicycle);
    }
}
