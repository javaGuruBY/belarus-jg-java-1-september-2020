package student.alexandr_kozhekin.lesson_4.level_3_junior.Task_8;

public class EqualityOfThreeNumbers {

    public static void equalityOfThreeNumbers (int numberOne, int numberTwo, int numberThere){

        if(numberOne == numberTwo && numberOne == numberThere) {

            System.out.println("числа равны!");

        } else if (numberOne != numberTwo && numberOne != numberThere){

            System.out.println("Числа разные!");

        } else {

            System.out.println("Числа не равны!");
        }
    }
}
