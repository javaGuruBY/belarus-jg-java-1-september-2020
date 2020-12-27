package student.alexandr_kozhekin.lesson_3.level_3_product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Product> productsList = new ArrayList<>();

        Product product0 = new Product("RTX 3080", 1262.32, 15);
        Product product1 = new Product("Ryzen 5 3600", 544.97, 10);
        Product product2 = new Product("GTX 1050 Ti", 454.80, 5);
        Product product3 = new Product("GTX 1660", 735.80, 10);
        Product product4 = new Product("GTX 1050 Super", 670, 5);
        Product product5 = new Product("RTX 2060 Super", 1250.46, 10);
        Product product6 = new Product("RTX 2080 Ti", 3948.63, 10);

        productsList.add(product0);
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);
        productsList.add(product6);

        System.out.print("Добро пожаловать!" + "\n"
                + "Введите цифру от 1 до 4 для выбора действия: " + "\n"
                + "1.Список подукции" + "\n"
                + "2.Cравнить цену" + "\n"
                + "3.Информация о выбраном продукте" + "\n"
                + "4.Выход" + "\n\n"
                + "Выбор действия: ");

        int num = scanner.nextInt();

        while (num != 4) {

            if (num == 1) {

                System.out.println("Список подукции " + "\n");

                Product.iterationOverTheList(productsList);

                return;

            } else if (num == 2) {

                System.out.println("Cравнить цену " + "\n\n"
                        + "Выберите доступный номер для сравнения (Максимум два номера!):");

                Product.iterationOverTheList(productsList);

                int productNumOne = scanner.nextInt();
                System.out.println("Первый номер: " + productNumOne);

                int productNumTwo = scanner.nextInt();
                System.out.println("Второй номер: " + productNumTwo);

                Product.comparePrices(productsList.get(productNumOne), productsList.get(productNumTwo));

                return;

            } else if (num == 3) {
                System.out.println("Информация о продукте" + "\n");
                System.out.println("Для получения подробной информации о скидке выберите номер доступного продукта: ");

                Product.iterationOverTheList(productsList);

                int chekNum = scanner.nextInt();

                System.out.println("Выбран номер " + chekNum + "\n");

                productsList.get(chekNum).printInformation();

                return;
            }
        }
    }
}
