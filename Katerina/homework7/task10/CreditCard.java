package task10;

import java.util.Scanner;

public class CreditCard {

    private int id;
    private String pin;
    private double balance;
    private double limit;
    private double indebtedness;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getIndebtedness() {
        return indebtedness;
    }

    public void setIndebtedness(double indebtedness) {
        this.indebtedness = indebtedness;
    }

    CreditCard(int id, String pin, double balance, double limit, double indebtedness) {
        this.id = id;
        this.pin = pin;
        this.balance = balance;
        this.limit = limit;
        this.indebtedness = indebtedness;
    }

    Scanner in = new Scanner(System.in);

    public void deposit(CreditCard card) {
        System.out.print("Top up: ");
        double sum = in.nextDouble();
        double newSum = card.getBalance() + sum;
        if (newSum < card.limit) card.setBalance(newSum);
        else System.out.println("Limit!");
    }

    public void withdraw(CreditCard card) {
        System.out.println("Your balance:" + card.getBalance());
        System.out.print("Withdraw: ");
        double sum = in.nextDouble();
        double newSum = card.getBalance() - sum;
        card.setBalance(newSum);
    }

    public void setNewLimit(CreditCard card) {
        System.out.print("\nYour limit:" + card.getLimit()
                + "\nDo you want to change? 1-yes 2-no"
                + "\nYour choice: ");
        int choose = in.nextInt();
        switch (choose) {
            case 1: {
                System.out.print("New limit: ");
                card.setLimit(in.nextDouble());
            }
            case 2:
                break;
        }
    }

    public String controlPin() {
        System.out.print("Input pin: ");
        return in.nextLine();
    }
}
