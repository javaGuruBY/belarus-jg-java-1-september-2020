package by.jrr.encapsulation.calculator;

import by.jrr.encapsulation.calculator.Calculator;

public class CalculatorService {

    public void run() {
        Calculator calculator = new Calculator();

        calculator.getCounter();
        calculator.setCounter(23);
        calculator.decrement();
        calculator.increment();
    }
}
