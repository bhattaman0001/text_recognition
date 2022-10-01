package com.example.textrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button idBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idBtn = findViewById(R.id.button);
        idBtn.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ScannerActivity.class));
            finish();
        });
    }
}