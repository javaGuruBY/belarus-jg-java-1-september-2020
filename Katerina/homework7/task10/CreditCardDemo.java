package task10;

import java.util.Scanner;

public class CreditCardDemo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CreditCard card = new CreditCard(12345, "123abc", 0.0, 100, 0.0);

        int choose = 0;
        while (choose != 4) {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Set new limit\n4.Exit");
            System.out.print("Your choice: ");
            choose = in.nextInt();
            switch (choose) {
                case 1 -> {
                    if (card.getPin().equals(card.controlPin())) {
                        card.deposit(card);
                    } else {
                        System.out.println("Incorrect pin!");
                    }
                }
                case 2 -> {
                    if (card.getPin().equals(card.controlPin())) {
                        card.withdraw(card);
                    } else {
                        System.out.println("Incorrect pin!");
                    }
                }
                case 3 -> {
                    if (card.getPin().equals(card.controlPin())) {
                        card.setNewLimit(card);
                    } else {
                        System.out.println("Incorrect pin!");
                    }
                }
            }
        }
    }
}