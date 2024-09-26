package student.alexandr_kozhekin.lesson_7.level_6_middle.test;

import student.alexandr_kozhekin.lesson_7.level_6_middle.bean.CreditCard;
import student.alexandr_kozhekin.lesson_7.level_6_middle.servis.CardServis;

class CardServisTest {

    CreditCard creditCardTest;
    CardServis cardServisTest;

    public static void main(String[] args) throws Exception {
        CardServisTest cardServisTest = new CardServisTest();

        cardServisTest.servisTest1();
        cardServisTest.servisTest2();
        cardServisTest.servisTest3();
        cardServisTest.servisTest4();

    }


    public void setUp() throws Exception {
        creditCardTest = new CreditCard(2923421, 1423);
        cardServisTest = new CardServis();
    }

    public void tearDown() throws Exception {
        creditCardTest = null;
        cardServisTest = null;

    }

    public void servisTest1() throws Exception {

        setUp();

        int actual = 1423;
        int expected = creditCardTest.getCardPin();

        if (actual == creditCardTest.getCardPin()){

            System.out.println("PIN Test OK");

        } else {

            testFailed(expected, actual);

        }

        tearDown();

    }

    public void servisTest2() throws Exception {

        setUp();

        int expected = creditCardTest.getCardBalance() - 1000;
        int actual = -1000;

        if (actual == expected){

            System.out.println("DEPOSIT Test OK");

        } else {

            testFailed(expected, actual);

        }

        tearDown();

    }

    public void servisTest3() throws Exception {

        setUp();

        int expected = creditCardTest.getCardBalance() + 1000;
        int actual = 1000;

        if (actual == expected){

            System.out.println("WITHDEAW Test OK");

        } else {

            testFailed(expected, actual);

        }

        tearDown();

    }

    public void servisTest4() throws Exception {

        setUp();

        int belans = creditCardTest.getCardBalance() + 1000;
        int expected = creditCardTest.getCardLoanDebt() - 1000;
        int actual = belans - 2000;

        if (actual == expected){

            System.out.println("CARD LOAN DEDT Test OK");

        } else {

            testFailed(expected, actual);

        }

        tearDown();

    }

    private void testFailed(int expected, int actual) {
        throw new RuntimeException("" +
                "\n\ttest failed: " +
                "\nexpected \t" + expected + " " +
                "\nbut got \t" + actual);
    }
}
