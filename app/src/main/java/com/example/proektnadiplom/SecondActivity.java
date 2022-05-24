package com.example.proektnadiplom;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView mybookName, mybookAuthor, mydeadline;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mybookslist);

        mybookName = findViewById(R.id.mybookName);
        mybookAuthor = findViewById(R.id.mybookAuthor);
        mydeadline = findViewById(R.id.mydeadline);

    }
}
