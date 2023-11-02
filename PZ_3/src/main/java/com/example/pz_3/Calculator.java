package com.example.pz_3;

public class Calculator {
    private CalculationStrategy strategy;

    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public String executeOperation(double operandA, double operandB) {
        if (strategy == null) {
            return "Выберите операцию";
        }
        return strategy.calculate(operandA, operandB);
    }
}
