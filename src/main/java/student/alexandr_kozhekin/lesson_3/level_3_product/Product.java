package student.alexandr_kozhekin.lesson_3.level_3_product;

public class Product {
    private String productName;
    private double productRegularPrice;
    private double productDiscount;

    public Product(String productName) {
        this.productName = productName;
    }

    public void setProductRegularPrice(double productRegularPrice) {
        this.productRegularPrice = productRegularPrice;
    }

    public void setProductDiscount(double productDiscount) {
        this.productDiscount = productDiscount;
    }

    public double actualPrice(){
        return productRegularPrice - (productRegularPrice * productDiscount / 100);
    }

    public void printInformation(){
        System.out.println("Название продукта: " + productName + "\n"
                + "Цена за единицу продукции: " + productRegularPrice + " RUB" + "\n"
                + "Скидка на продукт: " + productDiscount + " %" + "\n"
                + "Актуальная цена: " + actualPrice() + " RUB" + "\n");
    }
}
