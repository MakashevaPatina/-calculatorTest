package com.example.demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParamTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    static Stream<Arguments> plusArgumentsProvider() {
        return Stream.of(
                Arguments.of(2.0, 3.0, 5.0),
                Arguments.of(-2.0, 1.0, -1.0)
        );

    }

    static Stream<Arguments> minusArgumentsProvider() {
        return Stream.of(
                Arguments.of(3.0, 2.0, 1.0),
                Arguments.of(-1.0, 2.0, -3.0)
        );
    }

    static Stream<Arguments> multiplyArgumentsProvider() {
        return Stream.of(
                Arguments.of(2.0, 3.0, 6.0),
                Arguments.of(-1.0, 2.0, -2.0)
        );
    }

    static Stream<Arguments> divideArgumentsProvider() {
        return Stream.of(
                Arguments.of(6.0, 3.0, 2.0),
                Arguments.of(-4.0, 2.0, -2.0)
        );
    }

    @ParameterizedTest
    @MethodSource("plusArgumentsProvider")
    @DisplayName("Параметризованный тест для метода plus()")
    void testPlus(double num1, double num2, double expected) {
        assertEquals(expected, calculatorService.plus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("minusArgumentsProvider")
    @DisplayName("Параметризованный тест для метода minus()")
    void testMinus(double num1, double num2, double expected) {
        assertEquals(expected, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyArgumentsProvider")
    @DisplayName("Параметризованный тест для метода multiply()")
    void testMultiply(double num1, double num2, double expected) {
        assertEquals(expected, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("divideArgumentsProvider")
    @DisplayName("Параметризованный тест для метода divide()")
    void testDivide(double num1, double num2, double expected) {
        assertEquals(expected, calculatorService.divide(num1, num2));
    }
}
