package com.k63b.kid_game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

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
                Intent screen_play = new Intent(MainActivity.this, Main4Activity.class);
                screen_play.putExtra("heart",0);
                startActivity(screen_play);

            }
        });
    }
}
