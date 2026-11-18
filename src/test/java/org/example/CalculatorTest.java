package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(30, calc.add(10, 20));
    }

    @Test
    void testSubtraction() {
        assertEquals(10, calc.subtract(20, 10));
    }

    @Test
    void testMultiplication() {
        assertEquals(200, calc.multiply(10, 20));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calc.divide(20, 10), 0.001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> calc.divide(20, 0));
    }
}