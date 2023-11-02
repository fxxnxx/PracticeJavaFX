package com.example.pz_3;

public class LogicalAndStrategy implements CalculationStrategy {
    @Override
    public String calculate(double operandA, double operandB) {
        boolean result = operandA != 0 && operandB != 0;
        return operandA + " И " + operandB + " = " + result;
    }
}
