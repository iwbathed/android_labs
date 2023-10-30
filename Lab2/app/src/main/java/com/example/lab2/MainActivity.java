package com.example.lab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private int number = 0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button addButton = findViewById(R.id.addButton);
        Button nextButton = findViewById(R.id.nextButton);

        addButton.setOnClickListener(v -> {
            number++;
            textView.setText(String.valueOf(number));
        });

        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DecrementActivity.class);
            intent.putExtra("number", number);
            startActivity(intent);
        });
    }
}

