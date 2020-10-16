package student.konstantin_adotik.lesson_3.level_5;

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
            return productRegularPrice - (productRegularPrice * productDiscount / 45);
        }

        public void printInformation(){
            System.out.println(" Марко авто : " + productName + "\n"
                    + " обычная цена продукта : " + productRegularPrice + " $ " + "\n"
                    + " снизить цену на : " + productDiscount + " % " + "\n"
                    + " обычная цена : " + actualPrice() + " $ " + "\n");
        }
}
