package com.example.pz_3;

public class MultiplicationStrategy implements CalculationStrategy {
    @Override
    public String calculate(double operandA, double operandB) {
        double result = operandA * operandB;
        return operandA + " * " + operandB + " = " + result;
    }
}
