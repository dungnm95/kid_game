package com.k63b.kid_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main4Activity extends AppCompatActivity {
    ImageView type1, type2, back;
    ImageView cat = (ImageView)findViewById(R.id.cat);
    MediaPlayer type1_sound, type2_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        type1 = (ImageView)findViewById(R.id.type1);
        type2 = (ImageView)findViewById(R.id.type2);

        type1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cat.setImageResource(R.drawable.trai);
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        Intent screen_play = new Intent(Main4Activity.this, Main5Activity.class);
                        screen_play.putExtra("tim",0);
                        startActivity(screen_play);
                    }
                };
                Handler handler = new android.os.Handler();
                handler.postDelayed(runnable, 4000);


            }
        });
        type2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cat.setImageResource(R.drawable.phai);
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        Intent screen_play = new Intent(Main4Activity.this, Main3Activity.class);
                        screen_play.putExtra("tim",0);
                        startActivity(screen_play);
                    }
                };
                Handler handler = new android.os.Handler();
                handler.postDelayed(runnable, 4000);

            }
        });
        back = (ImageView)findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent screen_back = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(screen_back);
            }
        });
    }
}
