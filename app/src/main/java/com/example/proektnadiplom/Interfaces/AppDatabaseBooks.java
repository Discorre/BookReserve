
package com.example.proektnadiplom.Interfaces;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Book.class}, version = 1)
public abstract class AppDatabaseBooks extends RoomDatabase {
    public abstract BookDao getBookDao();
}

