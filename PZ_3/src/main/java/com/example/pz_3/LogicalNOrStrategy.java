package com.example.pz_3;

public class LogicalNOrStrategy implements CalculationStrategy {
    @Override
    public String calculate(double operandA, double operandB) {
        boolean result = !(operandA != 0 || operandB != 0);
        return operandA + " ИЛИ-НЕ " + operandB + " = " + result;
    }
}
