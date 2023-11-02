package com.example.pz_3;

public class DivisionStrategy implements CalculationStrategy {
    @Override
    public String calculate(double operandA, double operandB) {
        if (operandB == 0) {
            return "Деление на ноль недопустимо";
        }
        double result = operandA / operandB;
        return operandA + " / " + operandB + " = " + result;
    }
}