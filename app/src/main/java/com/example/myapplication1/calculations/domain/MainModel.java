package com.example.myapplication1.calculations.domain;

import com.example.myapplication1.calculations.logic.Calculation;
import com.example.myapplication1.calculations.logic.Calculator;
import com.example.myapplication1.calculations.logic.MathOperations;
import com.example.myapplication1.calculations.presentation.CalculationObserver;

public class MainModel implements CalculatorDomain {
    private CalculationObserver mObserver;

    public MainModel(CalculationObserver _observer) {
        mObserver = _observer;
    }

    @Override
    public void performCalculations(String num1,
                                    String num2, MathOperations _operations) {
        if (!num1.equals("") && !num2.equals("")) {
            Calculator calculator = new Calculation(
                    Float.parseFloat(num1),
                    Float.parseFloat(num2),
                    _operations);
            mObserver.observeCalculation(calculator.result());
        }
    }
}
