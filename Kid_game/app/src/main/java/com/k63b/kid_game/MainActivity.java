package com.k63b.kid_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (ImageView)findViewById(R.id.btn_play);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int n = r.nextInt(5);
                if(n%2 == 0){
                    Intent screen_play = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(screen_play);
                }else{
                    Intent screen_play = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(screen_play);
                }
            }
        });
    }
}
