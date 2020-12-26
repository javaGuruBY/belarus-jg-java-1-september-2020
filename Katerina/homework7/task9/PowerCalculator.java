package task9;

import java.util.Scanner;

public class PowerCalculator {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double power(int number, int power) {
        return Math.pow(number, power);
    }

    public static void main(String[] args) {

        PowerCalculator calculator = new PowerCalculator();

        Scanner in = new Scanner(System.in);

        int choose = 0;
        while (choose != 2) {
            System.out.println("1.Make new calculations\n2.Exit");
            System.out.print("Your choice: ");
            choose = in.nextInt();
            switch (choose) {
                case 1: {
                    System.out.print("Input a number: ");
                    int number = in.nextInt();
                    System.out.print("Input a power: ");
                    int power = in.nextInt();

                    calculator.setNumber(number);
                    System.out.println("Result=" + (int) calculator.power(number, power));
                    break;
                }
                case 2:
                    break;
            }
        }

    }

}
