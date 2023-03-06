package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Integer first = getIntent().getExtras().getInt("firstKey");
        Integer second = getIntent().getExtras().getInt("secondKey");
        Integer third = first + second;

        TextView firstNum = findViewById(R.id.firstNumResult);
        TextView secondNum = findViewById(R.id.secondNumResult);
        TextView result = findViewById(R.id.result);

        firstNum.setText(first.toString());
        secondNum.setText(second.toString());
        result.setText(third.toString());
    }
}