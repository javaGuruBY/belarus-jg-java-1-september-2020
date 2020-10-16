package student.konstantin_adotik.lesson_3.level_5;

public class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product(" Citroen C5 ");

        product.setProductRegularPrice(3000);
        product.setProductDiscount(7.5);
        product.printInformation();


    }
}
