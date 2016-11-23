package com.k63b.kid_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

import static com.k63b.kid_game.R.raw.o;

public class Main3Activity extends AppCompatActivity {
    ImageView back, question, cat;
    MediaPlayer question_sound, result_sound;
    int heart = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        back = (ImageView)findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen_main = new Intent(Main3Activity.this,MainActivity.class);
                startActivity(screen_main);
            }
        });
        ImageView choose_1 = (ImageView)findViewById(R.id.so_1);
        ImageView choose_2 = (ImageView)findViewById(R.id.so_2);
        ImageView choose_3 = (ImageView)findViewById(R.id.so_3);

        ImageView count_1 = (ImageView)findViewById(R.id.dem_1);
        ImageView count_2 = (ImageView)findViewById(R.id.dem_2);
        ImageView count_3 = (ImageView)findViewById(R.id.dem_3);
        ImageView count_4 = (ImageView)findViewById(R.id.dem_4);
        ImageView count_5 = (ImageView)findViewById(R.id.dem_5);
        ImageView count_6 = (ImageView)findViewById(R.id.dem_6);
        ImageView count_7 = (ImageView)findViewById(R.id.dem_7);
        ImageView count_8 = (ImageView)findViewById(R.id.dem_8);
        ImageView count_9 = (ImageView)findViewById(R.id.dem_9);
        ImageView count_10 = (ImageView)findViewById(R.id.dem_10);
        cat = (ImageView)findViewById(R.id.cat);
        Intent i = getIntent();
        heart = i.getIntExtra("heart", 0);
        checkHeart(heart);

        Random r = new Random();
        int n = r.nextInt(9); n++;
        //int n = 1;
        question = (ImageView)findViewById(R.id.cau_hoi);
        switch (n){
            case 1:
                Random r1 = new Random();
                int n1 = r1.nextInt(9); n1++;
                switch (n1){
                    case 1:
                        count_1.setImageResource(R.drawable.dem_dau);
                        count_2.setImageResource(R.drawable.dem_trong);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 2:
                        count_1.setImageResource(R.drawable.dem_carot);
                        count_2.setImageResource(R.drawable.dem_trong);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_carot);
                        question_sound = MediaPlayer.create(this,R.raw.carot);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.carot);
                                question_sound.start();
                            }
                        });
                        break;
                    case 3:
                        count_1.setImageResource(R.drawable.dem_chim);
                        count_2.setImageResource(R.drawable.dem_trong);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_chim);
                        question_sound = MediaPlayer.create(this,R.raw.chim);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.chim);
                                question_sound.start();
                            }
                        });
                        break;
                    case 4:
                        count_1.setImageResource(R.drawable.dem_dua);
                        count_2.setImageResource(R.drawable.dem_trong);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua);
                        question_sound = MediaPlayer.create(this,R.raw.dua);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                                question_sound.start();
                            }
                        });
                        break;
                    case 5:
                        count_1.setImageResource(R.drawable.dem_den);
                        count_2.setImageResource(R.drawable.dem_trong);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_den);
                        question_sound = MediaPlayer.create(this,R.raw.den);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.den);
                                question_sound.start();
                            }
                        });
                        break;
                    case 6:
                        count_1.setImageResource(R.drawable.dem_dua_hau);
                        count_2.setImageResource(R.drawable.dem_trong);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua_hau);
                        question_sound = MediaPlayer.create(this,R.raw.dua_hau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua_hau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 7:
                        count_1.setImageResource(R.drawable.dem_tao);
                        count_2.setImageResource(R.drawable.dem_trong);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_tao);
                        question_sound = MediaPlayer.create(this,R.raw.tao);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.tao);
                                question_sound.start();
                            }
                        });
                        break;
                    case 8:
                        count_1.setImageResource(R.drawable.dem_hoa);
                        count_2.setImageResource(R.drawable.dem_trong);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_hoa);
                        question_sound = MediaPlayer.create(this,R.raw.hoa);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.hoa);
                                question_sound.start();
                            }
                        });
                        break;
                    case 9:
                        count_1.setImageResource(R.drawable.dem_o);
                        count_2.setImageResource(R.drawable.dem_trong);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_o);
                        question_sound = MediaPlayer.create(this, o);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(), o);
                                question_sound.start();
                            }
                        });
                        break;
                    case 10:
                        count_1.setImageResource(R.drawable.dem_oto);
                        count_2.setImageResource(R.drawable.dem_trong);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_oto);
                        question_sound = MediaPlayer.create(this,R.raw.oto);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.oto);
                                question_sound.start();
                            }
                        });
                        break;
                }
                choose_1.setImageResource(R.drawable.so_1);
                choose_2.setImageResource(R.drawable.so_2);
                choose_3.setImageResource(R.drawable.so_3);
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1,1, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2,1, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3,1, heart);
                    }
                });
                break;
            case 2:
                r1 = new Random();
                n1 = r1.nextInt(9); n1++;
                switch (n1){
                    case 1:
                        count_1.setImageResource(R.drawable.dem_dau);
                        count_2.setImageResource(R.drawable.dem_dau);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 2:
                        count_1.setImageResource(R.drawable.dem_carot);
                        count_2.setImageResource(R.drawable.dem_carot);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_carot);
                        question_sound = MediaPlayer.create(this,R.raw.carot);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.carot);
                                question_sound.start();
                            }
                        });
                        break;
                    case 3:
                        count_1.setImageResource(R.drawable.dem_chim);
                        count_2.setImageResource(R.drawable.dem_chim);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_chim);
                        question_sound = MediaPlayer.create(this,R.raw.chim);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.chim);
                                question_sound.start();
                            }
                        });
                        break;
                    case 4:
                        count_1.setImageResource(R.drawable.dem_dua);
                        count_2.setImageResource(R.drawable.dem_dua);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua);
                        question_sound = MediaPlayer.create(this,R.raw.dua);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                                question_sound.start();
                            }
                        });
                        break;
                    case 5:
                        count_1.setImageResource(R.drawable.dem_den);
                        count_2.setImageResource(R.drawable.dem_den);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_den);
                        question_sound = MediaPlayer.create(this,R.raw.den);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.den);
                                question_sound.start();
                            }
                        });
                        break;
                    case 6:
                        count_1.setImageResource(R.drawable.dem_dua_hau);
                        count_2.setImageResource(R.drawable.dem_dua_hau);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua_hau);
                        question_sound = MediaPlayer.create(this,R.raw.dua_hau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua_hau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 7:
                        count_1.setImageResource(R.drawable.dem_tao);
                        count_2.setImageResource(R.drawable.dem_tao);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_tao);
                        question_sound = MediaPlayer.create(this,R.raw.tao);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.tao);
                                question_sound.start();
                            }
                        });
                        break;
                    case 8:
                        count_1.setImageResource(R.drawable.dem_hoa);
                        count_2.setImageResource(R.drawable.dem_hoa);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_hoa);
                        question_sound = MediaPlayer.create(this,R.raw.hoa);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.hoa);
                                question_sound.start();
                            }
                        });
                        break;
                    case 9:
                        count_1.setImageResource(R.drawable.dem_o);
                        count_2.setImageResource(R.drawable.dem_o);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_o);
                        question_sound = MediaPlayer.create(this, o);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(), o);
                                question_sound.start();
                            }
                        });
                        break;
                    case 10:
                        count_1.setImageResource(R.drawable.dem_oto);
                        count_2.setImageResource(R.drawable.dem_oto);
                        count_3.setImageResource(R.drawable.dem_trong);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_oto);
                        question_sound = MediaPlayer.create(this,R.raw.oto);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.oto);
                                question_sound.start();
                            }
                        });
                        break;
                }
                choose_1.setImageResource(R.drawable.so_4);
                choose_2.setImageResource(R.drawable.so_2);
                choose_3.setImageResource(R.drawable.so_5);
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4,2, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2,2, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5,2, heart);
                    }
                });
                break;
            case 3:
                r1 = new Random();
                n1 = r1.nextInt(9); n1++;
                switch (n1){
                    case 1:
                        count_1.setImageResource(R.drawable.dem_dau);
                        count_2.setImageResource(R.drawable.dem_dau);
                        count_3.setImageResource(R.drawable.dem_dau);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 2:
                        count_1.setImageResource(R.drawable.dem_carot);
                        count_2.setImageResource(R.drawable.dem_carot);
                        count_3.setImageResource(R.drawable.dem_carot);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_carot);
                        question_sound = MediaPlayer.create(this,R.raw.carot);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.carot);
                                question_sound.start();
                            }
                        });
                        break;
                    case 3:
                        count_1.setImageResource(R.drawable.dem_chim);
                        count_2.setImageResource(R.drawable.dem_chim);
                        count_3.setImageResource(R.drawable.dem_chim);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_chim);
                        question_sound = MediaPlayer.create(this,R.raw.chim);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.chim);
                                question_sound.start();
                            }
                        });
                        break;
                    case 4:
                        count_1.setImageResource(R.drawable.dem_dua);
                        count_2.setImageResource(R.drawable.dem_dua);
                        count_3.setImageResource(R.drawable.dem_dua);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dua);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                                question_sound.start();
                            }
                        });
                        break;
                    case 5:
                        count_1.setImageResource(R.drawable.dem_den);
                        count_2.setImageResource(R.drawable.dem_den);
                        count_3.setImageResource(R.drawable.dem_den);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_den);
                        question_sound = MediaPlayer.create(this,R.raw.den);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.den);
                                question_sound.start();
                            }
                        });
                        break;
                    case 6:
                        count_1.setImageResource(R.drawable.dem_dua_hau);
                        count_2.setImageResource(R.drawable.dem_dua_hau);
                        count_3.setImageResource(R.drawable.dem_dua_hau);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua_hau);
                        question_sound = MediaPlayer.create(this,R.raw.dua_hau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua_hau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 7:
                        count_1.setImageResource(R.drawable.dem_tao);
                        count_2.setImageResource(R.drawable.dem_tao);
                        count_3.setImageResource(R.drawable.dem_tao);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_tao);
                        question_sound = MediaPlayer.create(this,R.raw.tao);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.tao);
                                question_sound.start();
                            }
                        });
                        break;
                    case 8:
                        count_1.setImageResource(R.drawable.dem_hoa);
                        count_2.setImageResource(R.drawable.dem_hoa);
                        count_3.setImageResource(R.drawable.dem_hoa);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_hoa);
                        question_sound = MediaPlayer.create(this,R.raw.hoa);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.hoa);
                                question_sound.start();
                            }
                        });
                        break;
                    case 9:
                        count_1.setImageResource(R.drawable.dem_o);
                        count_2.setImageResource(R.drawable.dem_o);
                        count_3.setImageResource(R.drawable.dem_o);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_o);
                        question_sound = MediaPlayer.create(this, o);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(), o);
                                question_sound.start();
                            }
                        });
                        break;
                    case 10:
                        count_1.setImageResource(R.drawable.dem_oto);
                        count_2.setImageResource(R.drawable.dem_oto);
                        count_3.setImageResource(R.drawable.dem_oto);
                        count_4.setImageResource(R.drawable.dem_trong);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_oto);
                        question_sound = MediaPlayer.create(this,R.raw.oto);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.oto);
                                question_sound.start();
                            }
                        });
                        break;
                }
                choose_1.setImageResource(R.drawable.so_1);
                choose_2.setImageResource(R.drawable.so_4);
                choose_3.setImageResource(R.drawable.so_3);
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1,3, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4,3, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3,3, heart);
                    }
                });
                break;
            case 4:
                r1 = new Random();
                n1 = r1.nextInt(9); n1++;
                switch (n1){
                    case 1:
                        count_1.setImageResource(R.drawable.dem_dau);
                        count_2.setImageResource(R.drawable.dem_dau);
                        count_3.setImageResource(R.drawable.dem_dau);
                        count_4.setImageResource(R.drawable.dem_dau);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 2:
                        count_1.setImageResource(R.drawable.dem_carot);
                        count_2.setImageResource(R.drawable.dem_carot);
                        count_3.setImageResource(R.drawable.dem_carot);
                        count_4.setImageResource(R.drawable.dem_carot);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_carot);
                        question_sound = MediaPlayer.create(this,R.raw.carot);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.carot);
                                question_sound.start();
                            }
                        });
                        break;
                    case 3:
                        count_1.setImageResource(R.drawable.dem_chim);
                        count_2.setImageResource(R.drawable.dem_chim);
                        count_3.setImageResource(R.drawable.dem_chim);
                        count_4.setImageResource(R.drawable.dem_chim);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_chim);
                        question_sound = MediaPlayer.create(this,R.raw.chim);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.chim);
                                question_sound.start();
                            }
                        });
                        break;
                    case 4:
                        count_1.setImageResource(R.drawable.dem_dua);
                        count_2.setImageResource(R.drawable.dem_dua);
                        count_3.setImageResource(R.drawable.dem_dua);
                        count_4.setImageResource(R.drawable.dem_dua);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua);
                        question_sound = MediaPlayer.create(this,R.raw.dua);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                                question_sound.start();
                            }
                        });
                        break;
                    case 5:
                        count_1.setImageResource(R.drawable.dem_den);
                        count_2.setImageResource(R.drawable.dem_den);
                        count_3.setImageResource(R.drawable.dem_den);
                        count_4.setImageResource(R.drawable.dem_den);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_den);
                        question_sound = MediaPlayer.create(this,R.raw.den);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.den);
                                question_sound.start();
                            }
                        });
                        break;
                    case 6:
                        count_1.setImageResource(R.drawable.dem_dua_hau);
                        count_2.setImageResource(R.drawable.dem_dua_hau);
                        count_3.setImageResource(R.drawable.dem_dua_hau);
                        count_4.setImageResource(R.drawable.dem_dua_hau);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua_hau);
                        question_sound = MediaPlayer.create(this,R.raw.dua_hau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua_hau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 7:
                        count_1.setImageResource(R.drawable.dem_tao);
                        count_2.setImageResource(R.drawable.dem_tao);
                        count_3.setImageResource(R.drawable.dem_tao);
                        count_4.setImageResource(R.drawable.dem_tao);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_tao);
                        question_sound = MediaPlayer.create(this,R.raw.tao);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.tao);
                                question_sound.start();
                            }
                        });
                        break;
                    case 8:
                        count_1.setImageResource(R.drawable.dem_hoa);
                        count_2.setImageResource(R.drawable.dem_hoa);
                        count_3.setImageResource(R.drawable.dem_hoa);
                        count_3.setImageResource(R.drawable.dem_hoa);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_hoa);
                        question_sound = MediaPlayer.create(this,R.raw.hoa);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.hoa);
                                question_sound.start();
                            }
                        });
                        break;
                    case 9:
                        count_1.setImageResource(R.drawable.dem_o);
                        count_2.setImageResource(R.drawable.dem_o);
                        count_3.setImageResource(R.drawable.dem_o);
                        count_4.setImageResource(R.drawable.dem_o);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_o);
                        question_sound = MediaPlayer.create(this, o);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(), o);
                                question_sound.start();
                            }
                        });
                        break;
                    case 10:
                        count_1.setImageResource(R.drawable.dem_oto);
                        count_2.setImageResource(R.drawable.dem_oto);
                        count_3.setImageResource(R.drawable.dem_oto);
                        count_4.setImageResource(R.drawable.dem_oto);
                        count_5.setImageResource(R.drawable.dem_trong);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_oto);
                        question_sound = MediaPlayer.create(this,R.raw.oto);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.oto);
                                question_sound.start();
                            }
                        });
                        break;
                }
                choose_1.setImageResource(R.drawable.so_3);
                choose_2.setImageResource(R.drawable.so_4);
                choose_3.setImageResource(R.drawable.so_5);
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3,4, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4,4, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5,4, heart);
                    }
                });
                break;
            case 5:
                r1 = new Random();
                n1 = r1.nextInt(9); n1++;
                switch (n1){
                    case 1:
                        count_1.setImageResource(R.drawable.dem_dau);
                        count_2.setImageResource(R.drawable.dem_dau);
                        count_3.setImageResource(R.drawable.dem_dau);
                        count_4.setImageResource(R.drawable.dem_dau);
                        count_5.setImageResource(R.drawable.dem_dau);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 2:
                        count_1.setImageResource(R.drawable.dem_carot);
                        count_2.setImageResource(R.drawable.dem_carot);
                        count_3.setImageResource(R.drawable.dem_carot);
                        count_4.setImageResource(R.drawable.dem_carot);
                        count_5.setImageResource(R.drawable.dem_carot);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_carot);
                        question_sound = MediaPlayer.create(this,R.raw.carot);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.carot);
                                question_sound.start();
                            }
                        });
                        break;
                    case 3:
                        count_1.setImageResource(R.drawable.dem_chim);
                        count_2.setImageResource(R.drawable.dem_chim);
                        count_3.setImageResource(R.drawable.dem_chim);
                        count_4.setImageResource(R.drawable.dem_chim);
                        count_5.setImageResource(R.drawable.dem_chim);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_chim);
                        question_sound = MediaPlayer.create(this,R.raw.chim);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.chim);
                                question_sound.start();
                            }
                        });
                        break;
                    case 4:
                        count_1.setImageResource(R.drawable.dem_dua);
                        count_2.setImageResource(R.drawable.dem_dua);
                        count_3.setImageResource(R.drawable.dem_dua);
                        count_4.setImageResource(R.drawable.dem_dua);
                        count_5.setImageResource(R.drawable.dem_dua);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua);
                        question_sound = MediaPlayer.create(this,R.raw.dua);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                                question_sound.start();
                            }
                        });
                        break;
                    case 5:
                        count_1.setImageResource(R.drawable.dem_den);
                        count_2.setImageResource(R.drawable.dem_den);
                        count_3.setImageResource(R.drawable.dem_den);
                        count_4.setImageResource(R.drawable.dem_den);
                        count_5.setImageResource(R.drawable.dem_den);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_den);
                        question_sound = MediaPlayer.create(this,R.raw.den);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.den);
                                question_sound.start();
                            }
                        });
                        break;
                    case 6:
                        count_1.setImageResource(R.drawable.dem_dua_hau);
                        count_2.setImageResource(R.drawable.dem_dua_hau);
                        count_3.setImageResource(R.drawable.dem_dua_hau);
                        count_4.setImageResource(R.drawable.dem_dua_hau);
                        count_5.setImageResource(R.drawable.dem_dua_hau);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua_hau);
                        question_sound = MediaPlayer.create(this,R.raw.dua_hau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua_hau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 7:
                        count_1.setImageResource(R.drawable.dem_tao);
                        count_2.setImageResource(R.drawable.dem_tao);
                        count_3.setImageResource(R.drawable.dem_tao);
                        count_4.setImageResource(R.drawable.dem_tao);
                        count_5.setImageResource(R.drawable.dem_tao);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_tao);
                        question_sound = MediaPlayer.create(this,R.raw.tao);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.tao);
                                question_sound.start();
                            }
                        });
                        break;
                    case 8:
                        count_1.setImageResource(R.drawable.dem_hoa);
                        count_2.setImageResource(R.drawable.dem_hoa);
                        count_3.setImageResource(R.drawable.dem_hoa);
                        count_4.setImageResource(R.drawable.dem_hoa);
                        count_5.setImageResource(R.drawable.dem_hoa);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_hoa);
                        question_sound = MediaPlayer.create(this,R.raw.hoa);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.hoa);
                                question_sound.start();
                            }
                        });
                        break;
                    case 9:
                        count_1.setImageResource(R.drawable.dem_o);
                        count_2.setImageResource(R.drawable.dem_o);
                        count_3.setImageResource(R.drawable.dem_o);
                        count_4.setImageResource(R.drawable.dem_o);
                        count_5.setImageResource(R.drawable.dem_o);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_o);
                        question_sound = MediaPlayer.create(this, o);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(), o);
                                question_sound.start();
                            }
                        });
                        break;
                    case 10:
                        count_1.setImageResource(R.drawable.dem_oto);
                        count_2.setImageResource(R.drawable.dem_oto);
                        count_3.setImageResource(R.drawable.dem_oto);
                        count_4.setImageResource(R.drawable.dem_oto);
                        count_5.setImageResource(R.drawable.dem_oto);
                        count_6.setImageResource(R.drawable.dem_trong);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_oto);
                        question_sound = MediaPlayer.create(this,R.raw.oto);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.oto);
                                question_sound.start();
                            }
                        });
                        break;
                }
                choose_1.setImageResource(R.drawable.so_2);
                choose_2.setImageResource(R.drawable.so_4);
                choose_3.setImageResource(R.drawable.so_5);
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2,5, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4,5, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5,5, heart);
                    }
                });
                break;
            case 6:
                r1 = new Random();
                n1 = r1.nextInt(9); n1++;
                switch (n1){
                    case 1:
                        count_1.setImageResource(R.drawable.dem_dau);
                        count_2.setImageResource(R.drawable.dem_dau);
                        count_3.setImageResource(R.drawable.dem_dau);
                        count_4.setImageResource(R.drawable.dem_dau);
                        count_5.setImageResource(R.drawable.dem_dau);
                        count_6.setImageResource(R.drawable.dem_dau);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 2:
                        count_1.setImageResource(R.drawable.dem_carot);
                        count_2.setImageResource(R.drawable.dem_carot);
                        count_3.setImageResource(R.drawable.dem_carot);
                        count_4.setImageResource(R.drawable.dem_carot);
                        count_5.setImageResource(R.drawable.dem_carot);
                        count_6.setImageResource(R.drawable.dem_carot);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_carot);
                        question_sound = MediaPlayer.create(this,R.raw.carot);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.carot);
                                question_sound.start();
                            }
                        });
                        break;
                    case 3:
                        count_1.setImageResource(R.drawable.dem_chim);
                        count_2.setImageResource(R.drawable.dem_chim);
                        count_3.setImageResource(R.drawable.dem_chim);
                        count_4.setImageResource(R.drawable.dem_chim);
                        count_5.setImageResource(R.drawable.dem_chim);
                        count_6.setImageResource(R.drawable.dem_chim);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_chim);
                        question_sound = MediaPlayer.create(this,R.raw.chim);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.chim);
                                question_sound.start();
                            }
                        });
                        break;
                    case 4:
                        count_1.setImageResource(R.drawable.dem_dua);
                        count_2.setImageResource(R.drawable.dem_dua);
                        count_3.setImageResource(R.drawable.dem_dua);
                        count_4.setImageResource(R.drawable.dem_dua);
                        count_5.setImageResource(R.drawable.dem_dua);
                        count_6.setImageResource(R.drawable.dem_dua);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua);
                        question_sound = MediaPlayer.create(this,R.raw.dua);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                                question_sound.start();
                            }
                        });
                        break;
                    case 5:
                        count_1.setImageResource(R.drawable.dem_den);
                        count_2.setImageResource(R.drawable.dem_den);
                        count_3.setImageResource(R.drawable.dem_den);
                        count_4.setImageResource(R.drawable.dem_den);
                        count_5.setImageResource(R.drawable.dem_den);
                        count_6.setImageResource(R.drawable.dem_den);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_den);
                        question_sound = MediaPlayer.create(this,R.raw.den);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.den);
                                question_sound.start();
                            }
                        });
                        break;
                    case 6:
                        count_1.setImageResource(R.drawable.dem_dua_hau);
                        count_2.setImageResource(R.drawable.dem_dua_hau);
                        count_3.setImageResource(R.drawable.dem_dua_hau);
                        count_4.setImageResource(R.drawable.dem_dua_hau);
                        count_5.setImageResource(R.drawable.dem_dua_hau);
                        count_6.setImageResource(R.drawable.dem_dua_hau);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua_hau);
                        question_sound = MediaPlayer.create(this,R.raw.dua_hau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua_hau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 7:
                        count_1.setImageResource(R.drawable.dem_tao);
                        count_2.setImageResource(R.drawable.dem_tao);
                        count_3.setImageResource(R.drawable.dem_tao);
                        count_4.setImageResource(R.drawable.dem_tao);
                        count_5.setImageResource(R.drawable.dem_tao);
                        count_6.setImageResource(R.drawable.dem_tao);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_tao);
                        question_sound = MediaPlayer.create(this,R.raw.tao);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.tao);
                                question_sound.start();
                            }
                        });
                        break;
                    case 8:
                        count_1.setImageResource(R.drawable.dem_hoa);
                        count_2.setImageResource(R.drawable.dem_hoa);
                        count_3.setImageResource(R.drawable.dem_hoa);
                        count_4.setImageResource(R.drawable.dem_hoa);
                        count_5.setImageResource(R.drawable.dem_hoa);
                        count_6.setImageResource(R.drawable.dem_hoa);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_hoa);
                        question_sound = MediaPlayer.create(this,R.raw.hoa);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.hoa);
                                question_sound.start();
                            }
                        });
                        break;
                    case 9:
                        count_1.setImageResource(R.drawable.dem_o);
                        count_2.setImageResource(R.drawable.dem_o);
                        count_3.setImageResource(R.drawable.dem_o);
                        count_4.setImageResource(R.drawable.dem_o);
                        count_5.setImageResource(R.drawable.dem_o);
                        count_6.setImageResource(R.drawable.dem_o);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_o);
                        question_sound = MediaPlayer.create(this, o);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(), o);
                                question_sound.start();
                            }
                        });
                        break;
                    case 10:
                        count_1.setImageResource(R.drawable.dem_oto);
                        count_2.setImageResource(R.drawable.dem_oto);
                        count_3.setImageResource(R.drawable.dem_oto);
                        count_4.setImageResource(R.drawable.dem_oto);
                        count_5.setImageResource(R.drawable.dem_oto);
                        count_6.setImageResource(R.drawable.dem_oto);
                        count_7.setImageResource(R.drawable.dem_trong);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_oto);
                        question_sound = MediaPlayer.create(this,R.raw.oto);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.oto);
                                question_sound.start();
                            }
                        });
                        break;
                }
                choose_1.setImageResource(R.drawable.so_4);
                choose_2.setImageResource(R.drawable.so_5);
                choose_3.setImageResource(R.drawable.so_6);
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4,6, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(5,6, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6,6, heart);
                    }
                });
                break;
            case 7:
                r1 = new Random();
                n1 = r1.nextInt(9); n1++;
                switch (n1){
                    case 1:
                        count_1.setImageResource(R.drawable.dem_dau);
                        count_2.setImageResource(R.drawable.dem_dau);
                        count_3.setImageResource(R.drawable.dem_dau);
                        count_4.setImageResource(R.drawable.dem_dau);
                        count_5.setImageResource(R.drawable.dem_dau);
                        count_6.setImageResource(R.drawable.dem_dau);
                        count_7.setImageResource(R.drawable.dem_dau);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 2:
                        count_1.setImageResource(R.drawable.dem_carot);
                        count_2.setImageResource(R.drawable.dem_carot);
                        count_3.setImageResource(R.drawable.dem_carot);
                        count_4.setImageResource(R.drawable.dem_carot);
                        count_5.setImageResource(R.drawable.dem_carot);
                        count_6.setImageResource(R.drawable.dem_carot);
                        count_7.setImageResource(R.drawable.dem_carot);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_carot);
                        question_sound = MediaPlayer.create(this,R.raw.carot);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.carot);
                                question_sound.start();
                            }
                        });
                        break;
                    case 3:
                        count_1.setImageResource(R.drawable.dem_chim);
                        count_2.setImageResource(R.drawable.dem_chim);
                        count_3.setImageResource(R.drawable.dem_chim);
                        count_4.setImageResource(R.drawable.dem_chim);
                        count_5.setImageResource(R.drawable.dem_chim);
                        count_6.setImageResource(R.drawable.dem_chim);
                        count_7.setImageResource(R.drawable.dem_chim);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_chim);
                        question_sound = MediaPlayer.create(this,R.raw.chim);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.chim);
                                question_sound.start();
                            }
                        });
                        break;
                    case 4:
                        count_1.setImageResource(R.drawable.dem_dua);
                        count_2.setImageResource(R.drawable.dem_dua);
                        count_3.setImageResource(R.drawable.dem_dua);
                        count_4.setImageResource(R.drawable.dem_dua);
                        count_5.setImageResource(R.drawable.dem_dua);
                        count_6.setImageResource(R.drawable.dem_dua);
                        count_7.setImageResource(R.drawable.dem_dua);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua);
                        question_sound = MediaPlayer.create(this,R.raw.dua);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                                question_sound.start();
                            }
                        });
                        break;
                    case 5:
                        count_1.setImageResource(R.drawable.dem_den);
                        count_2.setImageResource(R.drawable.dem_den);
                        count_3.setImageResource(R.drawable.dem_den);
                        count_4.setImageResource(R.drawable.dem_den);
                        count_5.setImageResource(R.drawable.dem_den);
                        count_6.setImageResource(R.drawable.dem_den);
                        count_7.setImageResource(R.drawable.dem_den);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_den);
                        question_sound = MediaPlayer.create(this,R.raw.den);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.den);
                                question_sound.start();
                            }
                        });
                        break;
                    case 6:
                        count_1.setImageResource(R.drawable.dem_dua_hau);
                        count_2.setImageResource(R.drawable.dem_dua_hau);
                        count_3.setImageResource(R.drawable.dem_dua_hau);
                        count_4.setImageResource(R.drawable.dem_dua_hau);
                        count_5.setImageResource(R.drawable.dem_dua_hau);
                        count_6.setImageResource(R.drawable.dem_dua_hau);
                        count_7.setImageResource(R.drawable.dem_dua_hau);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua_hau);
                        question_sound = MediaPlayer.create(this,R.raw.dua_hau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua_hau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 7:
                        count_1.setImageResource(R.drawable.dem_tao);
                        count_2.setImageResource(R.drawable.dem_tao);
                        count_3.setImageResource(R.drawable.dem_tao);
                        count_4.setImageResource(R.drawable.dem_tao);
                        count_5.setImageResource(R.drawable.dem_tao);
                        count_6.setImageResource(R.drawable.dem_tao);
                        count_7.setImageResource(R.drawable.dem_tao);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_tao);
                        question_sound = MediaPlayer.create(this,R.raw.tao);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.tao);
                                question_sound.start();
                            }
                        });
                        break;
                    case 8:
                        count_1.setImageResource(R.drawable.dem_hoa);
                        count_2.setImageResource(R.drawable.dem_hoa);
                        count_3.setImageResource(R.drawable.dem_hoa);
                        count_4.setImageResource(R.drawable.dem_hoa);
                        count_5.setImageResource(R.drawable.dem_hoa);
                        count_6.setImageResource(R.drawable.dem_hoa);
                        count_7.setImageResource(R.drawable.dem_hoa);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_hoa);
                        question_sound = MediaPlayer.create(this,R.raw.hoa);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.hoa);
                                question_sound.start();
                            }
                        });
                        break;
                    case 9:
                        count_1.setImageResource(R.drawable.dem_o);
                        count_2.setImageResource(R.drawable.dem_o);
                        count_3.setImageResource(R.drawable.dem_o);
                        count_4.setImageResource(R.drawable.dem_o);
                        count_5.setImageResource(R.drawable.dem_o);
                        count_6.setImageResource(R.drawable.dem_o);
                        count_7.setImageResource(R.drawable.dem_o);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_o);
                        question_sound = MediaPlayer.create(this, o);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(), o);
                                question_sound.start();
                            }
                        });
                        break;
                    case 10:
                        count_1.setImageResource(R.drawable.dem_oto);
                        count_2.setImageResource(R.drawable.dem_oto);
                        count_3.setImageResource(R.drawable.dem_oto);
                        count_4.setImageResource(R.drawable.dem_oto);
                        count_5.setImageResource(R.drawable.dem_oto);
                        count_6.setImageResource(R.drawable.dem_oto);
                        count_7.setImageResource(R.drawable.dem_oto);
                        count_8.setImageResource(R.drawable.dem_trong);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_oto);
                        question_sound = MediaPlayer.create(this,R.raw.oto);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.oto);
                                question_sound.start();
                            }
                        });
                        break;
                }
                choose_1.setImageResource(R.drawable.so_4);
                choose_2.setImageResource(R.drawable.so_7);
                choose_3.setImageResource(R.drawable.so_3);
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(4,7, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7,7, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(3,7, heart);
                    }
                });
                break;
            case 8:
                r1 = new Random();
                n1 = r1.nextInt(9); n1++;
                switch (n1){
                    case 1:
                        count_1.setImageResource(R.drawable.dem_dau);
                        count_2.setImageResource(R.drawable.dem_dau);
                        count_3.setImageResource(R.drawable.dem_dau);
                        count_4.setImageResource(R.drawable.dem_dau);
                        count_5.setImageResource(R.drawable.dem_dau);
                        count_6.setImageResource(R.drawable.dem_dau);
                        count_7.setImageResource(R.drawable.dem_dau);
                        count_8.setImageResource(R.drawable.dem_dau);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 2:
                        count_1.setImageResource(R.drawable.dem_carot);
                        count_2.setImageResource(R.drawable.dem_carot);
                        count_3.setImageResource(R.drawable.dem_carot);
                        count_4.setImageResource(R.drawable.dem_carot);
                        count_5.setImageResource(R.drawable.dem_carot);
                        count_6.setImageResource(R.drawable.dem_carot);
                        count_7.setImageResource(R.drawable.dem_carot);
                        count_8.setImageResource(R.drawable.dem_carot);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_carot);
                        question_sound = MediaPlayer.create(this,R.raw.carot);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.carot);
                                question_sound.start();
                            }
                        });
                        break;
                    case 3:
                        count_1.setImageResource(R.drawable.dem_chim);
                        count_2.setImageResource(R.drawable.dem_chim);
                        count_3.setImageResource(R.drawable.dem_chim);
                        count_4.setImageResource(R.drawable.dem_chim);
                        count_5.setImageResource(R.drawable.dem_chim);
                        count_6.setImageResource(R.drawable.dem_chim);
                        count_7.setImageResource(R.drawable.dem_chim);
                        count_8.setImageResource(R.drawable.dem_chim);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_chim);
                        question_sound = MediaPlayer.create(this,R.raw.chim);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.chim);
                                question_sound.start();
                            }
                        });
                        break;
                    case 4:
                        count_1.setImageResource(R.drawable.dem_dua);
                        count_2.setImageResource(R.drawable.dem_dua);
                        count_3.setImageResource(R.drawable.dem_dua);
                        count_4.setImageResource(R.drawable.dem_dua);
                        count_5.setImageResource(R.drawable.dem_dua);
                        count_6.setImageResource(R.drawable.dem_dua);
                        count_7.setImageResource(R.drawable.dem_dua);
                        count_8.setImageResource(R.drawable.dem_dua);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua);
                        question_sound = MediaPlayer.create(this,R.raw.dua);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                                question_sound.start();
                            }
                        });
                        break;
                    case 5:
                        count_1.setImageResource(R.drawable.dem_den);
                        count_2.setImageResource(R.drawable.dem_den);
                        count_3.setImageResource(R.drawable.dem_den);
                        count_4.setImageResource(R.drawable.dem_den);
                        count_5.setImageResource(R.drawable.dem_den);
                        count_6.setImageResource(R.drawable.dem_den);
                        count_7.setImageResource(R.drawable.dem_den);
                        count_8.setImageResource(R.drawable.dem_den);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_den);
                        question_sound = MediaPlayer.create(this,R.raw.den);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.den);
                                question_sound.start();
                            }
                        });
                        break;
                    case 6:
                        count_1.setImageResource(R.drawable.dem_dua_hau);
                        count_2.setImageResource(R.drawable.dem_dua_hau);
                        count_3.setImageResource(R.drawable.dem_dua_hau);
                        count_4.setImageResource(R.drawable.dem_dua_hau);
                        count_5.setImageResource(R.drawable.dem_dua_hau);
                        count_6.setImageResource(R.drawable.dem_dua_hau);
                        count_7.setImageResource(R.drawable.dem_dua_hau);
                        count_8.setImageResource(R.drawable.dem_dua_hau);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua_hau);
                        question_sound = MediaPlayer.create(this,R.raw.dua_hau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua_hau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 7:
                        count_1.setImageResource(R.drawable.dem_tao);
                        count_2.setImageResource(R.drawable.dem_tao);
                        count_3.setImageResource(R.drawable.dem_tao);
                        count_4.setImageResource(R.drawable.dem_tao);
                        count_5.setImageResource(R.drawable.dem_tao);
                        count_6.setImageResource(R.drawable.dem_tao);
                        count_7.setImageResource(R.drawable.dem_tao);
                        count_8.setImageResource(R.drawable.dem_tao);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_tao);
                        question_sound = MediaPlayer.create(this,R.raw.tao);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.tao);
                                question_sound.start();
                            }
                        });
                        break;
                    case 8:
                        count_1.setImageResource(R.drawable.dem_hoa);
                        count_2.setImageResource(R.drawable.dem_hoa);
                        count_3.setImageResource(R.drawable.dem_hoa);
                        count_4.setImageResource(R.drawable.dem_hoa);
                        count_5.setImageResource(R.drawable.dem_hoa);
                        count_6.setImageResource(R.drawable.dem_hoa);
                        count_7.setImageResource(R.drawable.dem_hoa);
                        count_8.setImageResource(R.drawable.dem_hoa);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_hoa);
                        question_sound = MediaPlayer.create(this,R.raw.hoa);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.hoa);
                                question_sound.start();
                            }
                        });
                        break;
                    case 9:
                        count_1.setImageResource(R.drawable.dem_o);
                        count_2.setImageResource(R.drawable.dem_o);
                        count_3.setImageResource(R.drawable.dem_o);
                        count_4.setImageResource(R.drawable.dem_o);
                        count_5.setImageResource(R.drawable.dem_o);
                        count_6.setImageResource(R.drawable.dem_o);
                        count_7.setImageResource(R.drawable.dem_o);
                        count_8.setImageResource(R.drawable.dem_o);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_o);
                        question_sound = MediaPlayer.create(this, o);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(), o);
                                question_sound.start();
                            }
                        });
                        break;
                    case 10:
                        count_1.setImageResource(R.drawable.dem_oto);
                        count_2.setImageResource(R.drawable.dem_oto);
                        count_3.setImageResource(R.drawable.dem_oto);
                        count_4.setImageResource(R.drawable.dem_oto);
                        count_5.setImageResource(R.drawable.dem_oto);
                        count_6.setImageResource(R.drawable.dem_oto);
                        count_7.setImageResource(R.drawable.dem_oto);
                        count_8.setImageResource(R.drawable.dem_oto);
                        count_9.setImageResource(R.drawable.dem_trong);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_oto);
                        question_sound = MediaPlayer.create(this,R.raw.oto);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.oto);
                                question_sound.start();
                            }
                        });
                        break;
                }
                choose_1.setImageResource(R.drawable.so_7);
                choose_2.setImageResource(R.drawable.so_8);
                choose_3.setImageResource(R.drawable.so_6);
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(7,8, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8,8, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(6,8, heart);
                    }
                });
                break;
            case 9:
                r1 = new Random();
                n1 = r1.nextInt(9); n1++;
                switch (n1){
                    case 1:
                        count_1.setImageResource(R.drawable.dem_dau);
                        count_2.setImageResource(R.drawable.dem_dau);
                        count_3.setImageResource(R.drawable.dem_dau);
                        count_4.setImageResource(R.drawable.dem_dau);
                        count_5.setImageResource(R.drawable.dem_dau);
                        count_6.setImageResource(R.drawable.dem_dau);
                        count_7.setImageResource(R.drawable.dem_dau);
                        count_8.setImageResource(R.drawable.dem_dau);
                        count_9.setImageResource(R.drawable.dem_dau);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 2:
                        count_1.setImageResource(R.drawable.dem_carot);
                        count_2.setImageResource(R.drawable.dem_carot);
                        count_3.setImageResource(R.drawable.dem_carot);
                        count_4.setImageResource(R.drawable.dem_carot);
                        count_5.setImageResource(R.drawable.dem_carot);
                        count_6.setImageResource(R.drawable.dem_carot);
                        count_7.setImageResource(R.drawable.dem_carot);
                        count_8.setImageResource(R.drawable.dem_carot);
                        count_9.setImageResource(R.drawable.dem_carot);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_carot);
                        question_sound = MediaPlayer.create(this,R.raw.carot);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.carot);
                                question_sound.start();
                            }
                        });
                        break;
                    case 3:
                        count_1.setImageResource(R.drawable.dem_chim);
                        count_2.setImageResource(R.drawable.dem_chim);
                        count_3.setImageResource(R.drawable.dem_chim);
                        count_4.setImageResource(R.drawable.dem_chim);
                        count_5.setImageResource(R.drawable.dem_chim);
                        count_6.setImageResource(R.drawable.dem_chim);
                        count_7.setImageResource(R.drawable.dem_chim);
                        count_8.setImageResource(R.drawable.dem_chim);
                        count_9.setImageResource(R.drawable.dem_chim);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_chim);
                        question_sound = MediaPlayer.create(this,R.raw.chim);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.chim);
                                question_sound.start();
                            }
                        });
                        break;
                    case 4:
                        count_1.setImageResource(R.drawable.dem_dua);
                        count_2.setImageResource(R.drawable.dem_dua);
                        count_3.setImageResource(R.drawable.dem_dua);
                        count_4.setImageResource(R.drawable.dem_dua);
                        count_5.setImageResource(R.drawable.dem_dua);
                        count_6.setImageResource(R.drawable.dem_dua);
                        count_7.setImageResource(R.drawable.dem_dua);
                        count_8.setImageResource(R.drawable.dem_dua);
                        count_9.setImageResource(R.drawable.dem_dua);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua);
                        question_sound = MediaPlayer.create(this,R.raw.dua);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                                question_sound.start();
                            }
                        });
                        break;
                    case 5:
                        count_1.setImageResource(R.drawable.dem_den);
                        count_2.setImageResource(R.drawable.dem_den);
                        count_3.setImageResource(R.drawable.dem_den);
                        count_4.setImageResource(R.drawable.dem_den);
                        count_5.setImageResource(R.drawable.dem_den);
                        count_6.setImageResource(R.drawable.dem_den);
                        count_7.setImageResource(R.drawable.dem_den);
                        count_8.setImageResource(R.drawable.dem_den);
                        count_9.setImageResource(R.drawable.dem_den);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_den);
                        question_sound = MediaPlayer.create(this,R.raw.den);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.den);
                                question_sound.start();
                            }
                        });
                        break;
                    case 6:
                        count_1.setImageResource(R.drawable.dem_dua_hau);
                        count_2.setImageResource(R.drawable.dem_dua_hau);
                        count_3.setImageResource(R.drawable.dem_dua_hau);
                        count_4.setImageResource(R.drawable.dem_dua_hau);
                        count_5.setImageResource(R.drawable.dem_dua_hau);
                        count_6.setImageResource(R.drawable.dem_dua_hau);
                        count_7.setImageResource(R.drawable.dem_dua_hau);
                        count_8.setImageResource(R.drawable.dem_dua_hau);
                        count_9.setImageResource(R.drawable.dem_dua_hau);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua_hau);
                        question_sound = MediaPlayer.create(this,R.raw.dua_hau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua_hau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 7:
                        count_1.setImageResource(R.drawable.dem_tao);
                        count_2.setImageResource(R.drawable.dem_tao);
                        count_3.setImageResource(R.drawable.dem_tao);
                        count_4.setImageResource(R.drawable.dem_tao);
                        count_5.setImageResource(R.drawable.dem_tao);
                        count_6.setImageResource(R.drawable.dem_tao);
                        count_7.setImageResource(R.drawable.dem_tao);
                        count_8.setImageResource(R.drawable.dem_tao);
                        count_9.setImageResource(R.drawable.dem_tao);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_tao);
                        question_sound = MediaPlayer.create(this,R.raw.tao);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.tao);
                                question_sound.start();
                            }
                        });
                        break;
                    case 8:
                        count_1.setImageResource(R.drawable.dem_hoa);
                        count_2.setImageResource(R.drawable.dem_hoa);
                        count_3.setImageResource(R.drawable.dem_hoa);
                        count_4.setImageResource(R.drawable.dem_hoa);
                        count_5.setImageResource(R.drawable.dem_hoa);
                        count_6.setImageResource(R.drawable.dem_hoa);
                        count_7.setImageResource(R.drawable.dem_hoa);
                        count_8.setImageResource(R.drawable.dem_hoa);
                        count_9.setImageResource(R.drawable.dem_hoa);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_hoa);
                        question_sound = MediaPlayer.create(this,R.raw.hoa);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.hoa);
                                question_sound.start();
                            }
                        });
                        break;
                    case 9:
                        count_1.setImageResource(R.drawable.dem_o);
                        count_2.setImageResource(R.drawable.dem_o);
                        count_3.setImageResource(R.drawable.dem_o);
                        count_4.setImageResource(R.drawable.dem_o);
                        count_5.setImageResource(R.drawable.dem_o);
                        count_6.setImageResource(R.drawable.dem_o);
                        count_7.setImageResource(R.drawable.dem_o);
                        count_8.setImageResource(R.drawable.dem_o);
                        count_9.setImageResource(R.drawable.dem_o);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_o);
                        question_sound = MediaPlayer.create(this, o);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(), o);
                                question_sound.start();
                            }
                        });
                        break;
                    case 10:
                        count_1.setImageResource(R.drawable.dem_oto);
                        count_2.setImageResource(R.drawable.dem_oto);
                        count_3.setImageResource(R.drawable.dem_oto);
                        count_4.setImageResource(R.drawable.dem_oto);
                        count_5.setImageResource(R.drawable.dem_oto);
                        count_6.setImageResource(R.drawable.dem_oto);
                        count_7.setImageResource(R.drawable.dem_oto);
                        count_8.setImageResource(R.drawable.dem_oto);
                        count_9.setImageResource(R.drawable.dem_oto);
                        count_10.setImageResource(R.drawable.dem_trong);
                        question.setImageResource(R.drawable.cau_hoi_dem_oto);
                        question_sound = MediaPlayer.create(this,R.raw.oto);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.oto);
                                question_sound.start();
                            }
                        });
                        break;
                }
                choose_1.setImageResource(R.drawable.so_9);
                choose_2.setImageResource(R.drawable.so_8);
                choose_3.setImageResource(R.drawable.so_10);
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(9,9, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(8,9, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10,9, heart);
                    }
                });
                break;
            case 10:
                r1 = new Random();
                n1 = r1.nextInt(9); n1++;
                switch (n1){
                    case 1:
                        count_1.setImageResource(R.drawable.dem_dau);
                        count_2.setImageResource(R.drawable.dem_dau);
                        count_3.setImageResource(R.drawable.dem_dau);
                        count_4.setImageResource(R.drawable.dem_dau);
                        count_5.setImageResource(R.drawable.dem_dau);
                        count_6.setImageResource(R.drawable.dem_dau);
                        count_7.setImageResource(R.drawable.dem_dau);
                        count_8.setImageResource(R.drawable.dem_dau);
                        count_9.setImageResource(R.drawable.dem_dau);
                        count_10.setImageResource(R.drawable.dem_dau);
                        question.setImageResource(R.drawable.cau_hoi_dem_dau);
                        question_sound = MediaPlayer.create(this,R.raw.dau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 2:
                        count_1.setImageResource(R.drawable.dem_carot);
                        count_2.setImageResource(R.drawable.dem_carot);
                        count_3.setImageResource(R.drawable.dem_carot);
                        count_4.setImageResource(R.drawable.dem_carot);
                        count_5.setImageResource(R.drawable.dem_carot);
                        count_6.setImageResource(R.drawable.dem_carot);
                        count_7.setImageResource(R.drawable.dem_carot);
                        count_8.setImageResource(R.drawable.dem_carot);
                        count_9.setImageResource(R.drawable.dem_carot);
                        count_10.setImageResource(R.drawable.dem_carot);
                        question.setImageResource(R.drawable.cau_hoi_dem_carot);
                        question_sound = MediaPlayer.create(this,R.raw.carot);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.carot);
                                question_sound.start();
                            }
                        });
                        break;
                    case 3:
                        count_1.setImageResource(R.drawable.dem_chim);
                        count_2.setImageResource(R.drawable.dem_chim);
                        count_3.setImageResource(R.drawable.dem_chim);
                        count_4.setImageResource(R.drawable.dem_chim);
                        count_5.setImageResource(R.drawable.dem_chim);
                        count_6.setImageResource(R.drawable.dem_chim);
                        count_7.setImageResource(R.drawable.dem_chim);
                        count_8.setImageResource(R.drawable.dem_chim);
                        count_9.setImageResource(R.drawable.dem_chim);
                        count_10.setImageResource(R.drawable.dem_chim);
                        question.setImageResource(R.drawable.cau_hoi_dem_chim);
                        question_sound = MediaPlayer.create(this,R.raw.chim);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.chim);
                                question_sound.start();
                            }
                        });
                        break;
                    case 4:
                        count_1.setImageResource(R.drawable.dem_dua);
                        count_2.setImageResource(R.drawable.dem_dua);
                        count_3.setImageResource(R.drawable.dem_dua);
                        count_4.setImageResource(R.drawable.dem_dua);
                        count_5.setImageResource(R.drawable.dem_dua);
                        count_6.setImageResource(R.drawable.dem_dua);
                        count_7.setImageResource(R.drawable.dem_dua);
                        count_8.setImageResource(R.drawable.dem_dua);
                        count_9.setImageResource(R.drawable.dem_dua);
                        count_10.setImageResource(R.drawable.dem_dua);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua);
                        question_sound = MediaPlayer.create(this,R.raw.dua);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua);
                                question_sound.start();
                            }
                        });
                        break;
                    case 5:
                        count_1.setImageResource(R.drawable.dem_den);
                        count_2.setImageResource(R.drawable.dem_den);
                        count_3.setImageResource(R.drawable.dem_den);
                        count_4.setImageResource(R.drawable.dem_den);
                        count_5.setImageResource(R.drawable.dem_den);
                        count_6.setImageResource(R.drawable.dem_den);
                        count_7.setImageResource(R.drawable.dem_den);
                        count_8.setImageResource(R.drawable.dem_den);
                        count_9.setImageResource(R.drawable.dem_den);
                        count_10.setImageResource(R.drawable.dem_den);
                        question.setImageResource(R.drawable.cau_hoi_dem_den);
                        question_sound = MediaPlayer.create(this,R.raw.den);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.den);
                                question_sound.start();
                            }
                        });
                        break;
                    case 6:
                        count_1.setImageResource(R.drawable.dem_dua_hau);
                        count_2.setImageResource(R.drawable.dem_dua_hau);
                        count_3.setImageResource(R.drawable.dem_dua_hau);
                        count_4.setImageResource(R.drawable.dem_dua_hau);
                        count_5.setImageResource(R.drawable.dem_dua_hau);
                        count_6.setImageResource(R.drawable.dem_dua_hau);
                        count_7.setImageResource(R.drawable.dem_dua_hau);
                        count_8.setImageResource(R.drawable.dem_dua_hau);
                        count_9.setImageResource(R.drawable.dem_dua_hau);
                        count_10.setImageResource(R.drawable.dem_dua_hau);
                        question.setImageResource(R.drawable.cau_hoi_dem_dua_hau);
                        question_sound = MediaPlayer.create(this,R.raw.dua_hau);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.dua_hau);
                                question_sound.start();
                            }
                        });
                        break;
                    case 7:
                        count_1.setImageResource(R.drawable.dem_tao);
                        count_2.setImageResource(R.drawable.dem_tao);
                        count_3.setImageResource(R.drawable.dem_tao);
                        count_4.setImageResource(R.drawable.dem_tao);
                        count_5.setImageResource(R.drawable.dem_tao);
                        count_6.setImageResource(R.drawable.dem_tao);
                        count_7.setImageResource(R.drawable.dem_tao);
                        count_8.setImageResource(R.drawable.dem_tao);
                        count_9.setImageResource(R.drawable.dem_tao);
                        count_10.setImageResource(R.drawable.dem_tao);
                        question.setImageResource(R.drawable.cau_hoi_dem_tao);
                        question_sound = MediaPlayer.create(this,R.raw.tao);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.tao);
                                question_sound.start();
                            }
                        });
                        break;
                    case 8:
                        count_1.setImageResource(R.drawable.dem_hoa);
                        count_2.setImageResource(R.drawable.dem_hoa);
                        count_3.setImageResource(R.drawable.dem_hoa);
                        count_4.setImageResource(R.drawable.dem_hoa);
                        count_5.setImageResource(R.drawable.dem_hoa);
                        count_6.setImageResource(R.drawable.dem_hoa);
                        count_7.setImageResource(R.drawable.dem_hoa);
                        count_8.setImageResource(R.drawable.dem_hoa);
                        count_9.setImageResource(R.drawable.dem_hoa);
                        count_10.setImageResource(R.drawable.dem_hoa);
                        question.setImageResource(R.drawable.cau_hoi_dem_hoa);
                        question_sound = MediaPlayer.create(this,R.raw.hoa);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.hoa);
                                question_sound.start();
                            }
                        });
                        break;
                    case 9:
                        count_1.setImageResource(R.drawable.dem_o);
                        count_2.setImageResource(R.drawable.dem_o);
                        count_3.setImageResource(R.drawable.dem_o);
                        count_4.setImageResource(R.drawable.dem_o);
                        count_5.setImageResource(R.drawable.dem_o);
                        count_6.setImageResource(R.drawable.dem_o);
                        count_7.setImageResource(R.drawable.dem_o);
                        count_8.setImageResource(R.drawable.dem_o);
                        count_9.setImageResource(R.drawable.dem_o);
                        count_10.setImageResource(R.drawable.dem_o);
                        question.setImageResource(R.drawable.cau_hoi_dem_o);
                        question_sound = MediaPlayer.create(this, o);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(), o);
                                question_sound.start();
                            }
                        });
                        break;
                    case 10:
                        count_1.setImageResource(R.drawable.dem_oto);
                        count_2.setImageResource(R.drawable.dem_oto);
                        count_3.setImageResource(R.drawable.dem_oto);
                        count_4.setImageResource(R.drawable.dem_oto);
                        count_5.setImageResource(R.drawable.dem_oto);
                        count_6.setImageResource(R.drawable.dem_oto);
                        count_7.setImageResource(R.drawable.dem_oto);
                        count_8.setImageResource(R.drawable.dem_oto);
                        count_9.setImageResource(R.drawable.dem_oto);
                        count_10.setImageResource(R.drawable.dem_oto);
                        question.setImageResource(R.drawable.cau_hoi_dem_oto);
                        question_sound = MediaPlayer.create(this,R.raw.oto);
                        question_sound.start();
                        cat.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                question_sound = MediaPlayer.create(getApplicationContext(),R.raw.oto);
                                question_sound.start();
                            }
                        });
                        break;
                }
                choose_1.setImageResource(R.drawable.so_10);
                choose_2.setImageResource(R.drawable.so_2);
                choose_3.setImageResource(R.drawable.so_1);
                choose_1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(10,10, heart);
                    }
                });
                choose_2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(2,10, heart);
                    }
                });
                choose_3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        checkAnswer(1,10, heart);
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
            checkHeart(heart);
            final int finalHeart = heart;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    Intent screen_play = new Intent(Main3Activity.this, Main3Activity.class);
                    screen_play.putExtra("heart", finalHeart);
                    startActivity(screen_play);
                }
            };
            Handler handler = new android.os.Handler();
            handler.postDelayed(runnable, 4000);
        }
        else {
            result_sound = MediaPlayer.create(this,R.raw.sai);
            result_sound.start();
        }
    }
    public void checkHeart(int heart){
        ImageView heart_1, heart_2;
        heart_1 = (ImageView)findViewById(R.id.count_1);
        heart_2 = (ImageView)findViewById(R.id.count_2);
        while (heart > 0){
            int count = heart % 10;

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
            heart = heart / 10;
        }
    }
}
