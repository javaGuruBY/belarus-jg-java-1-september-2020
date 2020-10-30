package student.alexandr_kozhekin.lesson_5.level_2_intern.Task_12;

public class RandomNumInArray {
    public static void main(String[] args) {

        int [] randomNumArray = new int [3];

        System.out.println("Случайные три числа в массиве: ");

        for (int i = 0; i < randomNumArray.length; i++){

            randomNumArray[i] = (int) (Math.random() * (200+1)) - 100;

            System.out.println(randomNumArray[i]);
        }
    }
}
