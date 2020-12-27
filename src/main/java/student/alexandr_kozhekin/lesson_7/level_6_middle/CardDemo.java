package student.alexandr_kozhekin.lesson_7.level_6_middle;

import student.alexandr_kozhekin.lesson_7.level_6_middle.bean.CreditCard;
import student.alexandr_kozhekin.lesson_7.level_6_middle.servis.CardServis;
import student.alexandr_kozhekin.lesson_7.level_6_middle.servis.Menu;

public class CardDemo {
    public static void main(String[] args) {

        CardServis cardServis = new CardServis();
        CreditCard creditCard = new CreditCard(1121232512, 2841);

        Menu.menu(cardServis, creditCard);

    }
}
