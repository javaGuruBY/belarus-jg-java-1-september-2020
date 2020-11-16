package by.jrr.calculator.service;

public class ComputeMachine {

    private Calculator calculator;

    public ComputeMachine(Calculator calculator) {
        this.calculator = calculator;
    }

    public int operationChain(int a, int b, int c) {
        int sum = calculator.summing(a, c);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return sum - b;
    }

    public boolean isDivideEven(double dividend, double divider) {
        double divisionResult = calculator.divide(dividend, divider);
        return divisionResult % 2 == 0;
    }

}
