package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String welcome() {
        return "welcome to the calculator";
    }

    public String plus(double a, double b) {
        double results = a + b;
        return a + " + " + b + " = " + results;
    }

    public String minus(double a, double b) {
        double results = a - b;
        return a + " - " + b + " = " + results;
    }

    public String multiply(double a, double b) {
        double results = a * b;
        return a + " * " + b + " = " + results;
    }

    public String divide(double a, double b) {
        if (b == 0) {
            return "Деление на ноль не допускается.";
        }
        double results = a / b;
        return a + " / " + b + " = " + results;
    }


}


