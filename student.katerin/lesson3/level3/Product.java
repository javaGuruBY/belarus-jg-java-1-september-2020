package level3;

import java.util.Scanner;

public class Product {
    public String name;
    public double regularPrice;
    public double discount;

    Product() {
    }

    Product(String name, double regularPrice,double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice() {
        double newPrice = (this.regularPrice - (this.regularPrice * this.discount / 100));
        return newPrice;
    }

    void printInformation() {
        System.out.println("Name:" + this.name
                + "\nPrice:" + this.regularPrice
                + "\nDiscount:" + this.discount);
    }
}




