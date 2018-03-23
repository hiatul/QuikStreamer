package com.example.nishant.ouikstreamer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tap_New_Broadcaster extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(Color.parseColor("#000000"));
        getWindow().setStatusBarColor(Color.parseColor("#000000"));

        setContentView(R.layout.activity_tap__new__broadcaster);

        // getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
    }
}
