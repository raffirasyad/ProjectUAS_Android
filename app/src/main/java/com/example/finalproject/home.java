package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {


    CardView helloCard;
    CardView movieCard;
    CardView toastCard;
    CardView twoActivityCard;
    CardView iceClodCard;
    CardView alarmCard;
    CardView navigationCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        helloCard = findViewById(R.id.helloCard);
        movieCard = findViewById(R.id.movieCard);
        toastCard = findViewById(R.id.toastCard);
        twoActivityCard = findViewById(R.id.twoActivityCard);
        iceClodCard = findViewById(R.id.iceColdCard);
        alarmCard = findViewById(R.id.alarmCard);
        navigationCard = findViewById(R.id.navigationCard);



        helloCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( home.this, hello.class);
                startActivity(intent);
            }
        });

        movieCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( home.this, movie.class);
                startActivity(intent);
            }
        });

        toastCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( home.this, toast.class);
                startActivity(intent);
            }
        });

        twoActivityCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( home.this, firstActivity.class);
                startActivity(intent);
            }
        });

        iceClodCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( home.this, iceCold.class);
                startActivity(intent);
            }
        });

        alarmCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( home.this, alarm.class);
                startActivity(intent);
            }
        });

        navigationCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( home.this, navigation.class);
                startActivity(intent);
            }
        });



    }
}