package student.igor_kavalevski.lesson_3.exemple_1;

import java.util.Scanner;

public class LampDemo {
    public static void main(String[] args) {

        Lamp LampOne = new Lamp();
        Lamp LampTwo = new Lamp();

        System.out.println("LampOne.isOn = " +LampOne.isOn);
        System.out.println("LampTwo.isOn = " +LampTwo.isOn);

        System.out.println("Turning on LampOne");
        LampOne.turnOn();

        System.out.println("LampOne.isOn = " +LampOne.isOn);
        System.out.println("LampTwo.isOn = " +LampTwo.isOn);

        System.out.println("Turning on LampTwo");
        LampTwo.turnOn();

        System.out.println("LampOne.isOn = " +LampOne.isOn);
        System.out.println("LampTwo.isOn = "+LampTwo.isOn);

    }
}
