package level3;

public class InMemoryDatabase implements ProductDatabase {

    static Product[] products = new Product[4];

    public static void main(String[] args) {

        products[0] = new Product("cheese");
        products[1] = new Product("blueberry");
        products[2] = new Product("olive");
        products[3] = new Product("milk");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }
    }

    public void save(Product product) {
        Product[] newProducts = new Product[products.length + 1];
        for (int i = 0; i < newProducts.length - 1; i++) {
            newProducts[i] = products[i];
        }
        newProducts[newProducts.length - 1] = product;
    }

    public Product findByTitle(String productTitle) {
        Product myProduct = null;
        for (int i = 0; i < products.length; i++) {
            if (productTitle.equals(products[i].getTitle())) {
                myProduct = products[i];
                break;
            }
        }
        return myProduct;
    }
}
