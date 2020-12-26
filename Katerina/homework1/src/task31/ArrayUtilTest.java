package task31;

import java.util.Scanner;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {

        int[] array = new int[5];
        int length = 0;

        for (int i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input a array[" + (i + 1) + "] number: ");
            int a = in.nextInt();
            array[i] = a;
            length++;
        }
        if (length == 5) System.out.println("test is OK");
        else System.out.println("test is NOT OK");
    }

}
