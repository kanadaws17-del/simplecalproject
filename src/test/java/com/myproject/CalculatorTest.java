package com.myproject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Calculator
 */
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(10, 5);
        assertEquals(15, result, "10 + 5 should equal 15");
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result, "10 - 5 should equal 5");
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(10, 5);
        assertEquals(50, result, "10 * 5 should equal 50");
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(10, 5);
        assertEquals(2.0, result, 0.001, "10 / 5 should equal 2.0");
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        }, "Dividing by zero should throw ArithmeticException");
    }

    @Test
    public void testAddNegativeNumbers() {
        int result = calculator.add(-10, -5);
        assertEquals(-15, result, "-10 + (-5) should equal -15");
    }
}
