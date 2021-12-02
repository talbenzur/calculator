package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.lang.Math;


public class MainActivity extends AppCompatActivity {

    private TextView result;
    private int num1;
    private int num2;
    private char ch;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result= findViewById(R.id.textViewResult);
        result.setText("");
    }

    public void buttonNumFunc(View view) {
        Button b= (Button) view;
        result.append(b.getText());

    }

    public void buttonPowSqrt(View view) {
        Button b= (Button) view;

        ch=b.getText().toString().charAt(0);
        num1=Integer.parseInt(result.getText().toString());
        switch(ch) {
            case '√': {
                result.setText((Math.sqrt(num1)) + "");
                break;

            }
            case '^': {
                result.setText((num1 * num1) + "");
                break;
            }
        }

    }

    public void FuncOpp(View view) {
        Button b= (Button) view;
        ch=b.getText().toString().charAt(0);
        num1=Integer.parseInt(result.getText().toString());
        result.setText("");
    }

    public void equalFunc(View view) {
        num2=Integer.parseInt(result.getText().toString());
        switch(ch){
            case '+': {
                result.setText((num1 + num2)+"");
                break;
            }
            case '-':{
                result.setText((num1 - num2)+"");
                break;

            }
            case 'X':{
                result.setText((num1 * num2)+"");
                break;
            }
            case '/':{
                result.setText((num1 / num2)+"");
                break;
            }

        }

    }

    public void FuncGoToSecActivity(View view) {

        Intent intent= new Intent(this, Activity2.class);
        intent.putExtra("key", result.getText().toString());
        intent.putExtra("key2", "Tal is the best");
        startActivity(intent);

    }
}