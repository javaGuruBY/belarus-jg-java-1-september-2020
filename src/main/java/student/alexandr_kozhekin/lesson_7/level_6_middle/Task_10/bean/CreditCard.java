package student.alexandr_kozhekin.lesson_7.level_6_middle.Task_10.bean;

import java.util.Objects;

public class CreditCard {

    private int cardNum;
    private int cardPin;
    private int cardBalance;
    private int cardCreditLimit;  // кредитный лимит
    private int cardLoanDebt;    // задолжность по кредиту

    public CreditCard(int cardNum, int cardPin) {
        this.cardNum = cardNum;
        this.cardPin = cardPin;
        this.cardBalance = 0;
        this.cardLoanDebt = 0;
    }

    public int getCardNum() {
        return cardNum;
    }

    public int getCardPin() {
        return cardPin;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public int getCardCreditLimit() {
        return cardCreditLimit;
    }

    public void setCardCreditLimit(int cardCreditLimit) {
        this.cardCreditLimit = cardCreditLimit;
    }

    public int getCardLoanDebt() {
        return cardLoanDebt;
    }

    public void setCardLoanDebt(int cardLoanDebt) {
        this.cardLoanDebt = cardLoanDebt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNum == that.cardNum &&
                cardPin == that.cardPin &&
                cardBalance == that.cardBalance &&
                cardCreditLimit == that.cardCreditLimit &&
                cardLoanDebt == that.cardLoanDebt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNum, cardPin, cardBalance, cardCreditLimit, cardLoanDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNum=" + cardNum +
                ", cardPin=" + cardPin +
                ", cardBalance=" + cardBalance +
                ", cardCreditLimit=" + cardCreditLimit +
                ", cardLoanDebt=" + cardLoanDebt +
                '}';
    }
}
