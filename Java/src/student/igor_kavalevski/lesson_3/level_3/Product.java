package student.igor_kavalevski.lesson_3.level_3;

public class Product {

    public String name;
    public double regularPrice;
    public double discount;

    public Product(String name) {
        this.name = name;
    }

    public void regularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void discount(double discount) {
        this.discount = discount;
    }

    public double actualPrice() {
        return regularPrice - (regularPrice * this.discount / 100);
    }

    void printInformation() {
        System.out.println("Product : " + name + " "
                + "regular price = "
                + regularPrice + " eur " + " "
                + " discount = " + discount + " % " + ","
                + "actual price = " + actualPrice() + " eur ");
    }
}
