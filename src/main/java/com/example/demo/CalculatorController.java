package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam double num1, @RequestParam double num2) {
        double result = calculatorService.plus(num1, num2);
        return String.format("%.2f + %.2f = %.2f", num1, num2, result);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam double num1, @RequestParam double num2) {
        double result = calculatorService.minus(num1, num2);
        return String.format("%.2f - %.2f = %.2f", num1, num2, result);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam double num1, @RequestParam double num2) {
        double result = calculatorService.multiply(num1, num2);
        return String.format("%.2f * %.2f = %.2f", num1, num2, result);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2) {
        try {
            double result = calculatorService.divide(num1, num2);
            return String.format("%.2f / %.2f = %.2f", num1, num2, result);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
