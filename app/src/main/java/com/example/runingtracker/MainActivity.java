package com.example.runingtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static final int PERMISSION_GPS_CODE = 1;
    private static final int PERMISSION_COAL_GPS_CODE = 2;

    Button RecordBtn , JourneyBtn, StatBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecordBtn = findViewById(R.id.RecordBtn);
        JourneyBtn = findViewById(R.id.JourneyBtn);
        StatBtn = findViewById(R.id.StatBtn);

        RecordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent journey = new Intent(MainActivity.this, RecordJourney.class);
                startActivity(journey);
            }
        });

        JourneyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent View = new Intent(MainActivity.this, ViewJourneys.class);
                startActivity(View);
            }
        });

        StatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stats = new Intent(MainActivity.this, StatisticsActivity.class);
                startActivity(stats);
            }
        });
    }

}
