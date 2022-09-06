package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onClick2(View view) {
        Intent myIntent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(myIntent);
    }

    public void onClick3(View view) {
        Intent myIntent2 = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(myIntent2);
    }
}