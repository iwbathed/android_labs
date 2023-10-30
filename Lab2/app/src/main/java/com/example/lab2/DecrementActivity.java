package com.example.lab2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DecrementActivity extends AppCompatActivity {
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrement);

        number = getIntent().getIntExtra("number", 0);

        TextView textView = findViewById(R.id.textView);
        textView.setText(String.valueOf(number));

        Button subtractButton = findViewById(R.id.subtractButton);
        Button nextButton = findViewById(R.id.nextButton);

        subtractButton.setOnClickListener(v -> {
            number--;
            textView.setText(String.valueOf(number));
        });

        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(DecrementActivity.this, DisplayActivity.class);
            intent.putExtra("number", number);
            startActivity(intent);
        });
    }
}
