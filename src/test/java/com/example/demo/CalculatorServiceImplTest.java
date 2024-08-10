package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();
    @Test
    void plus() {
        assertEquals(10, calculatorService.plus(5, 5));
        assertEquals(-2, calculatorService.plus(-1, -1));
    }

    @Test
    void minus() {
        assertEquals(0, calculatorService.minus(5, 5));
        assertEquals(2, calculatorService.minus(1, -1));
    }

    @Test
    void multiply() {
        assertEquals(25, calculatorService.multiply(5, 5));
        assertEquals(-2, calculatorService.multiply(2, -1));
    }

    @Test
    void divide() {
        assertEquals(1.0, calculatorService.divide(5, 5));
        assertEquals(2.0, calculatorService.divide(4, 2));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(1.0, 0));
        assertEquals("Ошибка: деление на ноль не допускается.", exception.getMessage());
    }
}