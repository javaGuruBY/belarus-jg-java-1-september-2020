package by.jrr.jcore.abstractiondemo.bean.interfaces;

public class ElvisPresley implements Singer {

    private String name = "~~Elvis~~";

    public void flyToTheMoon() {
        System.out.println(name.concat(" Going to The Moon"));
    }

    @Override
    public void sign() {
        System.out.println("Love me tender, baby..");
    }
}
