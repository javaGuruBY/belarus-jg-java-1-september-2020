package hw.level3;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest array = new ArrayServiceTest();
        array.containsTest();
        array.revertTest();
        array.sortTest();
    }

    void containsTest() {
        ArrayService array = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        boolean check = array.contains(arr, 4);
        checkTestResult(check, "containsTest");
    }

    void revertTest() {
        ArrayService array = new ArrayService();
        boolean check = false;
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = {5, 4, 3, 2, 1};
        array.revert(arr);
        if (Arrays.equals(arr, newArr)) check = true;
        checkTestResult(check, "revertTest");
    }

    void sortTest() {
        ArrayService array = new ArrayService();
        boolean check = false;
        int[] arr = {1, 10, 3, 10, 5};
        int[] newArr = {1, 3, 5, 10, 10};
        array.sort(arr);
        if (Arrays.equals(arr, newArr)) check = true;
        checkTestResult(check, "revertTest");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
