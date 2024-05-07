package com.srijan.practice1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @Test
    public void sumTest(){
        calculator = new Calculator();
        int result = calculator.sum(4, 5);

        assertEquals(9, result);
    }

    @Test
    public void divisionTest(){
        calculator = new Calculator();
        int result = calculator.division(6,3);
        assertEquals(2, result);

    }

    @Test
    public void divisionWithExceptionTest(){
        calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.division(4,0));

    }

}