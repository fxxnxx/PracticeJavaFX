package com.example.pz_3;

public class LogicalNotStrategy implements CalculationStrategy {
    @Override
    public String calculate(double operandA, double operandB) {
        boolean result = operandA != 0 && operandB == 0;
        return operandA + " ИНЕ " + operandB + " = " + result;
    }
}
