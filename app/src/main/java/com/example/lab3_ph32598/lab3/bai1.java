package com.example.lab3_ph32598.lab3;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lab3_ph32598.R;

public class bai1 extends ComponentActivity {
    TextView tv1 , tv2 , tv3 , tv4 , tv5 , tv6;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        tv1 = findViewById(R.id.bai1tv1);
        tv2 = findViewById(R.id.bai1tv2);
        tv3 = findViewById(R.id.bai1tv3);
        tv4 = findViewById(R.id.bai1tv4);
        tv5 = findViewById(R.id.bai1tv5);
        tv6 = findViewById(R.id.bai1tv6);
    }
}