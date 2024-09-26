package student.alexandr_kozhekin.lesson_7.level_6_middle.Task_10;

import student.alexandr_kozhekin.lesson_7.level_6_middle.Task_10.bean.CreditCard;
import student.alexandr_kozhekin.lesson_7.level_6_middle.Task_10.servis.Menu;

public class CardDemo {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(1121232512, 2841);

        Menu.menu(creditCard);

    }
}
