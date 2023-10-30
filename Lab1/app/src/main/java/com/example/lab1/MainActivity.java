package com.example.lab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView digitTextView;

    private int currentDigit = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        digitTextView = findViewById(R.id.digitTextView);
        Button incrementButton = findViewById(R.id.incrementButton);
        Button decrementButton = findViewById(R.id.decrementButton);
        Button resetButton = findViewById(R.id.resetButton);

        updateDigitTextView();

        incrementButton.setOnClickListener(view -> {
            currentDigit++;
            updateDigitTextView();
        });

        decrementButton.setOnClickListener(view -> {
            currentDigit--;
            updateDigitTextView();
        });

        resetButton.setOnClickListener(view -> {
            currentDigit = 0;
            updateDigitTextView();
        });
    }

    private void updateDigitTextView() {
        digitTextView.setText(String.valueOf(currentDigit));
    }
}
