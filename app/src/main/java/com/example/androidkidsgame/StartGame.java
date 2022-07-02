package com.example.androidkidsgame;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StartGame extends AppCompatActivity {


    TextView tvTimer;
    TextView tvResult;
    ImageView ivShowImage;
    HashMap<String, Integer> map = new HashMap<>();
    ArrayList<String> wordsList = new ArrayList<>();

    int index;
    Button btn1, btn2, btn3, btn4;
    TextView tvPoints;
    int points;
    CountDownTimer countDownTimer;

    long millisUntilFinished;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
        tvTimer = findViewById(R.id.tvTimer);
        tvResult = findViewById(R.id.tvResult);
        ivShowImage = findViewById(R.id.ivShowImage);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        tvPoints = findViewById(R.id.tvPoints);
        index = 0;
        wordsList.add("A");
        wordsList.add("B");
        wordsList.add("C");
        wordsList.add("D");
        wordsList.add("E");
        wordsList.add("F");
        wordsList.add("G");
        wordsList.add("H");
        wordsList.add("I");
        wordsList.add("J");
        wordsList.add("K");
        wordsList.add("L");
        wordsList.add("M");
        wordsList.add("N");
        wordsList.add("O");
        wordsList.add("P");
        map.put(wordsList.get(0), R.drawable.apple);
        map.put(wordsList.get(1), R.drawable.banana);
        map.put(wordsList.get(2), R.drawable.cat);
        map.put(wordsList.get(3), R.drawable.dog);
        map.put(wordsList.get(4), R.drawable.egg);
        map.put(wordsList.get(5), R.drawable.fish);
        map.put(wordsList.get(6), R.drawable.glue);
        map.put(wordsList.get(7), R.drawable.hat);
        map.put(wordsList.get(8), R.drawable.ice);
        map.put(wordsList.get(9), R.drawable.jug);
        map.put(wordsList.get(10), R.drawable.key);
        map.put(wordsList.get(11), R.drawable.lion);
        map.put(wordsList.get(12), R.drawable.monkey);
        map.put(wordsList.get(13), R.drawable.nose);
        map.put(wordsList.get(14), R.drawable.orange);
        map.put(wordsList.get(15), R.drawable.pen);

        Collections.shuffle(wordsList);

        millisUntilFinished = 10000;
        points = 0;
        startGame();
    }

    private void startGame() {
        millisUntilFinished = 10000;
        tvTimer.setText("" + (millisUntilFinished / 1000) + "s");
        tvPoints.setText(points + " / " + wordsList.size());

        generateQuestions(index);
        countDownTimer = new CountDownTimer(millisUntilFinished, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                tvTimer.setText("" + (millisUntilFinished / 1000) + "s");
            }

            @Override
            public void onFinish() {

                index++;
                if (index > wordsList.size() - 1){
                    ivShowImage.setVisibility(View.GONE);
                    btn1.setVisibility(View.GONE);
                    btn2.setVisibility(View.GONE);
                    btn3.setVisibility(View.GONE);
                    btn4.setVisibility(View.GONE);
                    Intent intent = new Intent(StartGame.this, GameOver.class);
                    intent.putExtra("points", points);
                    startActivity(intent);
                    finish();
                } else {

                    countDownTimer = null;
                    startGame();
                }
            }
        }.start();
    }

    private void generateQuestions(int index) {
        ArrayList<String> wordsListTemp = (ArrayList<String>) wordsList.clone();
        String correctAnswer = wordsList.get(index);

        wordsListTemp.remove(correctAnswer);
        Collections.shuffle(wordsListTemp);

        ArrayList<String> newList = new ArrayList<>();
        newList.add(wordsListTemp.get(0));
        newList.add(wordsListTemp.get(1));
        newList.add(wordsListTemp.get(2));

        newList.add(correctAnswer);

        Collections.shuffle(newList);

        btn1.setText(newList.get(0));
        btn2.setText(newList.get(1));
        btn3.setText(newList.get(2));
        btn4.setText(newList.get(3));
        ivShowImage.setImageResource(map.get(wordsList.get(index)));
    }

    public void nextQuestion(View view) {

        btn1.setBackgroundColor(Color.parseColor("#2196f3"));
        btn2.setBackgroundColor(Color.parseColor("#2196f3"));
        btn3.setBackgroundColor(Color.parseColor("#2196f3"));
        btn4.setBackgroundColor(Color.parseColor("#2196f3"));
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        countDownTimer.cancel();
        index++;
        if (index > wordsList.size() - 1){
            // If true, hide the ImageView and Buttons.
            ivShowImage.setVisibility(View.GONE);
            btn1.setVisibility(View.GONE);
            btn2.setVisibility(View.GONE);
            btn3.setVisibility(View.GONE);
            btn4.setVisibility(View.GONE);
            Intent intent = new Intent(StartGame.this, GameOver.class);
            intent.putExtra("points", points);
            startActivity(intent);
            finish();
        } else {

            countDownTimer = null;
            startGame();
        }
    }

    public void answerSelected(View view) {
        view.setBackgroundColor(Color.parseColor("#17243e"));
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        countDownTimer.cancel();
        String answer = ((Button) view).getText().toString().trim();

        String correctAnswer = wordsList.get(index);

        if(answer.equals(correctAnswer)){
            points++;

            tvPoints.setText(points + " / " + wordsList.size());
            tvResult.setText("Correct");
        } else {
            tvResult.setText("Wrong");
        }
    }
}