package student.alexandr_kozhekin.lesson_3.level_3_product;

import java.util.List;

public class Product {
    private static int id;
    private final int productId;
    private String productName;
    private double productRegularPrice;
    private double productDiscount;

    public Product(String productName, double productRegularPrice, double productDiscount) {
        productId = id++;
        this.productName = productName;
        this.productRegularPrice = productRegularPrice;
        this.productDiscount = productDiscount;
    }

    public double getProductRegularPrice() {
        return productRegularPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double actualPrice(){
        return productRegularPrice - (productRegularPrice * productDiscount / 100);
    }

    public static void comparePrices(Product product1, Product product2){

        if (product1.getProductRegularPrice() < product2.getProductRegularPrice()){

            double q = product2.productRegularPrice - product1.productRegularPrice;

            System.out.println("Второй товро дороже на " + q + " RUB");

        } else if (product1.getProductRegularPrice() > product2.getProductRegularPrice()){

            double q = product1.productRegularPrice - product2.productRegularPrice;

            System.out.println("Первый товар дороже на " + q + " RUB");

        } else if (product1.getProductRegularPrice() == product2.getProductRegularPrice()){

            System.out.println("Цены равны!");
        }
    }
    //метод для вывода содержимого в списке
    public static void iterationOverTheList(List<Product> arrayList){

        for (int i = 0; i < arrayList.size(); i++) {

            System.out.println("№" + i + " "
                    + arrayList.get(i).getProductName() +
                    " - " + arrayList.get(i).getProductRegularPrice() + " RUB");
        }
    }
    //печать информации
    public void printInformation(){
        System.out.println("Название продукта: " + productName + "\n"
                + "Номер продукта: " + productId + "\n"
                + "Цена за единицу продукции: " + productRegularPrice + " RUB" + "\n"
                + "Скидка на продукт: " + productDiscount + " %" + "\n"
                + "Актуальная цена: " + actualPrice() + " RUB" + "\n");
    }
}
