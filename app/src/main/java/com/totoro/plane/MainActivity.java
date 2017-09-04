package com.totoro.plane;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * 启动页
 */
public class MainActivity extends Activity {

    Button btn_start_game;
    Button btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.iv_plane);
        AnimationDrawable drawable = (AnimationDrawable) view.getBackground();
        drawable.start();

        btn_start_game = (Button) findViewById(R.id.btnGame);
        btn_exit = (Button) findViewById(R.id.btn_exit);

        btn_start_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startGame();
            }
        });

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exitGame();
            }
        });
    }


    public void startGame() {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    public void exitGame() {
        MainActivity.this.finish();
    }
}