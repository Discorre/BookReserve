package com.example.proektnadiplom.Interfaces;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public interface Users {

    @PrimaryKey(autoGenerate = true)
    long id = 0;

    @NonNull
    @ColumnInfo(name = "full_name")
    String name = "";

    @NonNull
    @ColumnInfo(name = "famile")
    String famile = "";

    @NonNull
    @ColumnInfo(name = "surname")
    String surname = "";

    @NonNull
    @ColumnInfo(name = "numpass")
    int numpass = 0;

    @NonNull
    @ColumnInfo(name = "birthday")
    int birthday = 0;
}
