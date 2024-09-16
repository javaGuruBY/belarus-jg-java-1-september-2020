package lesson3.Example2;

public class Lamp {
    public boolean isOn;

    Lamp(){
        isOn=true;
    }

    public void turnOn() {
        this.isOn = true;
    }
    public void turnOff() {
        this.isOn = false;
    }
}

class LampDemo {
    public static void main(String[] args) {
        Lamp lampOne = new Lamp();
        Lamp lampTwo = new Lamp();
        System.out.println("lampOne.isOn = " + lampOne.isOn);
        System.out.println("lampTwo.isOn = " + lampTwo.isOn);
        System.out.println("Turning off lampOne!");
        lampOne.turnOff();
        System.out.println("lampOne.isOn = " + lampOne.isOn);
        System.out.println("lampTwo.isOn = " + lampTwo.isOn);

        Lamp myLamp = new Lamp();

        myLamp.turnOff();
        System.out.println("1)");
        if (myLamp.isOn) System.out.println("Example2.Lamp is on!");
        else System.out.println("Example2.Lamp is off!");

        myLamp.turnOn();
        System.out.println("2)");
        if (myLamp.isOn) System.out.println("Example2.Lamp is on!");
        else System.out.println("Example2.Lamp is off!");

    }
}
