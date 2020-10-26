package by.jrr.calculator.service;

public class Calculator {

    public int summing(int left, int right) {
        // some new code
        return left + right;
    }

    public int subtraction(int left, int right) {
        return left - right;
    }

    public int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        }
        return c;
    }
}
