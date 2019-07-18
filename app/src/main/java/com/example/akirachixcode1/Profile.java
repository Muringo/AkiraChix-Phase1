package com.example.akirachixcode1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    TextView tvName;
    TextView tvTrack;
    TextView tvCountry;
    TextView tvEmail;
    TextView tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tvName = findViewById(R.id.tvName);
        tvTrack = findViewById(R.id.tvTrack);
        tvCountry = findViewById(R.id.tvCountry);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);


    }
}
