package student.alexandr_kozhekin.lesson_3.level_3_product;

public class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product("RTX 3080");

        product.setProductRegularPrice(1262.32);
        product.setProductDiscount(15);
        product.printInformation();

        Product product1 = new Product("Ryzen 5 3600");

        product1.setProductRegularPrice(544.97);
        product1.setProductDiscount(10);
        product1.printInformation();
    }
}
