package task33;

import java.util.Random;

public class ArrayUtil {
    public void fillArrayWithRandomNumbers() {
        Random random = new Random();
        //random.nextInt(10);

        int[] randomNumbers = new int[10];

        for (int i = 0; i < randomNumbers.length; i++) {
            int randomNumber = random.nextInt(10);
            randomNumbers[i] = randomNumber;
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayUtil array = new ArrayUtil();
        array.fillArrayWithRandomNumbers();
    }
}
