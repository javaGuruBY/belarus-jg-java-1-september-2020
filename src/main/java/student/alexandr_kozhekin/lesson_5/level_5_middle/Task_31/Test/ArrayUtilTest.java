package student.alexandr_kozhekin.lesson_5.level_5_middle.Task_31.Test;

import student.alexandr_kozhekin.lesson_5.level_5_middle.Task_31.Application.ArrayUtil;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {

        int[] arrayTest = new int[7];
        int[] expectedResult = arrayTest;

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] result = arrayUtil.createArray(7);

        if (arrayTest.length == result.length) {

            testPassed("Should create array test");

        } else {

            testFailed(arrayTest, expectedResult, result);

        }
    }

    //Task_36
    public void shouldFindMaxNumber() {

        int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expectedResult = 10;

        ArrayUtil arrayUtil = new ArrayUtil();

        int result = arrayUtil.findMaxNumber(arrays);

        if (expectedResult == result) {

            testPassed("Should find max number test");

        } else {

            testFailed(arrays, expectedResult, result);

        }
    }
    //Task_38
    public void shouldFindMinNumber() {

        int[] arrays = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expectedResult = 1;

        ArrayUtil arrayUtil = new ArrayUtil();

        int result = arrayUtil.findMinNumber(arrays);

        if (expectedResult == result) {

            testPassed("Should find min number test");

        } else {

            testFailed(arrays, expectedResult, result);

        }
    }

    private void testPassed(String message) {
        System.out.println("\u001B[32m  " + message + "passed successfully \u001B[0m");
    }

    private void testFailed(int[] arrays, int expected, int result) {
        throw new RuntimeException("" +
                "\n\ttest failed: " +
                "\nfor array length \t" + arrays.length + " " +
                "\nexpected \t" + expected + " " +
                "\nbut got \t" + result);
    }

    private void testFailed(int[] arrays, int[] expected, int[] result) {
        throw new RuntimeException("" +
                "\n\ttest failed: " +
                "\nfor array length \t" + arrays.length + " " +
                "\nexpected \t" + expected.length + " " +
                "\nbut got \t" + result.length);
    }
}
