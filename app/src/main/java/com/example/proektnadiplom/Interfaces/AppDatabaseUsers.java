package com.example.proektnadiplom.Interfaces;

import androidx.room.Database;

import androidx.room.RoomDatabase;

@Database(entities = {Users.class}, version = 1)
public abstract class AppDatabaseUsers extends RoomDatabase {
    public abstract UsersDao getUserDao();
}
