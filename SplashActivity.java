package com.example.nutrition_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
    Handler splashHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashHandler.postDelayed(splashRunnable, 2000);
    }
    Runnable splashRunnable = new Runnable() {
        @Override
        public void run() {
            try{
                //start NavActivity
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                //close SplashActivity
                finish();
            }catch (Exception e){}
        }
    };
}
