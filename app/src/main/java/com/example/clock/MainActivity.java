package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPoland(View view) {
        TextClock clock = findViewById(R.id.selective_clock);
        clock.setTimeZone("Europe/Wroclaw");
    }

    public void onClickJapan(View view) {
        TextClock clock = findViewById(R.id.selective_clock);
        clock.setTimeZone("Asia/Tokyo");
    }

    public void onClickFrance(View view) {
        TextClock clock = findViewById(R.id.selective_clock);
        clock.setTimeZone("Europe/Paris");
    }
}