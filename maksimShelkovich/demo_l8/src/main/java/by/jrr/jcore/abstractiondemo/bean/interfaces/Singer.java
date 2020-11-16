package by.jrr.jcore.abstractiondemo.bean.interfaces;

public interface Singer {

    String name = "anonymous"; //highly unlikely

    void sign();

    default void stayOnTheEarth() {
        System.out.println(name.concat(" Staying on The Earth"));
    }
}
