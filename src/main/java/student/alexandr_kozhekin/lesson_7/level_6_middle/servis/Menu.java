package student.alexandr_kozhekin.lesson_7.level_6_middle.servis;

import student.alexandr_kozhekin.lesson_7.level_6_middle.bean.CreditCard;
import java.util.Scanner;

public class Menu {

    public static void menu (CardServis cardServis, CreditCard creditCard){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите операцию: " + "\n"
                + "1. Снять деньги с карты" + "\n"
                + "2. Пополнить карту" + "\n"
                + "3. Выход");

        int choose = scanner.nextInt();

            switch (choose){
                case 1:
                    System.out.println("Операция № 1 - снятие денег с карты");
                    CardServis.deposit(creditCard);
                    menu(cardServis, creditCard);
                    break;
                case 2:
                    System.out.println("Операция № 2 - пополнение карты");
                    CardServis.withdraw(creditCard);
                    menu(cardServis, creditCard);
                    break;
                case 3:
                    System.out.println("Выход!");
                    break;
                default:
                    System.out.println("Выберите нужную операцию!");
                    menu(cardServis, creditCard);
                    break;
            }
    }
}
