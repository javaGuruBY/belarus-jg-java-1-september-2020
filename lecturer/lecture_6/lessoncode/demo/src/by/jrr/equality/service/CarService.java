package by.jrr.equality.service;

import by.jrr.equality.bean.Car;
import by.jrr.equality.bean.CarDetailed;
import by.jrr.equality.bean.Transmission;

public class CarService {


    public static void compareLinks() {
        Car car1 = new Car("BMW");
        Car car2 = car1;
        Car car3 = new Car("BMW");

        System.out.println("(car1 == car2) = " + (car1 == car2));
        System.out.println("(car2 == car3) = " + (car2 == car3));
        System.out.println("(car3 == car1) = " + (car3 == car1));

    }

    public static void compareObjects() {
        Car car1 = new Car("BMW");
        Car car2 = car1;
        Car car3 = new Car("BMW");

        System.out.println("(car1 equals car2) = " + (car1.equals(car2)));
        System.out.println("(car2 equals car3) = " + (car2.equals(car3)));
        System.out.println("(car3 equals car1) = " + (car3.equals(car1)));
    }

    public static void compareObjectsWithEquall() {
        CarDetailed car1 = new CarDetailed("Mersedes", "gasoline", "blue", new Transmission("auto", "BMW"));
        CarDetailed car2 = car1;
        CarDetailed car3 = new CarDetailed("Mersedes", "gasoline", "blue", new Transmission("auto", "BMW"));

        car3.getTransmission().setMake("Mersedes");
        car2.getTransmission().setMake("Toyota");
        car1.getTransmission().setMake("Daihatsy");

        System.out.println("(car1 equals car2) = " + (car1.equals(car2)));
        System.out.println("(car2 equals car3) = " + (car2.equals(car3)));
        System.out.println("(car3 equals car1) = " + (car3.equals(car1)));

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);


    }
}
