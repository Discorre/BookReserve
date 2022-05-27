package com.example.proektnadiplom;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelperBooks extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "library";
    private static final String COLUMN_TITLE = "title";
    private static final String COLUMN_AUTHOR = "author";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_RESERVER = "reserver";
    public static final String TABLE = "books";
    private static final int SCHEMA = 1;

    public DatabaseHelperBooks(@Nullable Context context) {
        super(context, DATABASE_NAME, null, SCHEMA);
    }

    @Override
    public void onCreate(SQLiteDatabase library) {
        library.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE
                + " ( " + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_TITLE + " TEXT NOT NULL, "
                + COLUMN_AUTHOR + " TEXT NOT NULL, "
                + COLUMN_RESERVER + "TEXT" + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase library, int oldVersion, int newVersion) {
        library.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(library);
    }
}
