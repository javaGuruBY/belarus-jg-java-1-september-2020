package by.jrr.jcore.polymorphism;

import by.jrr.jcore.abstractiondemo.bean.abstraction.Circle;
import by.jrr.jcore.abstractiondemo.bean.abstraction.Rectangle;
import by.jrr.jcore.abstractiondemo.bean.abstraction.Shape;
import by.jrr.jcore.abstractiondemo.bean.interfaces.BritneySpears;
import by.jrr.jcore.abstractiondemo.bean.interfaces.ElvisPresley;
import by.jrr.jcore.abstractiondemo.bean.interfaces.MichaelJackson;
import by.jrr.jcore.abstractiondemo.bean.interfaces.Singer;

public class MagicService {

    public void singSongs() {
        Singer elvis = new ElvisPresley();
        Singer jackson = new MichaelJackson();
        Singer spears = new BritneySpears();

        elvis.sign();
        jackson.sign();
        spears.sign();

        elvis.stayOnTheEarth();
        jackson.stayOnTheEarth();
        spears.stayOnTheEarth();

        Singer[] singers = {elvis, jackson, spears};
    }

    public void calculateShapes() {
        Shape circle = new Circle("Red", 3);
        Shape rectangle = new Rectangle("Blue", 2, 4);
        System.out.println("Circle area = " + circle.area());
        System.out.println("Rectangle area = " + rectangle.area());
    }
}
