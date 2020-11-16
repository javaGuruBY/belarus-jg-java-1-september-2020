package by.jrr.arrays.service;

import by.jrr.arrays.Application;

import java.util.Arrays;

import static by.jrr.arrays.Application.APP_NAME;

public class ArrayDemo {

    public void run() {

        System.out.println(APP_NAME + "before");
        int[] arrayForInt = {3, 2, 5, 6, 8, 4, 2, 5};

        System.out.println(APP_NAME + "after");
    }

    public static void years() {
        int[] leapYears = new int[3];

        leapYears[0] = 2020;
        leapYears[1] = 2016;
        leapYears[2] = 2012;

        System.out.println("leapYears = " + Arrays.toString(leapYears));
    }

    public static void yearsInPlace() {
        int[] leapYears = {2020, 2016, 2012};

        System.out.println("leapYears = " + Arrays.toString(leapYears));
    }

    public static void iterateWithForLoop() {
        int[] arrayForInt = {3, 2, 5, 6, 8, 4, 2, 5};
        for (int i = 0; i < arrayForInt.length; i++) {
            System.out.println(arrayForInt[i]);
        }
    }

    public static void iterateWithWhileLoop() {
        int[] arrayForInt = {3, 2, 5, 6, 8, 4, 2, 5};
        int i = 0;
        while (i < arrayForInt.length) {
            System.out.println(arrayForInt[i]);
            i++;
        }
    }

    public static void printEvenIndexesWithContinueInWhileLoop() {
        int[] arrayForInt = {3, 2, 5, 6, 8, 4, 2, 5};
        int i = 0;
        while (i < arrayForInt.length) {
            if (i % 2 != 0) {
                i++;
                continue;
            }
            System.out.println(arrayForInt[i]);
            i++;
        }
    }

    public static void printEvenIndexesWithContinueInForLoop() {
        int[] arrayForInt = {3, 2, 5, 6, 8, 4, 2, 5};
        for (int i = 0; i < arrayForInt.length; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(arrayForInt[i]);
        }
    }

    public static void printIndexOfValue(int value) {
        int[] arrayForInt = {3, 2, 5, 6, 8, 4, 2, 9};
        for (int i = 0; i < arrayForInt.length; i++) {
            if(value == arrayForInt[i]) {
                System.out.println(arrayForInt[i] + " has index " + i);
                break;
            } else {
                System.out.println("not a target " + arrayForInt[i] + " has index " + i);
            }
        }
    }

    public static void enhancedForLoop_forEach() {
        int[] arrayForInt = {3, 2, 5, 6, 8, 4, 2, 9};
        for(int element : arrayForInt) {
            System.out.println(element);
        }
    }

    public static void findValueEnhanced(int value) {
        int[] arrayForInt = {3, 2, 5, 6, 8, 4, 2, 9};
        for (int element : arrayForInt) {
            if(value == element) {
                System.out.println(element);
                break;
            } else {
                System.out.println("not a target" + element);
            }
        }
    }
}
