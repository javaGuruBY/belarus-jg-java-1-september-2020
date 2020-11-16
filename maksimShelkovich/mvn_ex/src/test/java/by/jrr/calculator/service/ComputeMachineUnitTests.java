package by.jrr.calculator.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ComputeMachineUnitTests {

    ComputeMachine computeMachine;
    @Mock
    Calculator calculator;

    @Before
    public void setUp() {
        computeMachine = new ComputeMachine(calculator);
    }

    @Test
    public void isDivideEven() {
        int a = 10, b = 5;
        boolean expected = true;
        Mockito.when(calculator.divide(a, b)).thenReturn(2.0);

        boolean actual = computeMachine.isDivideEven(a, b);
        Assert.assertEquals(String.format("for values %s, %s", a, b), expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isDivideEvenShouldReturnException() {
        int a = 10, b = 0;
        Mockito.when(calculator.divide(a, b)).thenThrow(new IllegalArgumentException());
        computeMachine.isDivideEven(a, b);
    }

    @Test
    public void operationChain() {
        int a = 7, b = 7, c = 5;
        int expected = 5;

        Mockito.when(calculator.summing(a, c)).thenReturn(12);
        int actual = computeMachine.operationChain(a, b, c);
        Assert.assertEquals(String.format("for values %s, %s, %s", a, b, c), expected, actual);
    }
}
