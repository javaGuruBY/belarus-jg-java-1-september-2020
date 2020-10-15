package level3;

import java.util.Scanner;

public class Product {
    public String name;
    public double regularPrice;
    public double discount;

    Product() {
    }

    Product(String name) {
        this.name = name;
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

class ProductDemo {
    public static void main(String[] args) {

        Product product1 = new Product("Toy");
        product1.discount = 70;
        product1.regularPrice = 150;

        int i=0;

        while (i != 3) {
            System.out.println("1)Show info\n2)Show new price\n3)Exit");
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            i = in.nextInt();

            switch (i) {
                case 1:
                    product1.printInformation();
                    break;
                case 2:
                    System.out.println("NewPrice:" + product1.actualPrice());
                    break;
                case 3:
                    break;
            }
        }
    }
}


