package student.alexandr_kozhekin.lesson_4.level_3_junior.Task_9;

public class NumberOrder {

    public static void numberOrder (int numberOne, int numberTwo, int numberThere) {

        if (numberOne < numberTwo && numberOne < numberThere) {

            System.out.println("Числа в порядке возвростания!");

        } else if (numberOne > numberTwo && numberOne > numberThere) {

            System.out.println("Числа в порядке убывания!");

        } else {

            System.out.println("Числа не в порядке возвростания и не в порядке убывания!");
        }
    }
}
