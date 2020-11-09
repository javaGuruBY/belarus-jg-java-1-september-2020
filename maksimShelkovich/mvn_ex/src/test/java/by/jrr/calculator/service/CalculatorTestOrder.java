package by.jrr.calculator.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestOrder {

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
        System.out.println(1);
    }

    @Test
    public void testSubtractionFirstScenario() {
        System.out.println(2);
    }

    @Test
    public void testSubtractionSecondScenario() {
        System.out.println(3);
    }

    @Test
    public void testSubtractionThirdScenario() {
        System.out.println(4);

    }

    @Test
    public void maxShouldReturnFirst() {
        System.out.println(5);
    }

    @Test
    public void maxShouldReturnThird() {
        System.out.println(6);
    }

    @Test
    public void maxShouldReturnFirstOrSecond() {
        System.out.println(7);
    }

    @Test
    public void maxShouldReturnAny() {
        System.out.println(8);
    }

    @Test
    public void maxShouldReturnAny2() {
        System.out.println(9);
    }


    @Test
    public void maxShouldReturnSecond() {
        System.out.println(10);
    }
}
