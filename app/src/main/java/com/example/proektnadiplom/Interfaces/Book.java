package com.example.proektnadiplom.Interfaces;


import androidx.annotation.NonNull;
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

   /* @NonNull
    @PrimaryKey
    private String title;
    private String description;

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }*/

}
