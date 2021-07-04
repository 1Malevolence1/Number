package com.example.myapplication1.calculations.presentation;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication1.calculations.domain.CalculatorDomain;
import com.example.myapplication1.calculations.domain.MainModel;
import com.example.myapplication1.R;

public class MainActivity extends AppCompatActivity implements CalculationObserver {
    private EditText mNum1;
    private EditText mNum2;
    private TextView mResultView;
    private ViewGroup mMathOperations;
    private CalculatorDomain mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNum1 = findViewById(R.id.ed_num1);
        mNum2 = findViewById(R.id.ed_num2);
        mResultView = findViewById(R.id.Result);
        mMathOperations = findViewById(R.id.math_operations);
        mModel = new MainModel(this);

        for (int i = 0; i < mMathOperations.getChildCount(); i++) {
            mMathOperations.getChildAt(i).setOnClickListener(v -> mModel.performCalculations(
                    mNum1.getText().toString(),
                    mNum2.getText().toString(),
                    ((MathButton) v).mathOperation()
            ));
        }
    }

    @Override
    public void observeCalculation(float calculationResult) {
        mResultView.setText(String.valueOf(calculationResult));
    }
}