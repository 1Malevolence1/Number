package com.example.myapplication1.calculations.domain;

import com.example.myapplication1.calculations.logic.MathOperations;

public interface CalculatorDomain {
    void performCalculations(String _num1, String _num2, MathOperations _operations);
}
