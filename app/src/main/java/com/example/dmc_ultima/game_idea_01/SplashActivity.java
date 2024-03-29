package com.example.dmc_ultima.game_idea_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this,MainMenuActivity.class);
                SplashActivity.this.startActivity(intent);
                finish();

            }
        }, 2000);
    }
}
