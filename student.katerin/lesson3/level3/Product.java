package level3;

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

        product1.printInformation();
        System.out.println("NewPrice:" + product1.actualPrice());
    }
}


