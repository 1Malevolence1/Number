 package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //////////////////////////////////////Код для нахождения  суммы/////////////////////////////////
    public void onButtonClickSum(View v) {
        EditText el1 = (EditText) findViewById(R.id.ed_num1);
        EditText el2 = (EditText) findViewById(R.id.ed_num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int number1 = Integer.parseInt(el1.getText().toString());
        int number2 = Integer.parseInt(el2.getText().toString());
        int resSum = number1 + number2;
        resText.setText(Integer.toString(resSum));
////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////Код для нахождения  разности////////////////////////////////////////////
    }

    public void onButtonClickDifference(View v) {
        EditText el1 = (EditText) findViewById(R.id.ed_num1);
        EditText el2 = (EditText) findViewById(R.id.ed_num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int number1 = Integer.parseInt(el1.getText().toString());
        int number2 = Integer.parseInt(el2.getText().toString());
        int resDifference = number1 - number2;
        resText.setText(Integer.toString(resDifference));
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////Код для нахождения  умножения///////////////////////////////////////
    public void onButtonClickMultiplication(View v) {
        EditText el1 = (EditText) findViewById(R.id.ed_num1);
        EditText el2 = (EditText) findViewById(R.id.ed_num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int number1 = Integer.parseInt(el1.getText().toString());
        int number2 = Integer.parseInt(el2.getText().toString());
        int resMultiplication = number1 * number2;
        resText.setText(Integer.toString(resMultiplication));
    }
////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////////////Код для нахождения деления/////////////////////////////////////////////////
    public void onButtonClickDivision(View v) {
        EditText el1 = (EditText) findViewById(R.id.ed_num1);
        EditText el2 = (EditText) findViewById(R.id.ed_num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int number1 = Integer.parseInt(el1.getText().toString());
        int number2 = Integer.parseInt(el2.getText().toString());
        int resDivision = number1 / number2;
        resText.setText(Integer.toString(resDivision));

    }

////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////Код для нахождения остатка//////////////////////////////////////

    public  void  onButtonClickRemains(View v) {
        EditText el1 = (EditText) findViewById(R.id.ed_num1);
        EditText el2 = (EditText) findViewById(R.id.ed_num2);
        TextView resText = (TextView) findViewById(R.id.Result);

        int number1 = Integer.parseInt(el1.getText().toString());
        int number2 = Integer.parseInt(el2.getText().toString());
        int resRemains = number1 % number2;
        resText.setText(Integer.toString(resRemains));

    }
////////////////////////////////////////////////////////////////////////////////////////////////////
}