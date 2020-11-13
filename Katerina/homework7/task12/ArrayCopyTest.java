package task12;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {

        ArrayCopyTest array = new ArrayCopyTest();
        array.test1();
        array.test2();
        array.test3();
    }

    public void resultOfArrayTest(int[] expected, int[] actual, String nameOfTest) {
        if (Arrays.equals(actual, expected)) System.out.println(nameOfTest + ":is OK!");
        else System.out.println(nameOfTest + ":is NOT OK!");
    }

    public void test1() {
        ArrayCopy array = new ArrayCopy();
        int[] expected = {2, 4};
        int[] tempArray = {1, 1, 2, 4, 7, 8, 1};
        int[] actual = array.copyInRange(tempArray, 2, 5);
        resultOfArrayTest(expected, actual, "Test1");
    }

    public void test2() {
        ArrayCopy array = new ArrayCopy();
        int[] expected = {};
        int[] tempArray = {1, 1, 2, 4, 7, 8, 1};
        int[] actual = array.copyInRange(tempArray, 9, 10);
        resultOfArrayTest(expected, actual, "Test2");
    }

    public void test3() {
        ArrayCopy array = new ArrayCopy();
        int[] expected = {};
        int[] tempArray = {1, 1, 2, 4, 7, 8, 1};
        int[] actual = array.copyInRange(tempArray, 5, 2);
        resultOfArrayTest(expected, actual, "Test3");
    }

}
