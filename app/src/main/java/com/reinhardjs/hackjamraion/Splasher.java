package com.reinhardjs.hackjamraion;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splasher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splasher);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
        Intent intent = new Intent(Splasher.this, MainActivity.class);
        startActivity(intent);
        finish();
            }
        }, 5000);
    }
}
