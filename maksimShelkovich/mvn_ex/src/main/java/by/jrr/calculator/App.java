package by.jrr.calculator;

import by.jrr.calculator.service.Calculator;
import by.jrr.calculator.service.ComputeMachine;

public class App {
    public static void main(String[] args) {
        ComputeMachine computeMachine = new ComputeMachine(new Calculator());
        computeMachine.operationChain(1,2,3);
    }
}
