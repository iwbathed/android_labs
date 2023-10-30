package com.example.lab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        int number = getIntent().getIntExtra("number", 0);

        TextView textView = findViewById(R.id.displayTextView);
        textView.setText(String.valueOf(number));

        Button nextButton = findViewById(R.id.nextButton);

        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(DisplayActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}

