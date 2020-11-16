package level3;

import java.util.Scanner;

class ProductDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a name:");
        String name = scanner.nextLine();

        Scanner inDiscount = new Scanner(System.in);
        System.out.print("Input a discount: ");
        double discount = inDiscount.nextDouble();

        Scanner inPrice = new Scanner(System.in);
        System.out.print("Input a regular price: ");
        double regularPrice = inPrice.nextDouble();

        Product product1 = new Product(name, regularPrice, discount);

        int i = 0;
        while (i != 3) {
            System.out.println("\n1)Show info\n2)Show new price\n3)Exit");
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            i = in.nextInt();

            switch (i) {
                case 1:
                    product1.printInformation();
                    break;
                case 2:
                    System.out.println("NewPrice:" + product1.actualPrice());
                    break;
                case 3:
                    break;
            }
        }
    }
}
