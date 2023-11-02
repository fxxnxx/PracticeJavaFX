package com.example.pz_3;

import com.example.pz_3.CalculationStrategy;

public class AdditionStrategy implements CalculationStrategy {
    @Override
    public String calculate(double operandA, double operandB) {
        double result = operandA + operandB;
        return operandA + " + " + operandB + " = " + result;
    }
}

