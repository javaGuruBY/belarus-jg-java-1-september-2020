package student.alexandr_kozhekin.lesson_5.level_5_middle.Task_31;

import student.alexandr_kozhekin.lesson_5.level_5_middle.Task_31.Application.ArrayUtil;

import java.util.Scanner;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayUtil arrayUtil = new ArrayUtil();

        int [] array = arrayUtil.createArray(scanner.nextInt());
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);

    }
}
