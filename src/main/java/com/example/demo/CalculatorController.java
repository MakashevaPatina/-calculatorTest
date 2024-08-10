package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Double a, @RequestParam(value = "num2", required = false) Double b) {
        if (a == null || b == null) {
            return "Нужно указать все требуемые переменные.";
        }
        return calculatorService.plus(a, b);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Double a, @RequestParam(value = "num2", required = false) Double b) {
        if (a == null || b == null) {
            return "Нужно указать все требуемые переменные.";
        }
        return calculatorService.minus(a, b);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Double a, @RequestParam(value = "num2", required = false) Double b) {
        if (a == null || b == null) {
            return "Нужно указать все требуемые переменные.";
        }
        return calculatorService.multiply(a, b);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Double a, @RequestParam(value = "num2", required = false) Double b) {
        if (a == null || b == null) {
            return "Нужно указать все требуемые переменные.";
        }
        return calculatorService.divide(a, b);
    }
}
