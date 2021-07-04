package com.example.myapplication1;

public class MathOperation implements Operation {
    private final MathOperations mOperation;

    public MathOperation(MathOperations _operation) {
        mOperation = _operation;
    }

    @Override
    public float calculate(float num1, float num2) {
        switch (mOperation) {
            case ADD: {
                return num1 + num2;
            }

            case SUBTRACT: {
                return num1 - num2;
            }

            case MULTIPLY: {
                return num1 * num2;
            }

            case DIVISION: {
                return num1 / num2;
            }

            case REMAINS: {
                return num1 % num2;
            }
        }
        return 0;
    }
}
