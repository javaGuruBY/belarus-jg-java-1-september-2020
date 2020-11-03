package student.konstantin_adotik.lesson_5.task_13;

public class SumOfArrayOfNumbers {

    public static void main(String[] args) {

        int[] randomNumbersArray = new int[3];

        for (int i = 0; i < randomNumbersArray.length; i++) {

            randomNumbersArray[i] = (int) (Math.random() * (50 + 3));

            System.out.println(randomNumbersArray[i]);
        }
    }
}
