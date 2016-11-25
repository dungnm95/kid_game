package com.k63b.kid_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Main5Activity extends AppCompatActivity {
    ImageView back;
    MediaPlayer question_sound, result_sound;
    ImageView so_1;
    ImageView so_2;
    ImageView so_3;
    ImageView cau_hoi;
    ImageView noti_1;
    ImageView noti_2;
    ImageView cat;
    int heart = 0;
    //Bundle bundle = getIntent().getExtras();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        back = (ImageView)findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen_back = new Intent(Main5Activity.this, MainActivity.class);
                startActivity(screen_back);
            }
        });
        so_1 = (ImageView)findViewById(R.id.so_1);
        so_2 = (ImageView)findViewById(R.id.so_2);
        so_3 = (ImageView)findViewById(R.id.so_3);
        cau_hoi = (ImageView)findViewById(R.id.cau_hoi);
        noti_1 = (ImageView)findViewById(R.id.noti_1);
        noti_2 = (ImageView)findViewById(R.id.noti_2);
        cat = (ImageView)findViewById(R.id.cat);
        Intent i = getIntent();
        heart = i.getIntExtra("heart", 0);
        changeHeart(heart);
        Random r = new Random();
        int n = r.nextInt(9); n++;
        //int n =1;
        switch (n){
            case 1:
                cau_hoi.setImageResource(R.drawable.cau_hoi_so_1);
                question_sound = MediaPlayer.create(this, R.raw.so_1);
                question_sound.start();
                so_1.setImageResource(R.drawable.so_1);
                so_2.setImageResource(R.drawable.so_2);
                so_3.setImageResource(R.drawable.so_3);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(), R.raw.so_1);
                        question_sound.start();
                    }
                });
                so_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1,1,heart);
                    }
                });
                so_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2,1,heart);
                    }
                });
                so_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3,1,heart);
                    }
                });
                break;
            case 2:
                cau_hoi.setImageResource(R.drawable.cau_hoi_so_2);
                question_sound = MediaPlayer.create(this, R.raw.so_2);
                question_sound.start();
                so_1.setImageResource(R.drawable.so_1);
                so_2.setImageResource(R.drawable.so_2);
                so_3.setImageResource(R.drawable.so_3);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(), R.raw.so_2);
                        question_sound.start();
                    }
                });
                so_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1,2,heart);
                    }
                });
                so_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2,2,heart);
                    }
                });
                so_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3,2,heart);
                    }
                });
                break;
            case 3:
                cau_hoi.setImageResource(R.drawable.cau_hoi_so_3);
                question_sound = MediaPlayer.create(this, R.raw.so_3);
                question_sound.start();
                so_1.setImageResource(R.drawable.so_2);
                so_2.setImageResource(R.drawable.so_3);
                so_3.setImageResource(R.drawable.so_4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(), R.raw.so_3);
                        question_sound.start();
                    }
                });
                so_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2,3,heart);
                    }
                });
                so_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3,3,heart);
                    }
                });
                so_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4,3,heart);
                    }
                });
                break;
            case 4:
                cau_hoi.setImageResource(R.drawable.cau_hoi_so_4);
                question_sound = MediaPlayer.create(this, R.raw.so_4);
                question_sound.start();
                so_1.setImageResource(R.drawable.so_1);
                so_2.setImageResource(R.drawable.so_3);
                so_3.setImageResource(R.drawable.so_4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(), R.raw.so_4);
                        question_sound.start();
                    }
                });
                so_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1,4,heart);
                    }
                });
                so_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3,4,heart);
                    }
                });
                so_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4,4,heart);
                    }
                });
                break;
            case 5:
                cau_hoi.setImageResource(R.drawable.cau_hoi_so_5);
                question_sound = MediaPlayer.create(this, R.raw.so_5);
                question_sound.start();
                so_1.setImageResource(R.drawable.so_5);
                so_2.setImageResource(R.drawable.so_4);
                so_3.setImageResource(R.drawable.so_3);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(), R.raw.so_5);
                        question_sound.start();
                    }
                });
                so_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5,5,heart);
                    }
                });
                so_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4,5,heart);
                    }
                });
                so_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3,5,heart);
                    }
                });
                break;
            case 6:
                cau_hoi.setImageResource(R.drawable.cau_hoi_so_6);
                question_sound = MediaPlayer.create(this, R.raw.so_6);
                question_sound.start();
                so_1.setImageResource(R.drawable.so_7);
                so_2.setImageResource(R.drawable.so_6);
                so_3.setImageResource(R.drawable.so_8);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(), R.raw.so_6);
                        question_sound.start();
                    }
                });
                so_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7,6,heart);
                    }
                });
                so_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6,6,heart);
                    }
                });
                so_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8,6,heart);
                    }
                });
                break;
            case 7:
                cau_hoi.setImageResource(R.drawable.cau_hoi_so_7);
                question_sound = MediaPlayer.create(this, R.raw.so_7);
                question_sound.start();
                so_1.setImageResource(R.drawable.so_5);
                so_2.setImageResource(R.drawable.so_6);
                so_3.setImageResource(R.drawable.so_7);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(), R.raw.so_7);
                        question_sound.start();
                    }
                });
                so_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5,7,heart);
                    }
                });
                so_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6,77,heart);
                    }
                });
                so_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7,7,heart);
                    }
                });
                break;
            case 8:
                cau_hoi.setImageResource(R.drawable.cau_hoi_so_8);
                question_sound = MediaPlayer.create(this, R.raw.so_8);
                question_sound.start();
                so_1.setImageResource(R.drawable.so_8);
                so_2.setImageResource(R.drawable.so_9);
                so_3.setImageResource(R.drawable.so_10);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(), R.raw.so_8);
                        question_sound.start();
                    }
                });
                so_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8,8,heart);
                    }
                });
                so_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9,8,heart);
                    }
                });
                so_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10,8,heart);
                    }
                });
                break;
            case 9:
                cau_hoi.setImageResource(R.drawable.cau_hoi_so_9);
                question_sound = MediaPlayer.create(this, R.raw.so_9);
                question_sound.start();
                so_1.setImageResource(R.drawable.so_9);
                so_2.setImageResource(R.drawable.so_8);
                so_3.setImageResource(R.drawable.so_7);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(), R.raw.so_9);
                        question_sound.start();
                    }
                });
                so_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9,9,heart);
                    }
                });
                so_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8,9,heart);
                    }
                });
                so_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7,9,heart);
                    }
                });
                break;
            case 10:
                cau_hoi.setImageResource(R.drawable.cau_hoi_so_10);
                question_sound = MediaPlayer.create(this, R.raw.so_10);
                question_sound.start();
                so_1.setImageResource(R.drawable.so_1);
                so_2.setImageResource(R.drawable.so_10);
                so_3.setImageResource(R.drawable.so_2);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(), R.raw.so_10);
                        question_sound.start();
                    }
                });
                so_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1,10,heart);
                    }
                });
                so_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10,10,heart);
                    }
                });
                so_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2,10,heart);
                    }
                });
                break;
        }
    }
    public void checkAnswer(int choose, int answer, int heart){
        if(choose == answer){
            result_sound = MediaPlayer.create(this,R.raw.dung);
            result_sound.start();
            ++heart;
            changeHeart(heart);
            final int finalHeart = heart;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    Intent screen_play = new Intent(Main5Activity.this, Main5Activity.class);
                    screen_play.putExtra("heart", finalHeart);
                    startActivity(screen_play);
                }
            };
            Handler handler = new android.os.Handler();
            handler.postDelayed(runnable, 4000);

            //handler.removeCallbacks(runnable);

         }
        else {
            result_sound = MediaPlayer.create(this,R.raw.sai);
            result_sound.start();
        }


    }
    public void changeHeart(int heart){
        while (heart > 0){
            int count = heart % 10;

            if(heart < 10){
                if (count == 1){
                    noti_1.setImageResource(R.drawable.noti_1);
                }
                if (count == 2){
                    noti_1.setImageResource(R.drawable.noti_2);
                }
                if (count == 3){
                    noti_1.setImageResource(R.drawable.noti_3);
                }
                if (count == 4){
                    noti_1.setImageResource(R.drawable.noti_4);
                }
                if (count == 5){
                    noti_1.setImageResource(R.drawable.noti_5);
                }
                if (count == 6){
                    noti_1.setImageResource(R.drawable.noti_6);
                }
                if (count == 7){
                    noti_1.setImageResource(R.drawable.noti_7);
                }
                if (count == 8){
                    noti_1.setImageResource(R.drawable.noti_8);
                }
                if (count == 9){
                    noti_1.setImageResource(R.drawable.noti_9);
                }
            }
            else {
                if (count == 1){
                    noti_2.setImageResource(R.drawable.noti_1);
                }
                if (count == 2){
                    noti_2.setImageResource(R.drawable.noti_2);
                }
                if (count == 3){
                    noti_2.setImageResource(R.drawable.noti_3);
                }
                if (count == 4){
                    noti_2.setImageResource(R.drawable.noti_4);
                }
                if (count == 5){
                    noti_2.setImageResource(R.drawable.noti_5);
                }
                if (count == 6){
                    noti_2.setImageResource(R.drawable.noti_6);
                }
                if (count == 7){
                    noti_2.setImageResource(R.drawable.noti_7);
                }
                if (count == 8){
                    noti_2.setImageResource(R.drawable.noti_8);
                }
                if (count == 9){
                    noti_2.setImageResource(R.drawable.noti_9);
                }
            }
            heart = heart / 10;
        }
    }
}
