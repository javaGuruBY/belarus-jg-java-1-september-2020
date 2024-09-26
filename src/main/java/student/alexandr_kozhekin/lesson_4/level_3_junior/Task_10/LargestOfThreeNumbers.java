package student.alexandr_kozhekin.lesson_4.level_3_junior.Task_10;

public class LargestOfThreeNumbers {

    public static void largestOfThreeNumbers(int numberOne, int numberTwo, int numberThere){

        if(numberOne > numberTwo && numberOne > numberThere){

            System.out.println("Наибольшее число: " + numberOne);

        } else if (numberTwo > numberOne && numberTwo > numberThere){

            System.out.println("Наибольшее число: " + numberTwo);

        } else if (numberThere > numberOne && numberThere > numberTwo) {

            System.out.println("Наибольшее число: " + numberThere);

        } else if (numberOne == numberTwo || numberOne == numberThere){

            System.out.println("Наибольшее число: " + numberOne);

        } else if (numberTwo == numberOne || numberTwo == numberThere){

            System.out.println("Наибольшее число: " + numberTwo);

        } else if (numberThere == numberOne || numberThere == numberTwo){

            System.out.println("Наибольшее число: " + numberThere);

       }
    }
}
