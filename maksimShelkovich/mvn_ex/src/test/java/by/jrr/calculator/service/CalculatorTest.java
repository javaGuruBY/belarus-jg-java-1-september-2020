package by.jrr.calculator.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }


    @Test
    public void testSumming() {
        int left = 4;
        int right = 5;
        int expected = 9;

        int actual = calculator.summing(4, 5);
        Assert.assertEquals(String.format("for values %s, %s", left, right), expected, actual);
    }

    @Test
    public void testSubtractionFirstScenario() {
        int left = 4;
        int right = 5;
        int expected = -1;

        int actual = calculator.subtraction(left, right);
        Assert.assertEquals(String.format("for values %s, %s", left, right), expected, actual);
    }

    @Test
    public void testSubtractionSecondScenario() {
        int left = 10;
        int right = 5;
        int expected = 5;

        int actual = calculator.subtraction(left, right);
        Assert.assertEquals(String.format("for values %s, %s", left, right), expected, actual);
    }

    @Test
    public void testSubtractionThirdScenario() {
        int left = -5;
        int right = 6;
        int expected = -11;

        int actual = calculator.subtraction(left, right);
        Assert.assertEquals(String.format("for values %s, %s", left, right), expected, actual);

    }

    @Test
    public void maxShouldReturnFirst() {
        int a = 7, b = 6, c = 5;
        int expected = 7;

        int actual = calculator.max(a, b, c);
        Assert.assertEquals(String.format("for values %s, %s, %s", a, b, c), expected, actual);
    }

    @Test
    public void maxShouldReturnThird() {
        int a = 5, b = 6, c = 7;
        int expected = 7;

        int actual = calculator.max(a, b, c);
        Assert.assertEquals(String.format("for values %s, %s, %s", a, b, c), expected, actual);
    }

    @Test
    public void maxShouldReturnFirstOrSecond() {
        int a = 7, b = 7, c = 5;
        int expected = 7;

        int actual = calculator.max(a, b, c);
        Assert.assertEquals(String.format("for values %s, %s, %s", a, b, c), expected, actual);
    }

    @Test
    public void maxShouldReturnAny() {
        int a = 7, b = 7, c = 7;
        int expected = 7;

        int actual = calculator.max(a, b, c);
        Assert.assertEquals(String.format("for values %s, %s, %s", a, b, c), expected, actual);
    }

    @Test
    public void maxShouldReturnSecond() {
        int a = 6, b = 7, c = 5;
        int expected = 7;

        int actual = calculator.max(a, b, c);
        Assert.assertEquals(String.format("for values %s, %s, %s", a, b, c), expected, actual);
    }
}
