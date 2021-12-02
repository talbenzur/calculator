package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private TextView Text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent=getIntent();
        String str= intent.getStringExtra("key");
        String str2= intent.getStringExtra("key2");
        Text1= findViewById(R.id.textView2);
        Text1.setText(str2);
    }
}