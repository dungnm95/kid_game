package com.k63b.kid_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    ImageView back;
    ImageView question, cat;
    MediaPlayer question_sound, result_sound;
    int heart = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back = (ImageView) findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                Intent screen_main = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(screen_main);
           }
       });

        ImageView choose_1 = (ImageView)findViewById(R.id.so_1);
        ImageView choose_2 = (ImageView)findViewById(R.id.so_2);
        ImageView choose_3 = (ImageView)findViewById(R.id.so_3);
        ImageView choose_4 = (ImageView)findViewById(R.id.so_4);
        ImageView choose_5 = (ImageView)findViewById(R.id.so_5);
        ImageView choose_6 = (ImageView)findViewById(R.id.so_6);
        ImageView choose_7 = (ImageView)findViewById(R.id.so_7);
        ImageView choose_8 = (ImageView)findViewById(R.id.so_8);
        ImageView choose_9 = (ImageView)findViewById(R.id.so_9);
        ImageView choose_10 = (ImageView)findViewById(R.id.so_10);

        Random r = new Random();
        int n = r.nextInt(9); n++;
        //int n = 1;
        question = (ImageView)findViewById(R.id.cau_hoi);
        switch (n){
            case 1:
                question.setImageResource(R.drawable.cau_hoi_so_1);
                question_sound = MediaPlayer.create(this,R.raw.so_1);
                question_sound.start();
                cat = (ImageView)findViewById(R.id.imageView4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(),R.raw.so_1);
                        question_sound.start();
                    }
                });
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1, 1, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2, 1, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3, 1, heart);
                    }
                });
                choose_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4, 1, heart);
                    }
                });
                choose_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5, 1, heart);
                    }
                });
                choose_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6, 1, heart);
                    }
                });
                choose_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7, 1, heart);
                    }
                });
                choose_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8, 1, heart);
                    }
                });
                choose_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       checkAnswer(9, 1, heart);
                   }
                });
                choose_10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10, 1, heart);
                    }
               });
                break;
            case 2:
                question.setImageResource(R.drawable.cau_hoi_so_2);
                question_sound = MediaPlayer.create(this,R.raw.so_2);
                question_sound.start();
                cat = (ImageView)findViewById(R.id.imageView4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(),R.raw.so_2);
                        question_sound.start();
                    }
                });
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1, 2, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2, 2, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3, 2, heart);
                    }
                });
                choose_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4, 2, heart);
                    }
                });
                choose_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5, 2, heart);
                    }
                });
                choose_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6, 2, heart);
                    }
                });
                choose_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7, 2, heart);
                    }
                });
                choose_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8, 2, heart);
                    }
                });
                choose_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9, 2, heart);
                    }
                });
                choose_10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10, 2, heart);
                    }
                });
                break;
            case 3:
                question.setImageResource(R.drawable.cau_hoi_so_3);
                question_sound = MediaPlayer.create(this,R.raw.so_3);
                question_sound.start();
                cat = (ImageView)findViewById(R.id.imageView4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(),R.raw.so_3);
                        question_sound.start();
                    }
                });
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1, 3, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2, 3, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3, 3, heart);
                    }
                });
                choose_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4, 3, heart);
                    }
                });
                choose_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5, 3, heart);
                    }
                });
                choose_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6, 3, heart);
                    }
                });
                choose_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7, 3, heart);
                    }
                });
                choose_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8, 3, heart);
                    }
                });
                choose_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9, 3, heart);
                    }
                });
                choose_10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10, 3, heart);
                    }
                });
                break;
            case 4:
                question.setImageResource(R.drawable.cau_hoi_so_4);
                question_sound = MediaPlayer.create(this,R.raw.so_4);
                question_sound.start();
                cat = (ImageView)findViewById(R.id.imageView4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(),R.raw.so_4);
                        question_sound.start();
                    }
                });
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1, 4, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2, 4, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3, 4, heart);
                    }
                });
                choose_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4, 4, heart);
                    }
                });
                choose_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5, 4, heart);
                    }
                });
                choose_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6, 4, heart);
                    }
                });
                choose_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7, 4, heart);
                    }
                });
                choose_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8, 4, heart);
                    }
                });
                choose_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9, 4, heart);
                    }
                });
                choose_10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10, 4, heart);
                    }
                });
                break;
            case 5:
                question.setImageResource(R.drawable.cau_hoi_so_5);
                question_sound = MediaPlayer.create(this,R.raw.so_5);
                question_sound.start();
                cat = (ImageView)findViewById(R.id.imageView4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(),R.raw.so_5);
                        question_sound.start();
                    }
                });
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1, 5, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2, 5, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3, 5, heart
                        );
                    }
                });
                choose_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4, 5, heart);
                    }
                });
                choose_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5, 5, heart);
                    }
                });
                choose_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6, 5, heart);
                    }
                });
                choose_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7, 5, heart);
                    }
                });
                choose_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8, 5, heart);
                    }
                });
                choose_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9, 5, heart);
                    }
                });
                choose_10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10, 5, heart);
                    }
                });
                break;
            case 6:
                question.setImageResource(R.drawable.cau_hoi_so_6);
                question_sound = MediaPlayer.create(this,R.raw.so_6);
                question_sound.start();
                cat = (ImageView)findViewById(R.id.imageView4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(),R.raw.so_6);
                        question_sound.start();
                    }
                });
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1, 6, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2, 6, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3, 6, heart);
                    }
                });
                choose_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4, 6, heart);
                    }
                });
                choose_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5, 6, heart);
                    }
                });
                choose_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6, 6, heart);
                    }
                });
                choose_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7, 6, heart);
                    }
                });
                choose_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8, 6, heart);
                    }
                });
                choose_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9, 6, heart);
                    }
                });
                choose_10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10, 6, heart);
                    }
                });
                break;
            case 7:
                question.setImageResource(R.drawable.cau_hoi_so_7);
                question_sound = MediaPlayer.create(this,R.raw.so_7);
                question_sound.start();
                cat = (ImageView)findViewById(R.id.imageView4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(),R.raw.so_7);
                        question_sound.start();
                    }
                });
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1, 7, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2, 7, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3, 7, heart);
                    }
                });
                choose_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4, 7, heart);
                    }
                });
                choose_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5, 7, heart);
                    }
                });
                choose_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6, 7, heart);
                    }
                });
                choose_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7, 7, heart);
                    }
                });
                choose_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8, 7, heart);
                    }
                });
                choose_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9, 7, heart);
                    }
                });
                choose_10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10, 7, heart);
                    }
                });
                break;
            case 8:
                question.setImageResource(R.drawable.cau_hoi_so_8);
                question_sound = MediaPlayer.create(this,R.raw.so_8);
                question_sound.start();
                cat = (ImageView)findViewById(R.id.imageView4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(),R.raw.so_8);
                        question_sound.start();
                    }
                });
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1, 8, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2, 8, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3, 8, heart);
                    }
                });
                choose_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4, 8, heart);
                    }
                });
                choose_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5, 8, heart);
                    }
                });
                choose_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6, 8, heart);
                    }
                });
                choose_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7, 8, heart);
                    }
                });
                choose_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8, 8, heart);
                    }
                });
                choose_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9, 8, heart);
                    }
                });
                choose_10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10, 8, heart);
                    }
                });
                break;
            case 9:
                question.setImageResource(R.drawable.cau_hoi_so_9);
                question_sound = MediaPlayer.create(this,R.raw.so_9);
                question_sound.start();
                cat = (ImageView)findViewById(R.id.imageView4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(),R.raw.so_9);
                        question_sound.start();
                    }
                });
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1, 9, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2, 9, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3, 9, heart);
                    }
                });
                choose_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4, 9, heart);
                    }
                });
                choose_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5, 9, heart);
                    }
                });
                choose_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6, 9, heart);
                    }
                });
                choose_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7, 9, heart);
                    }
                });
                choose_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8, 9, heart);
                    }
                });
                choose_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9, 9, heart);
                    }
                });
                choose_10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10, 9, heart);
                    }
                });
                break;
            case 10:
                question.setImageResource(R.drawable.cau_hoi_so_10);
                question_sound = MediaPlayer.create(this,R.raw.so_10);
                question_sound.start();
                cat = (ImageView)findViewById(R.id.imageView4);
                cat.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        question_sound = MediaPlayer.create(getApplicationContext(),R.raw.so_10);
                        question_sound.start();
                    }
                });
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1, 10, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2, 10, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3, 10, heart);
                    }
                });
                choose_4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4, 10, heart);
                    }
                });
                choose_5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5, 10, heart);
                    }
                });
                choose_6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6, 10, heart);
                    }
                });
                choose_7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7, 10, heart);
                    }
                });
                choose_8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8, 10, heart);
                    }
                });
                choose_9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9, 10, heart);
                    }
                });
                choose_10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10, 10, heart);
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
            ImageView heart_1, heart_2;
            heart_1 = (ImageView)findViewById(R.id.count_1);
            heart_2 = (ImageView)findViewById(R.id.count_2);
            while (heart > 0){
                int count = heart / 10;
                if(heart < 10){
                    if (count == 1){
                        heart_2.setImageResource(R.drawable.noti_1);
                    }
                    if (count == 2){
                        heart_2.setImageResource(R.drawable.noti_2);
                    }
                    if (count == 3){
                        heart_2.setImageResource(R.drawable.noti_3);
                    }
                    if (count == 4){
                        heart_2.setImageResource(R.drawable.noti_4);
                    }
                    if (count == 5){
                        heart_2.setImageResource(R.drawable.noti_5);
                    }
                    if (count == 6){
                        heart_2.setImageResource(R.drawable.noti_6);
                    }
                    if (count == 7){
                        heart_2.setImageResource(R.drawable.noti_7);
                    }
                    if (count == 8){
                        heart_2.setImageResource(R.drawable.noti_8);
                    }
                    if (count == 9){
                        heart_2.setImageResource(R.drawable.noti_9);
                    }
                }
                else {
                    if (count == 1){
                        heart_1.setImageResource(R.drawable.noti_1);
                    }
                    if (count == 2){
                        heart_1.setImageResource(R.drawable.noti_2);
                    }
                    if (count == 3){
                        heart_1.setImageResource(R.drawable.noti_3);
                    }
                    if (count == 4){
                        heart_1.setImageResource(R.drawable.noti_4);
                    }
                    if (count == 5){
                        heart_1.setImageResource(R.drawable.noti_5);
                    }
                    if (count == 6){
                        heart_1.setImageResource(R.drawable.noti_6);
                    }
                    if (count == 7){
                        heart_1.setImageResource(R.drawable.noti_7);
                    }
                    if (count == 8){
                        heart_1.setImageResource(R.drawable.noti_8);
                    }
                    if (count == 9){
                        heart_1.setImageResource(R.drawable.noti_9);
                    }
                }
                heart = heart % 10;
            }

        }
        else {
            result_sound = MediaPlayer.create(this,R.raw.sai);
            result_sound.start();
        }
    }
}
