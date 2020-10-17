package student.igor_kavalevski.lesson_3.level_3;

public class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product("Cheese");

        product.regularPrice(10);
        product.discount(15);
        product.printInformation();

    }
}
