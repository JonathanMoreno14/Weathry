package com.example.com.weathry;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valueColorAnimate();
    }


/*
 Gradient color changer
 */
    public  void valueColorAnimate(){
        View v = findViewById(R.id.backcolor);
        ObjectAnimator anim = ObjectAnimator.ofInt(v, "backgroundColor", Color.parseColor("#4fa3fc"), Color.parseColor("#ad4ffc"));
        anim.setDuration(6000);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatCount(ValueAnimator.INFINITE);
        anim.setRepeatMode(ValueAnimator.REVERSE);
        anim.start();
    }
}


/*

 Color.argb(0,206,205,252), Color.argb(0,130,127,250) original colro scheme
 */