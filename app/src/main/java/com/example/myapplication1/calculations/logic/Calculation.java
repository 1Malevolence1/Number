package com.example.myapplication1.calculations.logic;

public class Calculation implements Calculator {
    private final Operation mOperation;
    private final float mNum1;
    private final float mNum2;

    public Calculation(float _num1, float _num2, MathOperations _operations) {
        mNum1 = _num1;
        mNum2 = _num2;
        mOperation = new MathOperation(_operations);
    }

    @Override
    public float result() {
        return mOperation.calculate(mNum1, mNum2);
    }
}
