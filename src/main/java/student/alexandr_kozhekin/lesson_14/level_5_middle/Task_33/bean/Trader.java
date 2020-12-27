package student.alexandr_kozhekin.lesson_14.level_5_middle.Task_33.bean;

public class Trader {

    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String toString() {
        return "Trader:"+this.name + " in " + this.city;
    }

}
