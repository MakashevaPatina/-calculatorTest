package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "welcome to the calculator";
    }
    @Override
    public Double plus(double a, double b) {
        return a + b;
    }
    @Override
    public Double minus(double a, double b) {
        return a - b;
    }
    @Override
    public Double multiply(double a, double b) {
        return a * b;
    }
    @Override
    public Double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Ошибка: деление на ноль не допускается.");
        }
        return  a / b;
    }
}