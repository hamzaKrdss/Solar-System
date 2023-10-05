package com.example.solarexplore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity
{
    LinearLayout gunes,merkur,venus,dunya,mars,jupiter,saturn,uranus,neptun;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        gunes = findViewById(R.id.gunes);
        merkur = findViewById(R.id.merkur);
        venus = findViewById(R.id.venus);
        dunya = findViewById(R.id.dunya);
        mars = findViewById(R.id.mars);
        jupiter = findViewById(R.id.jupiter);
        saturn = findViewById(R.id.saturn);
        uranus = findViewById(R.id.uranus);
        neptun = findViewById(R.id.neptun);

        gunes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(HomeActivity.this, Gunes.class);
                startActivity(intent);

            }
        });
        merkur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(HomeActivity.this, Merkur.class);
                startActivity(intent);
            }
        });
        venus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(HomeActivity.this, Venus.class);
                startActivity(intent);
            }
        });
        dunya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(HomeActivity.this,Dunya.class);
                startActivity(intent);
            }
        });
        mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(HomeActivity.this, Mars.class);
                startActivity(intent);
            }
        });
        jupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(HomeActivity.this,Jupiter.class);
                startActivity(intent);
            }
        });
        saturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(HomeActivity.this, Saturn.class);
                startActivity(intent);
            }
        });
        uranus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(HomeActivity.this, Uranus.class);
                startActivity(intent);
            }
        });
        neptun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(HomeActivity.this, Neptun.class);
                startActivity(intent);
            }
        });


    }

}
