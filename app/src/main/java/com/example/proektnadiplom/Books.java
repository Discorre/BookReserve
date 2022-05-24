package com.example.proektnadiplom;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Books extends AppCompatActivity {
    private String name;
    private String author;
    private boolean res = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mybookslist);
    }



    public Books(String name, String author){//, int bookRecourse) {
        this.name = name;
        this.author = author;

    }

    public static Books get(int position) {
        return Books.get(position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
