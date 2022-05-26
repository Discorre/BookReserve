package com.example.proektnadiplom;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    static Button myBooks, initBooks, myDetails, newDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBooks = findViewById(R.id.mybooks);
        myBooks.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
        initBooks = findViewById(R.id.initbooks);
        initBooks.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BookAdapter.class);
            startActivity(intent);
        });
        myDetails = findViewById(R.id.mydetails);
        /*myDetails.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MyDetails.class);
            startActivity(intent);
        });*/
        newDetails = findViewById(R.id.newdetails);
        newDetails.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NewDetails.class);
            startActivity(intent);
        });


    }
}

