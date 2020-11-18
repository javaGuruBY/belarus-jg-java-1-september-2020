package level1;

public class Address {

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", house=" + house +
                '}';
    }

    private String street;
    private int house;

    public Address(String street, int house) {
        this.street = street;
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }



}
