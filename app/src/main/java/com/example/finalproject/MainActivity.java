package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, home.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}