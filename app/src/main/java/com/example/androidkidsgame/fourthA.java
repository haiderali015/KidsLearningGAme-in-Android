package com.example.androidkidsgame;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fourthA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void startGame(View view) {
        // In startGame() method, create an Intent to launch StartGame Activity
        Intent intent = new Intent(fourthA.this, StartGame.class);
        startActivity(intent);
        // Finish MainActivity
        finish();
    }
}