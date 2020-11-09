package by.jrr.calculator.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ComputeMachineIntTests {

    ComputeMachine computeMachine;

    @Before
    public void setUp() {
        computeMachine = new ComputeMachine(new Calculator());
    }

    @Test(timeout = 100)
    public void operationChain() {
        int a = 7, b = 7, c = 5;
        int expected = 5;

        int actual = computeMachine.operationChain(a, b, c);
        Assert.assertEquals(String.format("for values %s, %s, %s", a, b, c), expected, actual);
    }
}
