package com.learning.learnirlayoutprex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1to2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infinitival();


    }
    private void infinitival() {
        button1to2 = findViewById(R.id.buttonChangeActivity1to2);
        button1to2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intentFor1to2 = new Intent
                        (MainActivity.this, MainActivity2.class);
                startActivity(intentFor1to2);

            }
        });
    }
}