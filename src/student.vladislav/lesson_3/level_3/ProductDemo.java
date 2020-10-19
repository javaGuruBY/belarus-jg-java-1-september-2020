public class ProductDemo {
    public static void main(String[] args) {

        Product information = new Product();

        information.Name = "Milk";
        information.regularPrice = 0.8;
        information.discount = 20;
        information.actualPrice();
        information.printInformation();
    }

}
