package com.example.lifehacks;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3500;
    ImageView ivLogo;
    TextView tvLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ivLogo = findViewById(R.id.iv_logo);
        tvLogo = findViewById(R.id.tv_logo);

        Animator translateAnimator = AnimatorInflater.loadAnimator(this, R.animator.translate);
        translateAnimator.setTarget(ivLogo);
        translateAnimator.start();

        Animator fadeAnimator = AnimatorInflater.loadAnimator(this, R.animator.alpha);
        fadeAnimator.setTarget(tvLogo);
        fadeAnimator.start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(SplashScreenActivity.this, CategoriesActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
