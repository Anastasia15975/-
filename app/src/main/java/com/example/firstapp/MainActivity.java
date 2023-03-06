package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum(View view) {
        EditText firstNum = findViewById(R.id.firstNumEdit);
        EditText secondNum = findViewById(R.id.secondNumEdit);

        int first = Integer.parseInt(firstNum.toString());
        int second = Integer.parseInt(secondNum.toString());

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("firstKey", first);
        intent.putExtra("secondKey", second);
        startActivity(intent);
    }
}