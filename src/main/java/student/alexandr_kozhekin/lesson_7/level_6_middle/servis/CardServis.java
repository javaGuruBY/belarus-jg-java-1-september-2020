package student.alexandr_kozhekin.lesson_7.level_6_middle.servis;

import student.alexandr_kozhekin.lesson_7.level_6_middle.bean.CreditCard;
import java.util.Scanner;

public class CardServis {

    public static void deposit (CreditCard creditCard){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пинкод: ");
        int pinCard = scanner.nextInt();

        System.out.println("Введите сумму снятия: ");
        int withdrawMone = scanner.nextInt();

        if (pinCard == creditCard.getCardPin() &&
                withdrawMone < creditCard.getCardBalance()){

            System.out.println("Операция разрешина!");

            int returnMone = creditCard.getCardBalance() - withdrawMone;

            creditCard.setCardBalance(returnMone);

            System.out.println("Баланс на карте: " + creditCard.getCardBalance() + " RUB");

        } else if (pinCard == creditCard.getCardPin() &&
                withdrawMone > creditCard.getCardBalance()){

            System.out.println("Операция разрешена! Внимание, зодолжности по кредиту увеличена!");

            int returnMone = creditCard.getCardBalance() - withdrawMone;

            creditCard.setCardLoanDebt(returnMone);
            creditCard.setCardBalance(0);

            cardInfo(creditCard);

        } else if (pinCard == creditCard.getCardPin() &&
                creditCard.getCardLoanDebt() > creditCard.getCardCreditLimit()){

            System.out.println("Операция отклонена!");

        } else if (pinCard != creditCard.getCardPin()){

            System.out.println("Операция отклонена!");
        }
    }

    public static void withdraw (CreditCard creditCard){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пинкод: ");
        int pinCard = scanner.nextInt();

        System.out.println("Введите сумму пополнения: ");
        int desiredMone = scanner.nextInt();
//проверка пина
        if (pinCard == creditCard.getCardPin()){

            System.out.println("Зачисление разрешино !");
//если задолжность меньше 0 то к задолжности добавляется сумма начисления
            if (creditCard.getCardLoanDebt() < 0){

                int cardReplenishment = creditCard.getCardLoanDebt() + desiredMone;
//если сумма начисления больше 0 (то есть задолжности перекрыли) то добавляем все к балансу
                if (cardReplenishment > 0 || cardReplenishment == 0){

                    int finalBalance = creditCard.getCardBalance() + cardReplenishment;
                    creditCard.setCardBalance(finalBalance);
                    creditCard.setCardLoanDebt(0);

                    cardInfo(creditCard);
//иначе если сумма начисления меньше 0 (то есть задолжность остается) то к задолжности прибовляем сумму начисления
                } else {

                    creditCard.setCardLoanDebt(cardReplenishment);

                    cardInfo(creditCard);
                }

        } else if (creditCard.getCardLoanDebt() == 0) {

                int cardReplenishment = creditCard.getCardBalance() + desiredMone;

                creditCard.setCardBalance(cardReplenishment);

                cardInfo(creditCard);
            }
        } else {

            System.out.println("Операция отклонена!");

        }
    }

    private static void cardInfo(CreditCard creditCard){

        System.out.println("Ваш баланс: " + creditCard.getCardBalance() + " RUB" + "\n"
                + "Задолжность по кредиту составляет: " + creditCard.getCardLoanDebt() + " RUB");

    }
}