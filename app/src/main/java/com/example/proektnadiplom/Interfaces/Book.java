package com.example.proektnadiplom.Interfaces;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "books")
public interface Book {

    @PrimaryKey(autoGenerate = true)
    long id = 0;


    @ColumnInfo(name = "name")
    String bname = "";


    @ColumnInfo(name = "author")
    String author = "";


    @ColumnInfo(name = "reserve")
    boolean res = false;


}
