package com.example.myapplication1.calculations.presentation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;

import com.example.myapplication1.calculations.logic.MathOperations;
import com.example.myapplication1.R;

public class MathButton extends androidx.appcompat.widget.AppCompatButton {
    private MathOperations mOperations;

    public MathButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray attributes = context
                .getTheme()
                .obtainStyledAttributes(attrs, R.styleable.MathButton, 0, 0);
        try {
            int mathIndex = attributes.getInt(R.styleable.MathButton_mathOperation,
                    0);
            Log.d("MathButton", String.valueOf(mathIndex));
            mOperations = MathOperations.values()[mathIndex];
        } finally {
            attributes.recycle();
        }
    }

    public MathOperations mathOperation() {
        return mOperations;
    }
}
