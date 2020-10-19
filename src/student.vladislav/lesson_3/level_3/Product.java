public class Product {
    String Name;
    double regularPrice;
    double discount;
    double actualPrice;

    void actualPrice() {
        actualPrice = regularPrice - (regularPrice * discount/100);
    }

    void printInformation(){
        System.out.println("Product: ");
        System.out.println("Name - " + Name);
        System.out.println("Regular price - " + regularPrice + " EUR");
        System.out.println("Discount " + discount + "%");
        System.out.println("Actual price " + actualPrice + " EUR");
    }

}
