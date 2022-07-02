package com.example.androidkidsgame;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class secondA extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button apple =(Button) findViewById(R.id.a);
        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("apple",R.drawable.apple);
                startActivity(intent);

            }
        });


        Button banana =(Button) findViewById(R.id.b);
        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("banana",R.drawable.banana);
                startActivity(intent);

            }
        });


        Button cat =(Button) findViewById(R.id.c);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("cat",R.drawable.cat);
                startActivity(intent);

            }
        });


        Button dog =(Button) findViewById(R.id.d);
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("dog",R.drawable.dog);
                startActivity(intent);

            }
        });


        Button egg =(Button) findViewById(R.id.e);
        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("egg",R.drawable.egg);
                startActivity(intent);

            }
        });



        Button fish =(Button) findViewById(R.id.f);
        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("fish",R.drawable.fish);
                startActivity(intent);

            }
        });



        Button glue =(Button) findViewById(R.id.g);
        glue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("glue",R.drawable.glue);
                startActivity(intent);

            }
        });



        Button hat =(Button) findViewById(R.id.h);
        hat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("hat",R.drawable.hat);
                startActivity(intent);

            }
        });


        Button ice =(Button) findViewById(R.id.i);
        ice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("ice",R.drawable.ice);
                startActivity(intent);

            }
        });



        Button jug =(Button) findViewById(R.id.j);
        jug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("jug",R.drawable.jug);
                startActivity(intent);

            }
        });


        Button key =(Button) findViewById(R.id.k);
        key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("key",R.drawable.key);
                startActivity(intent);

            }
        });


        Button lion =(Button) findViewById(R.id.l);
        lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("lion",R.drawable.lion);
                startActivity(intent);

            }
        });


        Button monkey =(Button) findViewById(R.id.m);
        monkey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("monkey",R.drawable.monkey);
                startActivity(intent);

            }
        });


        Button nose =(Button) findViewById(R.id.n);
        nose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("nose",R.drawable.nose);
                startActivity(intent);

            }
        });


        Button orange =(Button) findViewById(R.id.o);
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("orange",R.drawable.orange);
                startActivity(intent);

            }
        });


        Button pen =(Button) findViewById(R.id.p);
        pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("pen",R.drawable.pen);
                startActivity(intent);

            }
        });

        Button quack =(Button) findViewById(R.id.q);
        quack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("quack",R.drawable.quack);
                startActivity(intent);

            }
        });

        Button rabbit =(Button) findViewById(R.id.r);
        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("rabbit",R.drawable.rabbit);
                startActivity(intent);

            }
        });

        Button star =(Button) findViewById(R.id.s);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("str1",R.drawable.str1);
                startActivity(intent);

            }
        });

        Button ten =(Button) findViewById(R.id.t);
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("ten",R.drawable.ten);
                startActivity(intent);

            }
        });


        Button umbrella =(Button) findViewById(R.id.u);
        umbrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("umbrella",R.drawable.umbrella);
                startActivity(intent);

            }
        });


        Button van =(Button) findViewById(R.id.v);
        van.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("van",R.drawable.van);
                startActivity(intent);

            }
        });


        Button whale =(Button) findViewById(R.id.w);
        whale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("whale",R.drawable.whale);
                startActivity(intent);

            }
        });

        Button xray =(Button) findViewById(R.id.x);
        xray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("xray",R.drawable.xray);
                startActivity(intent);

            }
        });

        Button yogurt =(Button) findViewById(R.id.y);
        yogurt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("yogurt",R.drawable.yogurt);
                startActivity(intent);

            }
        });


        Button zebra =(Button) findViewById(R.id.z);
        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(secondA.this,thirdA.class);
                intent.putExtra("zebra",R.drawable.zebra);
                startActivity(intent);

            }
        });



    }
}