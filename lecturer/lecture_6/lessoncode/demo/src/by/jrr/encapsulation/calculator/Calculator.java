package by.jrr.encapsulation.calculator;

public class Calculator {
    private int counter;

    Calculator() {

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if (isCounterPositive(counter)) {
            this.counter = counter;
        } else {
            clearCounter();
        }
    }

    public void increment() {
        this.counter++;
    }

    public void decrement() {
        this.counter--;
    }

    private void clearCounter() {
        this.counter = 0;
    }

    private boolean isCounterPositive(int counter) {
        return counter > 0;
    }
}
