package com.example.myapplication1;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText mNum1;
    private EditText mNum2;
    private TextView mResultView;
    private ViewGroup mMathOperations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNum1 = findViewById(R.id.ed_num1);
        mNum2 = findViewById(R.id.ed_num2);
        mResultView = findViewById(R.id.Result);
        mMathOperations = findViewById(R.id.math_operations);

        for (int i = 0; i < mMathOperations.getChildCount(); i++) {

            mMathOperations.getChildAt(i).setOnClickListener(v -> {
                Calculator calculator = new Calculation(
                        Float.parseFloat(mNum1.getText().toString()),
                        Float.parseFloat(mNum2.getText().toString()),
                        ((MathButton) v).mathOperation()
                );

                mResultView.setText(String.valueOf(calculator.result()));
            });
        }
    }
}